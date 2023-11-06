package com.recipe.search.di.module;

import android.content.Context;
import com.recipe.search.data.prefs.PreferenceManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvidePreferenceManagerFactory
    implements Factory<PreferenceManager> {
  private final ApplicationModule module;

  private final Provider<Context> contextProvider;

  public ApplicationModule_ProvidePreferenceManagerFactory(
      ApplicationModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public PreferenceManager get() {
    return proxyProvidePreferenceManager(module, contextProvider.get());
  }

  public static ApplicationModule_ProvidePreferenceManagerFactory create(
      ApplicationModule module, Provider<Context> contextProvider) {
    return new ApplicationModule_ProvidePreferenceManagerFactory(module, contextProvider);
  }

  public static PreferenceManager proxyProvidePreferenceManager(
      ApplicationModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.providePreferenceManager(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
