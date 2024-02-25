package ir.barook.todonote.ui.todo.tasks;

import androidx.lifecycle.*;
import ir.barook.todonote.data.PreferencesManager;
import ir.barook.todonote.data.Task;
import ir.barook.todonote.data.TaskDao;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u00011B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020 J\u000e\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020(J\u0016\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020(J\u000e\u0010,\u001a\u00020 2\u0006\u0010*\u001a\u00020\u001bJ\u000e\u0010-\u001a\u00020 2\u0006\u0010*\u001a\u00020\u001bJ\u000e\u0010.\u001a\u00020 2\u0006\u0010*\u001a\u00020\u001bJ\u000e\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lir/barook/todonote/ui/todo/tasks/TasksViewModel;", "Landroidx/lifecycle/ViewModel;", "taskDao", "Lir/barook/todonote/data/TaskDao;", "preferecesManager", "Lir/barook/todonote/data/PreferencesManager;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lir/barook/todonote/data/TaskDao;Lir/barook/todonote/data/PreferencesManager;Landroidx/lifecycle/SavedStateHandle;)V", "preferencesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lir/barook/todonote/data/FilterPreferences;", "getPreferencesFlow", "()Lkotlinx/coroutines/flow/Flow;", "searchQuery", "Landroidx/lifecycle/MutableLiveData;", "", "getSearchQuery", "()Landroidx/lifecycle/MutableLiveData;", "taskEvent", "Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent;", "getTaskEvent", "taskEventChannel", "Lkotlinx/coroutines/channels/Channel;", "tasks", "Landroidx/lifecycle/LiveData;", "", "Lir/barook/todonote/data/Task;", "getTasks", "()Landroidx/lifecycle/LiveData;", "tasksFlow", "deleteAllCompletedTasksClick", "Lkotlinx/coroutines/Job;", "onAddEditResult", "", "result", "", "onAddNewTaskClick", "onHideCompletedClick", "hideCompleted", "", "onTaskCheckedChanged", "task", "isChecked", "onTaskSelected", "onTaskSwiped", "onUndoDeleteClick", "showTaskSavedConfirmationMessage", "text", "TasksEvent", "app_debug"})
public final class TasksViewModel extends androidx.lifecycle.ViewModel {
    private final ir.barook.todonote.data.TaskDao taskDao = null;
    private final ir.barook.todonote.data.PreferencesManager preferecesManager = null;
    private final androidx.lifecycle.SavedStateHandle state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<ir.barook.todonote.data.FilterPreferences> preferencesFlow = null;
    private final kotlinx.coroutines.channels.Channel<ir.barook.todonote.ui.todo.tasks.TasksViewModel.TasksEvent> taskEventChannel = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<ir.barook.todonote.ui.todo.tasks.TasksViewModel.TasksEvent> taskEvent = null;
    private final kotlinx.coroutines.flow.Flow<java.util.List<ir.barook.todonote.data.Task>> tasksFlow = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<ir.barook.todonote.data.Task>> tasks = null;
    
    @javax.inject.Inject
    public TasksViewModel(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.TaskDao taskDao, @org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.PreferencesManager preferecesManager, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<ir.barook.todonote.data.FilterPreferences> getPreferencesFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<ir.barook.todonote.ui.todo.tasks.TasksViewModel.TasksEvent> getTaskEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onHideCompletedClick(boolean hideCompleted) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<ir.barook.todonote.data.Task>> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onTaskSelected(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.Task task) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onTaskCheckedChanged(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.Task task, boolean isChecked) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onTaskSwiped(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.Task task) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onUndoDeleteClick(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.Task task) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onAddNewTaskClick() {
        return null;
    }
    
    public final void onAddEditResult(int result) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job showTaskSavedConfirmationMessage(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteAllCompletedTasksClick() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent;", "", "()V", "NavigateToAddScreen", "NavigateToDeleteAllCompletedTasksScreen", "NavigateToEditTaskScreen", "ShowTaskSavedConfirmationMessage", "ShowUndoDeleteTaskMessage", "Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent$NavigateToAddScreen;", "Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent$NavigateToDeleteAllCompletedTasksScreen;", "Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent$NavigateToEditTaskScreen;", "Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent$ShowTaskSavedConfirmationMessage;", "Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent$ShowUndoDeleteTaskMessage;", "app_debug"})
    public static abstract class TasksEvent {
        
        private TasksEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent$NavigateToAddScreen;", "Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent;", "()V", "app_debug"})
        public static final class NavigateToAddScreen extends ir.barook.todonote.ui.todo.tasks.TasksViewModel.TasksEvent {
            @org.jetbrains.annotations.NotNull
            public static final ir.barook.todonote.ui.todo.tasks.TasksViewModel.TasksEvent.NavigateToAddScreen INSTANCE = null;
            
            private NavigateToAddScreen() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent$NavigateToEditTaskScreen;", "Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent;", "task", "Lir/barook/todonote/data/Task;", "(Lir/barook/todonote/data/Task;)V", "getTask", "()Lir/barook/todonote/data/Task;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class NavigateToEditTaskScreen extends ir.barook.todonote.ui.todo.tasks.TasksViewModel.TasksEvent {
            @org.jetbrains.annotations.NotNull
            private final ir.barook.todonote.data.Task task = null;
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.ui.todo.tasks.TasksViewModel.TasksEvent.NavigateToEditTaskScreen copy(@org.jetbrains.annotations.NotNull
            ir.barook.todonote.data.Task task) {
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
            
            public NavigateToEditTaskScreen(@org.jetbrains.annotations.NotNull
            ir.barook.todonote.data.Task task) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.data.Task component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.data.Task getTask() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent$ShowUndoDeleteTaskMessage;", "Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent;", "task", "Lir/barook/todonote/data/Task;", "(Lir/barook/todonote/data/Task;)V", "getTask", "()Lir/barook/todonote/data/Task;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class ShowUndoDeleteTaskMessage extends ir.barook.todonote.ui.todo.tasks.TasksViewModel.TasksEvent {
            @org.jetbrains.annotations.NotNull
            private final ir.barook.todonote.data.Task task = null;
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.ui.todo.tasks.TasksViewModel.TasksEvent.ShowUndoDeleteTaskMessage copy(@org.jetbrains.annotations.NotNull
            ir.barook.todonote.data.Task task) {
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
            
            public ShowUndoDeleteTaskMessage(@org.jetbrains.annotations.NotNull
            ir.barook.todonote.data.Task task) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.data.Task component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.data.Task getTask() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent$ShowTaskSavedConfirmationMessage;", "Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent;", "msg", "", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class ShowTaskSavedConfirmationMessage extends ir.barook.todonote.ui.todo.tasks.TasksViewModel.TasksEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String msg = null;
            
            @org.jetbrains.annotations.NotNull
            public final ir.barook.todonote.ui.todo.tasks.TasksViewModel.TasksEvent.ShowTaskSavedConfirmationMessage copy(@org.jetbrains.annotations.NotNull
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
            
            public ShowTaskSavedConfirmationMessage(@org.jetbrains.annotations.NotNull
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
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent$NavigateToDeleteAllCompletedTasksScreen;", "Lir/barook/todonote/ui/todo/tasks/TasksViewModel$TasksEvent;", "()V", "app_debug"})
        public static final class NavigateToDeleteAllCompletedTasksScreen extends ir.barook.todonote.ui.todo.tasks.TasksViewModel.TasksEvent {
            @org.jetbrains.annotations.NotNull
            public static final ir.barook.todonote.ui.todo.tasks.TasksViewModel.TasksEvent.NavigateToDeleteAllCompletedTasksScreen INSTANCE = null;
            
            private NavigateToDeleteAllCompletedTasksScreen() {
                super();
            }
        }
    }
}