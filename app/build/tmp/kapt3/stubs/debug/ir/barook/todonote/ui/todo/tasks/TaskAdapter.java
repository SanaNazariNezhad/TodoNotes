package ir.barook.todonote.ui.todo.tasks;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import ir.barook.todonote.data.Task;
import ir.barook.todonote.databinding.ItemTaskBinding;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lir/barook/todonote/ui/todo/tasks/TaskAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lir/barook/todonote/data/Task;", "Lir/barook/todonote/ui/todo/tasks/TaskAdapter$TaskViewHolder;", "listener", "Lir/barook/todonote/ui/todo/tasks/TaskAdapter$OnItemClickListener;", "(Lir/barook/todonote/ui/todo/tasks/TaskAdapter$OnItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallBack", "OnItemClickListener", "TaskViewHolder", "app_debug"})
public final class TaskAdapter extends androidx.recyclerview.widget.ListAdapter<ir.barook.todonote.data.Task, ir.barook.todonote.ui.todo.tasks.TaskAdapter.TaskViewHolder> {
    private final ir.barook.todonote.ui.todo.tasks.TaskAdapter.OnItemClickListener listener = null;
    
    public TaskAdapter(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.ui.todo.tasks.TaskAdapter.OnItemClickListener listener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public ir.barook.todonote.ui.todo.tasks.TaskAdapter.TaskViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.ui.todo.tasks.TaskAdapter.TaskViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lir/barook/todonote/ui/todo/tasks/TaskAdapter$TaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lir/barook/todonote/databinding/ItemTaskBinding;", "(Lir/barook/todonote/ui/todo/tasks/TaskAdapter;Lir/barook/todonote/databinding/ItemTaskBinding;)V", "bind", "", "task", "Lir/barook/todonote/data/Task;", "app_debug"})
    public final class TaskViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final ir.barook.todonote.databinding.ItemTaskBinding binding = null;
        
        public TaskViewHolder(@org.jetbrains.annotations.NotNull
        ir.barook.todonote.databinding.ItemTaskBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        ir.barook.todonote.data.Task task) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lir/barook/todonote/ui/todo/tasks/TaskAdapter$OnItemClickListener;", "", "onChecBoxClick", "", "task", "Lir/barook/todonote/data/Task;", "isChecked", "", "onItemClick", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull
        ir.barook.todonote.data.Task task);
        
        public abstract void onChecBoxClick(@org.jetbrains.annotations.NotNull
        ir.barook.todonote.data.Task task, boolean isChecked);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lir/barook/todonote/ui/todo/tasks/TaskAdapter$DiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lir/barook/todonote/data/Task;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<ir.barook.todonote.data.Task> {
        
        public DiffCallBack() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        ir.barook.todonote.data.Task oldItem, @org.jetbrains.annotations.NotNull
        ir.barook.todonote.data.Task newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        ir.barook.todonote.data.Task oldItem, @org.jetbrains.annotations.NotNull
        ir.barook.todonote.data.Task newItem) {
            return false;
        }
    }
}