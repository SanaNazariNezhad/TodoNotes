package ir.barook.todonote.ui.notes;

import androidx.lifecycle.*;
import ir.barook.todonote.data.NoteDao;
import ir.barook.todonote.data.Notes;
import ir.barook.todonote.data.PreferencesManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001,B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0012J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020 J\u000e\u0010(\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0012J\u000e\u0010)\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0012J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lir/barook/todonote/ui/notes/NotesViewModel;", "Landroidx/lifecycle/ViewModel;", "noteDao", "Lir/barook/todonote/data/NoteDao;", "preferencesManager", "Lir/barook/todonote/data/PreferencesManager;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lir/barook/todonote/data/NoteDao;Lir/barook/todonote/data/PreferencesManager;Landroidx/lifecycle/SavedStateHandle;)V", "noteEvent", "Lkotlinx/coroutines/flow/Flow;", "Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent;", "getNoteEvent", "()Lkotlinx/coroutines/flow/Flow;", "noteEventChannel", "Lkotlinx/coroutines/channels/Channel;", "noteFlow", "", "Lir/barook/todonote/data/Notes;", "notes", "Landroidx/lifecycle/LiveData;", "getNotes", "()Landroidx/lifecycle/LiveData;", "preferencesFlow", "Lir/barook/todonote/data/FilterPreferencesNotes;", "getPreferencesFlow", "searchQuery", "Landroidx/lifecycle/MutableLiveData;", "", "getSearchQuery", "()Landroidx/lifecycle/MutableLiveData;", "deleteAllNotes", "Lkotlinx/coroutines/Job;", "deleteNote", "note", "onAddEditNoteResult", "", "result", "", "onAddNewNoteClick", "onNoteSelected", "onUndoDeleteClick", "showNoteSavedConfirmationMessage", "msg", "NotesEvent", "app_debug"})
public final class NotesViewModel extends androidx.lifecycle.ViewModel {
    private final ir.barook.todonote.data.NoteDao noteDao = null;
    private final ir.barook.todonote.data.PreferencesManager preferencesManager = null;
    private final androidx.lifecycle.SavedStateHandle state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> searchQuery = null;
    private final kotlinx.coroutines.channels.Channel<ir.barook.todonote.ui.notes.NotesViewModel.NotesEvent> noteEventChannel = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<ir.barook.todonote.ui.notes.NotesViewModel.NotesEvent> noteEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<ir.barook.todonote.data.FilterPreferencesNotes> preferencesFlow = null;
    private final kotlinx.coroutines.flow.Flow<java.util.List<ir.barook.todonote.data.Notes>> noteFlow = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<ir.barook.todonote.data.Notes>> notes = null;
    
    @javax.inject.Inject
    public NotesViewModel(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.NoteDao noteDao, @org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.PreferencesManager preferencesManager, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<ir.barook.todonote.ui.notes.NotesViewModel.NotesEvent> getNoteEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<ir.barook.todonote.data.FilterPreferencesNotes> getPreferencesFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<ir.barook.todonote.data.Notes>> getNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onAddNewNoteClick() {
        return null;
    }
    
    public final void onAddEditNoteResult(int result) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onNoteSelected(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.Notes note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteNote(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.Notes note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteAllNotes() {
        return null;
    }
    
    private final kotlinx.coroutines.Job showNoteSavedConfirmationMessage(java.lang.String msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onUndoDeleteClick(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.Notes note) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent;", "", "()V", "NavigateToAddScreen", "NavigateToDeleteAllScreen", "NavigateToEditNoteScreen", "ShowNoteSavedConfirmationMessage", "ShowUndoDeleteNoteMessage", "Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent$NavigateToAddScreen;", "Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent$NavigateToDeleteAllScreen;", "Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent$NavigateToEditNoteScreen;", "Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent$ShowNoteSavedConfirmationMessage;", "Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent$ShowUndoDeleteNoteMessage;", "app_debug"})
    public static abstract class NotesEvent {
        
        private NotesEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent$NavigateToAddScreen;", "Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent;", "()V", "app_debug"})
        public static final class NavigateToAddScreen extends ir.barook.todonote.ui.notes.NotesViewModel.NotesEvent {
            @org.jetbrains.annotations.NotNull
            public static final ir.barook.todonote.ui.notes.NotesViewModel.NotesEvent.NavigateToAddScreen INSTANCE = null;
            
            private NavigateToAddScreen() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent$NavigateToEditNoteScreen;", "Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent;", "note", "Lir/barook/todonote/data/Notes;", "(Lir/barook/todonote/data/Notes;)V", "getNote", "()Lir/barook/todonote/data/Notes;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class NavigateToEditNoteScreen extends ir.barook.todonote.ui.notes.NotesViewModel.NotesEvent {
            @org.jetbrains.annotations.NotNull
            private final ir.barook.todonote.data.Notes note = null;
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.ui.notes.NotesViewModel.NotesEvent.NavigateToEditNoteScreen copy(@org.jetbrains.annotations.NotNull
            ir.barook.todonote.data.Notes note) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public NavigateToEditNoteScreen(@org.jetbrains.annotations.NotNull
            ir.barook.todonote.data.Notes note) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.data.Notes component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.data.Notes getNote() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent$ShowUndoDeleteNoteMessage;", "Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent;", "note", "Lir/barook/todonote/data/Notes;", "(Lir/barook/todonote/data/Notes;)V", "getNote", "()Lir/barook/todonote/data/Notes;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class ShowUndoDeleteNoteMessage extends ir.barook.todonote.ui.notes.NotesViewModel.NotesEvent {
            @org.jetbrains.annotations.NotNull
            private final ir.barook.todonote.data.Notes note = null;
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.ui.notes.NotesViewModel.NotesEvent.ShowUndoDeleteNoteMessage copy(@org.jetbrains.annotations.NotNull
            ir.barook.todonote.data.Notes note) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ShowUndoDeleteNoteMessage(@org.jetbrains.annotations.NotNull
            ir.barook.todonote.data.Notes note) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.data.Notes component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.data.Notes getNote() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent$ShowNoteSavedConfirmationMessage;", "Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent;", "msg", "", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class ShowNoteSavedConfirmationMessage extends ir.barook.todonote.ui.notes.NotesViewModel.NotesEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String msg = null;
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.ui.notes.NotesViewModel.NotesEvent.ShowNoteSavedConfirmationMessage copy(@org.jetbrains.annotations.NotNull
            java.lang.String msg) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ShowNoteSavedConfirmationMessage(@org.jetbrains.annotations.NotNull
            java.lang.String msg) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMsg() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent$NavigateToDeleteAllScreen;", "Lir/barook/todonote/ui/notes/NotesViewModel$NotesEvent;", "()V", "app_debug"})
        public static final class NavigateToDeleteAllScreen extends ir.barook.todonote.ui.notes.NotesViewModel.NotesEvent {
            @org.jetbrains.annotations.NotNull
            public static final ir.barook.todonote.ui.notes.NotesViewModel.NotesEvent.NavigateToDeleteAllScreen INSTANCE = null;
            
            private NavigateToDeleteAllScreen() {
                super();
            }
        }
    }
}