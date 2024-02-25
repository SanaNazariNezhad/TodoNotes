package ir.barook.todonote.data;

import androidx.room.*;
import kotlinx.coroutines.flow.Flow;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\'J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lir/barook/todonote/data/NoteDao;", "", "deleteAllNotes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNote", "note", "Lir/barook/todonote/data/Notes;", "(Lir/barook/todonote/data/Notes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotes", "Lkotlinx/coroutines/flow/Flow;", "", "getNotes", "query", "", "sortOrder", "Lir/barook/todonote/data/SortOrder;", "getNotesSortedByCreatedDate", "getNotesSortedByName", "insertNote", "updateNote", "app_debug"})
public abstract interface NoteDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertNote(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.Notes note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.Notes note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object updateNote(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.Notes note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM notes_table")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ir.barook.todonote.data.Notes>> getAllNotes();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ir.barook.todonote.data.Notes>> getNotes(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.SortOrder sortOrder);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM notes_table WHERE title LIKE \'%\' || :query || \'%\' ORDER BY title ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ir.barook.todonote.data.Notes>> getNotesSortedByName(@org.jetbrains.annotations.NotNull
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM notes_table WHERE title LIKE \'%\' || :query || \'%\' ORDER BY date DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ir.barook.todonote.data.Notes>> getNotesSortedByCreatedDate(@org.jetbrains.annotations.NotNull
    java.lang.String query);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM notes_table")
    public abstract java.lang.Object deleteAllNotes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull
        public static kotlinx.coroutines.flow.Flow<java.util.List<ir.barook.todonote.data.Notes>> getNotes(@org.jetbrains.annotations.NotNull
        ir.barook.todonote.data.NoteDao $this, @org.jetbrains.annotations.NotNull
        java.lang.String query, @org.jetbrains.annotations.NotNull
        ir.barook.todonote.data.SortOrder sortOrder) {
            return null;
        }
    }
}