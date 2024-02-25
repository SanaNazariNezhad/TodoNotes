package ir.barook.todonote.ui.notes.edit

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import ir.barook.todonote.`data`.Notes
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class AddEditNoteFragmentArgs(
  public val title: String,
  public val Note: Notes? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Notes::class.java)) {
      result.putParcelable("Note", this.Note as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Notes::class.java)) {
      result.putSerializable("Note", this.Note as Serializable?)
    }
    result.putString("title", this.title)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Notes::class.java)) {
      result.set("Note", this.Note as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Notes::class.java)) {
      result.set("Note", this.Note as Serializable?)
    }
    result.set("title", this.title)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddEditNoteFragmentArgs {
      bundle.setClassLoader(AddEditNoteFragmentArgs::class.java.classLoader)
      val __Note : Notes?
      if (bundle.containsKey("Note")) {
        if (Parcelable::class.java.isAssignableFrom(Notes::class.java) ||
            Serializable::class.java.isAssignableFrom(Notes::class.java)) {
          __Note = bundle.get("Note") as Notes?
        } else {
          throw UnsupportedOperationException(Notes::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __Note = null
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
      return AddEditNoteFragmentArgs(__title, __Note)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AddEditNoteFragmentArgs {
      val __Note : Notes?
      if (savedStateHandle.contains("Note")) {
        if (Parcelable::class.java.isAssignableFrom(Notes::class.java) ||
            Serializable::class.java.isAssignableFrom(Notes::class.java)) {
          __Note = savedStateHandle.get<Notes?>("Note")
        } else {
          throw UnsupportedOperationException(Notes::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __Note = null
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
      return AddEditNoteFragmentArgs(__title, __Note)
    }
  }
}
