// Generated by Dagger (https://dagger.dev).
package ir.barook.todonote.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("ir.barook.todonote.di.ApplicationScope")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideApplicationScopeFactory implements Factory<CoroutineScope> {
  @Override
  public CoroutineScope get() {
    return provideApplicationScope();
  }

  public static AppModule_ProvideApplicationScopeFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineScope provideApplicationScope() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApplicationScope());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideApplicationScopeFactory INSTANCE = new AppModule_ProvideApplicationScopeFactory();
  }
}