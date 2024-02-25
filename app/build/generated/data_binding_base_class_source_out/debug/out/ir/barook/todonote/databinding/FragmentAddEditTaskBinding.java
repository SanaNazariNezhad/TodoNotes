// Generated by view binder compiler. Do not edit!
package ir.barook.todonote.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ir.barook.todonote.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddEditTaskBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView dateCreatedTextView;

  @NonNull
  public final CheckBox editTaskCheck;

  @NonNull
  public final FloatingActionButton floatingActionButtonEditTask;

  @NonNull
  public final TextInputEditText taskEditText;

  @NonNull
  public final TextInputLayout textInputLayout;

  private FragmentAddEditTaskBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView dateCreatedTextView, @NonNull CheckBox editTaskCheck,
      @NonNull FloatingActionButton floatingActionButtonEditTask,
      @NonNull TextInputEditText taskEditText, @NonNull TextInputLayout textInputLayout) {
    this.rootView = rootView;
    this.dateCreatedTextView = dateCreatedTextView;
    this.editTaskCheck = editTaskCheck;
    this.floatingActionButtonEditTask = floatingActionButtonEditTask;
    this.taskEditText = taskEditText;
    this.textInputLayout = textInputLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddEditTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddEditTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_edit_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddEditTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dateCreatedTextView;
      TextView dateCreatedTextView = ViewBindings.findChildViewById(rootView, id);
      if (dateCreatedTextView == null) {
        break missingId;
      }

      id = R.id.edit_task_check;
      CheckBox editTaskCheck = ViewBindings.findChildViewById(rootView, id);
      if (editTaskCheck == null) {
        break missingId;
      }

      id = R.id.floatingActionButtonEditTask;
      FloatingActionButton floatingActionButtonEditTask = ViewBindings.findChildViewById(rootView, id);
      if (floatingActionButtonEditTask == null) {
        break missingId;
      }

      id = R.id.task_edit_text;
      TextInputEditText taskEditText = ViewBindings.findChildViewById(rootView, id);
      if (taskEditText == null) {
        break missingId;
      }

      id = R.id.textInputLayout;
      TextInputLayout textInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout == null) {
        break missingId;
      }

      return new FragmentAddEditTaskBinding((ConstraintLayout) rootView, dateCreatedTextView,
          editTaskCheck, floatingActionButtonEditTask, taskEditText, textInputLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
