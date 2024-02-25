// Generated by Dagger (https://dagger.dev).
package ir.barook.todonote.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.barook.todonote.data.NoteDao;
import ir.barook.todonote.data.NoteDatabase;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesNoteDaoFactory implements Factory<NoteDao> {
  private final Provider<NoteDatabase> dbProvider;

  public AppModule_ProvidesNoteDaoFactory(Provider<NoteDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public NoteDao get() {
    return providesNoteDao(dbProvider.get());
  }

  public static AppModule_ProvidesNoteDaoFactory create(Provider<NoteDatabase> dbProvider) {
    return new AppModule_ProvidesNoteDaoFactory(dbProvider);
  }

  public static NoteDao providesNoteDao(NoteDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesNoteDao(db));
  }
}