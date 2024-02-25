package ir.barook.todonote.ui.notes.edit;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import ir.barook.todonote.data.NoteDao;
import ir.barook.todonote.data.Notes;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lir/barook/todonote/ui/notes/edit/AddEditNoteViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lir/barook/todonote/data/NoteDao;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lir/barook/todonote/data/NoteDao;Landroidx/lifecycle/SavedStateHandle;)V", "addEditNoteEvent", "Lkotlinx/coroutines/flow/Flow;", "Lir/barook/todonote/ui/notes/edit/AddEditNoteViewModel$AddEditNoteEvent;", "getAddEditNoteEvent", "()Lkotlinx/coroutines/flow/Flow;", "addEditNoteEventChannel", "Lkotlinx/coroutines/channels/Channel;", "note", "Lir/barook/todonote/data/Notes;", "getNote", "()Lir/barook/todonote/data/Notes;", "value", "", "noteContent", "getNoteContent", "()Ljava/lang/String;", "setNoteContent", "(Ljava/lang/String;)V", "noteTitle", "getNoteTitle", "setNoteTitle", "ShowInvalidInputMessage", "Lkotlinx/coroutines/Job;", "text", "createNote", "onSaveClick", "", "updateNote", "AddEditNoteEvent", "app_debug"})
public final class AddEditNoteViewModel extends androidx.lifecycle.ViewModel {
    private final ir.barook.todonote.data.NoteDao dao = null;
    private final androidx.lifecycle.SavedStateHandle state = null;
    private final kotlinx.coroutines.channels.Channel<ir.barook.todonote.ui.notes.edit.AddEditNoteViewModel.AddEditNoteEvent> addEditNoteEventChannel = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<ir.barook.todonote.ui.notes.edit.AddEditNoteViewModel.AddEditNoteEvent> addEditNoteEvent = null;
    @org.jetbrains.annotations.Nullable
    private final ir.barook.todonote.data.Notes note = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String noteTitle;
    @org.jetbrains.annotations.NotNull
    private java.lang.String noteContent;
    
    @javax.inject.Inject
    public AddEditNoteViewModel(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.NoteDao dao, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<ir.barook.todonote.ui.notes.edit.AddEditNoteViewModel.AddEditNoteEvent> getAddEditNoteEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ir.barook.todonote.data.Notes getNote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNoteTitle() {
        return null;
    }
    
    public final void setNoteTitle(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNoteContent() {
        return null;
    }
    
    public final void setNoteContent(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void onSaveClick() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job ShowInvalidInputMessage(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateNote(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.Notes note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job createNote(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.Notes note) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lir/barook/todonote/ui/notes/edit/AddEditNoteViewModel$AddEditNoteEvent;", "", "()V", "NavigateWithResult", "ShowInvalidInputMessage", "Lir/barook/todonote/ui/notes/edit/AddEditNoteViewModel$AddEditNoteEvent$NavigateWithResult;", "Lir/barook/todonote/ui/notes/edit/AddEditNoteViewModel$AddEditNoteEvent$ShowInvalidInputMessage;", "app_debug"})
    public static abstract class AddEditNoteEvent {
        
        private AddEditNoteEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lir/barook/todonote/ui/notes/edit/AddEditNoteViewModel$AddEditNoteEvent$ShowInvalidInputMessage;", "Lir/barook/todonote/ui/notes/edit/AddEditNoteViewModel$AddEditNoteEvent;", "msg", "", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class ShowInvalidInputMessage extends ir.barook.todonote.ui.notes.edit.AddEditNoteViewModel.AddEditNoteEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String msg = null;
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.ui.notes.edit.AddEditNoteViewModel.AddEditNoteEvent.ShowInvalidInputMessage copy(@org.jetbrains.annotations.NotNull
            java.lang.String msg) {
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
            
            public ShowInvalidInputMessage(@org.jetbrains.annotations.NotNull
            java.lang.String msg) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMsg() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lir/barook/todonote/ui/notes/edit/AddEditNoteViewModel$AddEditNoteEvent$NavigateWithResult;", "Lir/barook/todonote/ui/notes/edit/AddEditNoteViewModel$AddEditNoteEvent;", "result", "", "(I)V", "getResult", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class NavigateWithResult extends ir.barook.todonote.ui.notes.edit.AddEditNoteViewModel.AddEditNoteEvent {
            private final int result = 0;
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.ui.notes.edit.AddEditNoteViewModel.AddEditNoteEvent.NavigateWithResult copy(int result) {
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
            
            public NavigateWithResult(int result) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getResult() {
                return 0;
            }
        }
    }
}