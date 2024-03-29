// Generated by view binder compiler. Do not edit!
package ir.barook.todonote.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ir.barook.todonote.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNotesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton floatAddButton;

  @NonNull
  public final RecyclerView notesRecyc;

  private FragmentNotesBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton floatAddButton, @NonNull RecyclerView notesRecyc) {
    this.rootView = rootView;
    this.floatAddButton = floatAddButton;
    this.notesRecyc = notesRecyc;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNotesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNotesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_notes, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNotesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.floatAddButton;
      FloatingActionButton floatAddButton = ViewBindings.findChildViewById(rootView, id);
      if (floatAddButton == null) {
        break missingId;
      }

      id = R.id.notes_recyc;
      RecyclerView notesRecyc = ViewBindings.findChildViewById(rootView, id);
      if (notesRecyc == null) {
        break missingId;
      }

      return new FragmentNotesBinding((ConstraintLayout) rootView, floatAddButton, notesRecyc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
