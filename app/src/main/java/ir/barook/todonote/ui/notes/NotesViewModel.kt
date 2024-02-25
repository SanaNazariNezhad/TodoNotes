package ir.barook.todonote.ui.notes

import androidx.lifecycle.*
import ir.barook.todonote.ADD_RESULT_OK
import ir.barook.todonote.EDIT_RESULT_OK
import ir.barook.todonote.data.NoteDao
import ir.barook.todonote.data.Notes
import ir.barook.todonote.data.PreferencesManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class NotesViewModel @Inject constructor(
    private val noteDao: NoteDao,
    private val preferencesManager : PreferencesManager,
    private val state : SavedStateHandle
    ): ViewModel(){


    val searchQuery = state.getLiveData("noteSearchQuery", "")

    private val noteEventChannel = Channel<NotesEvent>()
    val noteEvent = noteEventChannel.receiveAsFlow()

    val preferencesFlow = preferencesManager.notesPreferencesFlow

    private val noteFlow = combine(
        searchQuery.asFlow(),
        preferencesFlow
    ){
        query, filterPreferences ->
        Pair(query, filterPreferences)
    }.flatMapLatest {  (query,filterPreferences) ->
        noteDao.getNotes(query,filterPreferences.sortOrder)

    }



    val notes =noteFlow.asLiveData()


    fun onAddNewNoteClick() = viewModelScope.launch {
        noteEventChannel.send(NotesEvent.NavigateToAddScreen)
    }

    fun onAddEditNoteResult(result : Int) {
        when(result){
            ADD_RESULT_OK ->showNoteSavedConfirmationMessage("Note added.")
                EDIT_RESULT_OK -> showNoteSavedConfirmationMessage("Note updated.")
        }
    }

    fun onNoteSelected(note: Notes) = viewModelScope.launch {
        noteEventChannel.send(NotesEvent.NavigateToEditNoteScreen(note))
    }

    fun deleteNote(note: Notes) = viewModelScope.launch {
        noteDao.deleteNote(note)
        noteEventChannel.send(NotesEvent.ShowUndoDeleteNoteMessage(note))
    }

    fun deleteAllNotes() = viewModelScope.launch {
            noteEventChannel.send(NotesEvent.NavigateToDeleteAllScreen)
    }

    private fun showNoteSavedConfirmationMessage(msg : String) = viewModelScope.launch {
        noteEventChannel.send(NotesEvent.ShowNoteSavedConfirmationMessage(msg))
    }

    fun onUndoDeleteClick(note: Notes) = viewModelScope.launch {
        noteDao.insertNote(note)
    }

    sealed class NotesEvent{
        object  NavigateToAddScreen: NotesEvent()
        data class NavigateToEditNoteScreen(val note : Notes) : NotesEvent()
        data class ShowUndoDeleteNoteMessage(val note: Notes): NotesEvent()
        data class ShowNoteSavedConfirmationMessage(val msg : String) : NotesEvent()
        object NavigateToDeleteAllScreen: NotesEvent()


    }

}