// Generated by view binder compiler. Do not edit!
package ir.barook.todonote.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ir.barook.todonote.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemNoteBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView contentTextView;

  @NonNull
  public final ImageView dateIcon;

  @NonNull
  public final TextView dateTextView;

  @NonNull
  public final ImageButton deleteNoteButton;

  @NonNull
  public final TextView titleTextView;

  private ItemNoteBinding(@NonNull CardView rootView, @NonNull TextView contentTextView,
      @NonNull ImageView dateIcon, @NonNull TextView dateTextView,
      @NonNull ImageButton deleteNoteButton, @NonNull TextView titleTextView) {
    this.rootView = rootView;
    this.contentTextView = contentTextView;
    this.dateIcon = dateIcon;
    this.dateTextView = dateTextView;
    this.deleteNoteButton = deleteNoteButton;
    this.titleTextView = titleTextView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contentTextView;
      TextView contentTextView = ViewBindings.findChildViewById(rootView, id);
      if (contentTextView == null) {
        break missingId;
      }

      id = R.id.dateIcon;
      ImageView dateIcon = ViewBindings.findChildViewById(rootView, id);
      if (dateIcon == null) {
        break missingId;
      }

      id = R.id.dateTextView;
      TextView dateTextView = ViewBindings.findChildViewById(rootView, id);
      if (dateTextView == null) {
        break missingId;
      }

      id = R.id.deleteNoteButton;
      ImageButton deleteNoteButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteNoteButton == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      TextView titleTextView = ViewBindings.findChildViewById(rootView, id);
      if (titleTextView == null) {
        break missingId;
      }

      return new ItemNoteBinding((CardView) rootView, contentTextView, dateIcon, dateTextView,
          deleteNoteButton, titleTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}