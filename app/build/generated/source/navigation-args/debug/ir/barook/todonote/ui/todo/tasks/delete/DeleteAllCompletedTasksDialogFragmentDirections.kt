package ir.barook.todonote.ui.todo.tasks.delete

import androidx.navigation.NavDirections
import ir.barook.todonote.NavGraphDirections

public class DeleteAllCompletedTasksDialogFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalDeleteAllCompletedTasksDialogFragment(): NavDirections =
        NavGraphDirections.actionGlobalDeleteAllCompletedTasksDialogFragment()

    public fun actionGlobalDeleteAllNotes(): NavDirections =
        NavGraphDirections.actionGlobalDeleteAllNotes()
  }
}
