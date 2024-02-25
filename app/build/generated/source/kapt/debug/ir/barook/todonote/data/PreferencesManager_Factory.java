// Generated by Dagger (https://dagger.dev).
package ir.barook.todonote.data;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PreferencesManager_Factory implements Factory<PreferencesManager> {
  private final Provider<Context> contextProvider;

  public PreferencesManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PreferencesManager get() {
    return newInstance(contextProvider.get());
  }

  public static PreferencesManager_Factory create(Provider<Context> contextProvider) {
    return new PreferencesManager_Factory(contextProvider);
  }

  public static PreferencesManager newInstance(Context context) {
    return new PreferencesManager(context);
  }
}