package ir.barook.todonote.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ir.barook.todonote.util.Converters


@Database(entities = [Notes::class], version = 1)
@TypeConverters(Converters::class)
abstract class NoteDatabase :RoomDatabase() {

    abstract fun notesDao(): NoteDao

}