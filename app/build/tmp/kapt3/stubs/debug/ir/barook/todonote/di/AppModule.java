package ir.barook.todonote.di;

import android.app.Application;
import androidx.room.Room;
import ir.barook.todonote.data.NoteDatabase;
import ir.barook.todonote.data.TaskDatabase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Qualifier;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\fH\u0007\u00a8\u0006\u0012"}, d2 = {"Lir/barook/todonote/di/AppModule;", "", "()V", "provideApplicationScope", "Lkotlinx/coroutines/CoroutineScope;", "provideDatabase", "Lir/barook/todonote/data/TaskDatabase;", "app", "Landroid/app/Application;", "callBack", "Lir/barook/todonote/data/TaskDatabase$Callback;", "provideNoteDatabase", "Lir/barook/todonote/data/NoteDatabase;", "providesDao", "Lir/barook/todonote/data/TaskDao;", "db", "providesNoteDao", "Lir/barook/todonote/data/NoteDao;", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final ir.barook.todonote.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final ir.barook.todonote.data.TaskDatabase provideDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application app, @org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.TaskDatabase.Callback callBack) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final ir.barook.todonote.data.TaskDao providesDao(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.TaskDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final ir.barook.todonote.data.NoteDatabase provideNoteDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final ir.barook.todonote.data.NoteDao providesNoteDao(@org.jetbrains.annotations.NotNull
    ir.barook.todonote.data.NoteDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    @ApplicationScope
    public final kotlinx.coroutines.CoroutineScope provideApplicationScope() {
        return null;
    }
}