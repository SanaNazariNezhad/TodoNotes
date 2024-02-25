package ir.barook.todonote.ui.notes.delete;

import androidx.lifecycle.ViewModel;
import ir.barook.todonote.data.NoteDao;
import ir.barook.todonote.di.ApplicationScope;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lir/barook/todonote/ui/notes/delete/DeleteAllNotesViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lir/barook/todonote/data/NoteDao;", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lir/barook/todonote/data/NoteDao;Lkotlinx/coroutines/CoroutineScope;)V", "confirmClick", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class DeleteAllNotesViewModel extends androidx.lifecycle.ViewModel {
    private final ir.barook.todonote.data.NoteDao dao = null;
    private final kotlinx.coroutines.CoroutineScope applicationScope = null;
    
    @javax.inject.Inject
    public DeleteAllNotesViewModel(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.NoteDao dao, @org.jetbrains.annotations.NotNull
    @ir.barook.todonote.di.ApplicationScope
    kotlinx.coroutines.CoroutineScope applicationScope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job confirmClick() {
        return null;
    }
}