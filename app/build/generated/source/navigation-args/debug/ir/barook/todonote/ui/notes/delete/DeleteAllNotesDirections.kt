package ir.barook.todonote.ui.notes.delete

import androidx.navigation.NavDirections
import ir.barook.todonote.NavGraphDirections

public class DeleteAllNotesDirections private constructor() {
  public companion object {
    public fun actionGlobalDeleteAllCompletedTasksDialogFragment(): NavDirections =
        NavGraphDirections.actionGlobalDeleteAllCompletedTasksDialogFragment()

    public fun actionGlobalDeleteAllNotes(): NavDirections =
        NavGraphDirections.actionGlobalDeleteAllNotes()
  }
}
