package ir.barook.todonote.ui.todo.tasks

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import ir.barook.todonote.NavGraphDirections
import ir.barook.todonote.R
import ir.barook.todonote.`data`.Task
import java.io.Serializable
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class TasksFragmentDirections private constructor() {
  private data class ActionTasksFragmentToAddEditTaskFragment(
    public val title: String,
    public val task: Task? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_tasksFragment_to_addEditTaskFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Task::class.java)) {
          result.putParcelable("task", this.task as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Task::class.java)) {
          result.putSerializable("task", this.task as Serializable?)
        }
        result.putString("title", this.title)
        return result
      }
  }

  public companion object {
    public fun actionTasksFragmentToAddEditTaskFragment(title: String, task: Task? = null):
        NavDirections = ActionTasksFragmentToAddEditTaskFragment(title, task)

    public fun actionGlobalDeleteAllCompletedTasksDialogFragment(): NavDirections =
        NavGraphDirections.actionGlobalDeleteAllCompletedTasksDialogFragment()

    public fun actionGlobalDeleteAllNotes(): NavDirections =
        NavGraphDirections.actionGlobalDeleteAllNotes()
  }
}
