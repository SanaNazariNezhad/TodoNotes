package ir.barook.todonote.ui.notes;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import ir.barook.todonote.data.Notes;
import ir.barook.todonote.databinding.ItemNoteBinding;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0018\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lir/barook/todonote/ui/notes/NotesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lir/barook/todonote/ui/notes/NotesAdapter$NotesViewHolder;", "listener", "Lir/barook/todonote/ui/notes/NotesAdapter$OnItemClickListener;", "(Lir/barook/todonote/ui/notes/NotesAdapter$OnItemClickListener;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lir/barook/todonote/data/Notes;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "differCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NotesViewHolder", "OnItemClickListener", "app_debug"})
public final class NotesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ir.barook.todonote.ui.notes.NotesAdapter.NotesViewHolder> {
    private final ir.barook.todonote.ui.notes.NotesAdapter.OnItemClickListener listener = null;
    private androidx.recyclerview.widget.DiffUtil.ItemCallback<ir.barook.todonote.data.Notes> differCallback;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.AsyncListDiffer<ir.barook.todonote.data.Notes> differ = null;
    
    public NotesAdapter(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.ui.notes.NotesAdapter.OnItemClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.AsyncListDiffer<ir.barook.todonote.data.Notes> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public ir.barook.todonote.ui.notes.NotesAdapter.NotesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.ui.notes.NotesAdapter.NotesViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lir/barook/todonote/ui/notes/NotesAdapter$NotesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lir/barook/todonote/databinding/ItemNoteBinding;", "(Lir/barook/todonote/ui/notes/NotesAdapter;Lir/barook/todonote/databinding/ItemNoteBinding;)V", "bind", "", "note", "Lir/barook/todonote/data/Notes;", "app_debug"})
    public final class NotesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final ir.barook.todonote.databinding.ItemNoteBinding binding = null;
        
        public NotesViewHolder(@org.jetbrains.annotations.NotNull
        ir.barook.todonote.databinding.ItemNoteBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        ir.barook.todonote.data.Notes note) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lir/barook/todonote/ui/notes/NotesAdapter$OnItemClickListener;", "", "onDeleteNoteClick", "", "note", "Lir/barook/todonote/data/Notes;", "onItemClick", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull
        ir.barook.todonote.data.Notes note);
        
        public abstract void onDeleteNoteClick(@org.jetbrains.annotations.NotNull
        ir.barook.todonote.data.Notes note);
    }
}