package ir.barook.todonote.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import ir.barook.todonote.util.Converters;

@androidx.room.TypeConverters(value = {ir.barook.todonote.util.Converters.class})
@androidx.room.Database(entities = {ir.barook.todonote.data.Notes.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lir/barook/todonote/data/NoteDatabase;", "Landroidx/room/RoomDatabase;", "()V", "notesDao", "Lir/barook/todonote/data/NoteDao;", "app_debug"})
public abstract class NoteDatabase extends androidx.room.RoomDatabase {
    
    public NoteDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract ir.barook.todonote.data.NoteDao notesDao();
}