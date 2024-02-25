package ir.barook.todonote.ui.notes.edit

import androidx.navigation.NavDirections
import ir.barook.todonote.NavGraphDirections

public class AddEditNoteFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalDeleteAllCompletedTasksDialogFragment(): NavDirections =
        NavGraphDirections.actionGlobalDeleteAllCompletedTasksDialogFragment()

    public fun actionGlobalDeleteAllNotes(): NavDirections =
        NavGraphDirections.actionGlobalDeleteAllNotes()
  }
}
