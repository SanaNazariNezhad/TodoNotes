package ir.barook.todonote.ui.notes;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import ir.barook.todonote.NavGraphDirections;
import ir.barook.todonote.R;
import ir.barook.todonote.data.Notes;
import java.io.Serializable;
import kotlin.Int;
import kotlin.String;
import kotlin.Suppress;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lir/barook/todonote/ui/notes/NotesFragmentDirections;", "", "()V", "ActionNotesFragmentToAddEditNoteFragment", "Companion", "app_debug"})
public final class NotesFragmentDirections {
    @org.jetbrains.annotations.NotNull
    public static final ir.barook.todonote.ui.notes.NotesFragmentDirections.Companion Companion = null;
    
    private NotesFragmentDirections() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\nH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lir/barook/todonote/ui/notes/NotesFragmentDirections$ActionNotesFragmentToAddEditNoteFragment;", "Landroidx/navigation/NavDirections;", "title", "", "Note", "Lir/barook/todonote/data/Notes;", "(Ljava/lang/String;Lir/barook/todonote/data/Notes;)V", "getNote", "()Lir/barook/todonote/data/Notes;", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    static final class ActionNotesFragmentToAddEditNoteFragment implements androidx.navigation.NavDirections {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        @org.jetbrains.annotations.Nullable
        private final ir.barook.todonote.data.Notes Note = null;
        private final int actionId = ir.barook.todonote.R.id.action_notesFragment_to_addEditNoteFragment;
        
        @org.jetbrains.annotations.NotNull
        public final ir.barook.todonote.ui.notes.NotesFragmentDirections.ActionNotesFragmentToAddEditNoteFragment copy(@org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.Nullable
        ir.barook.todonote.data.Notes Note) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionNotesFragmentToAddEditNoteFragment(@org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.Nullable
        ir.barook.todonote.data.Notes Note) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final ir.barook.todonote.data.Notes component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final ir.barook.todonote.data.Notes getNote() {
            return null;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a8\u0006\u000b"}, d2 = {"Lir/barook/todonote/ui/notes/NotesFragmentDirections$Companion;", "", "()V", "actionGlobalDeleteAllCompletedTasksDialogFragment", "Landroidx/navigation/NavDirections;", "actionGlobalDeleteAllNotes", "actionNotesFragmentToAddEditNoteFragment", "title", "", "Note", "Lir/barook/todonote/data/Notes;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionNotesFragmentToAddEditNoteFragment(@org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.Nullable
        ir.barook.todonote.data.Notes Note) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionGlobalDeleteAllCompletedTasksDialogFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionGlobalDeleteAllNotes() {
            return null;
        }
    }
}