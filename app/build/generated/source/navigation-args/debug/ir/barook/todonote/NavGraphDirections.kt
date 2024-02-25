package ir.barook.todonote

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class NavGraphDirections private constructor() {
  public companion object {
    public fun actionGlobalDeleteAllCompletedTasksDialogFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_deleteAllCompletedTasksDialogFragment)

    public fun actionGlobalDeleteAllNotes(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_deleteAllNotes)
  }
}
