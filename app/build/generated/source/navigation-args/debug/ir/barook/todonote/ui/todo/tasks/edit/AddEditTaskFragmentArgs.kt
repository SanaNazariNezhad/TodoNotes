package ir.barook.todonote.ui.todo.tasks.edit

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import ir.barook.todonote.`data`.Task
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class AddEditTaskFragmentArgs(
  public val title: String,
  public val task: Task? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Task::class.java)) {
      result.putParcelable("task", this.task as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Task::class.java)) {
      result.putSerializable("task", this.task as Serializable?)
    }
    result.putString("title", this.title)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Task::class.java)) {
      result.set("task", this.task as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Task::class.java)) {
      result.set("task", this.task as Serializable?)
    }
    result.set("title", this.title)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddEditTaskFragmentArgs {
      bundle.setClassLoader(AddEditTaskFragmentArgs::class.java.classLoader)
      val __task : Task?
      if (bundle.containsKey("task")) {
        if (Parcelable::class.java.isAssignableFrom(Task::class.java) ||
            Serializable::class.java.isAssignableFrom(Task::class.java)) {
          __task = bundle.get("task") as Task?
        } else {
          throw UnsupportedOperationException(Task::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __task = null
      }
      val __title : String?
      if (bundle.containsKey("title")) {
        __title = bundle.getString("title")
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      return AddEditTaskFragmentArgs(__title, __task)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AddEditTaskFragmentArgs {
      val __task : Task?
      if (savedStateHandle.contains("task")) {
        if (Parcelable::class.java.isAssignableFrom(Task::class.java) ||
            Serializable::class.java.isAssignableFrom(Task::class.java)) {
          __task = savedStateHandle.get<Task?>("task")
        } else {
          throw UnsupportedOperationException(Task::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __task = null
      }
      val __title : String?
      if (savedStateHandle.contains("title")) {
        __title = savedStateHandle["title"]
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      return AddEditTaskFragmentArgs(__title, __task)
    }
  }
}
