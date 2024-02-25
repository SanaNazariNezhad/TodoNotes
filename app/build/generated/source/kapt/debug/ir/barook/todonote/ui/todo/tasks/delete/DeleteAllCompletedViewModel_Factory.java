// Generated by Dagger (https://dagger.dev).
package ir.barook.todonote.ui.todo.tasks.delete;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.barook.todonote.data.TaskDao;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

@ScopeMetadata
@QualifierMetadata("ir.barook.todonote.di.ApplicationScope")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DeleteAllCompletedViewModel_Factory implements Factory<DeleteAllCompletedViewModel> {
  private final Provider<TaskDao> daoProvider;

  private final Provider<CoroutineScope> applicationScopeProvider;

  public DeleteAllCompletedViewModel_Factory(Provider<TaskDao> daoProvider,
      Provider<CoroutineScope> applicationScopeProvider) {
    this.daoProvider = daoProvider;
    this.applicationScopeProvider = applicationScopeProvider;
  }

  @Override
  public DeleteAllCompletedViewModel get() {
    return newInstance(daoProvider.get(), applicationScopeProvider.get());
  }

  public static DeleteAllCompletedViewModel_Factory create(Provider<TaskDao> daoProvider,
      Provider<CoroutineScope> applicationScopeProvider) {
    return new DeleteAllCompletedViewModel_Factory(daoProvider, applicationScopeProvider);
  }

  public static DeleteAllCompletedViewModel newInstance(TaskDao dao,
      CoroutineScope applicationScope) {
    return new DeleteAllCompletedViewModel(dao, applicationScope);
  }
}