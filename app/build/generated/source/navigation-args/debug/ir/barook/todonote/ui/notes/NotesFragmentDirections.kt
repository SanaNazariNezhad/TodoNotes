package ir.barook.todonote.ui.notes

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import ir.barook.todonote.NavGraphDirections
import ir.barook.todonote.R
import ir.barook.todonote.`data`.Notes
import java.io.Serializable
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class NotesFragmentDirections private constructor() {
  private data class ActionNotesFragmentToAddEditNoteFragment(
    public val title: String,
    public val Note: Notes? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_notesFragment_to_addEditNoteFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Notes::class.java)) {
          result.putParcelable("Note", this.Note as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Notes::class.java)) {
          result.putSerializable("Note", this.Note as Serializable?)
        }
        result.putString("title", this.title)
        return result
      }
  }

  public companion object {
    public fun actionNotesFragmentToAddEditNoteFragment(title: String, Note: Notes? = null):
        NavDirections = ActionNotesFragmentToAddEditNoteFragment(title, Note)

    public fun actionGlobalDeleteAllCompletedTasksDialogFragment(): NavDirections =
        NavGraphDirections.actionGlobalDeleteAllCompletedTasksDialogFragment()

    public fun actionGlobalDeleteAllNotes(): NavDirections =
        NavGraphDirections.actionGlobalDeleteAllNotes()
  }
}
