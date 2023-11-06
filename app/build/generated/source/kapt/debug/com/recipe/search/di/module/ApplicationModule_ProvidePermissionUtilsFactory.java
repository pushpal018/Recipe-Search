package com.recipe.search.di.module;

import com.recipe.search.data.prefs.PreferenceManager;
import com.recipe.search.utils.PermissionUtils;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvidePermissionUtilsFactory
    implements Factory<PermissionUtils> {
  private final ApplicationModule module;

  private final Provider<PreferenceManager> preferenceManagerProvider;

  public ApplicationModule_ProvidePermissionUtilsFactory(
      ApplicationModule module, Provider<PreferenceManager> preferenceManagerProvider) {
    this.module = module;
    this.preferenceManagerProvider = preferenceManagerProvider;
  }

  @Override
  public PermissionUtils get() {
    return proxyProvidePermissionUtils(module, preferenceManagerProvider.get());
  }

  public static ApplicationModule_ProvidePermissionUtilsFactory create(
      ApplicationModule module, Provider<PreferenceManager> preferenceManagerProvider) {
    return new ApplicationModule_ProvidePermissionUtilsFactory(module, preferenceManagerProvider);
  }

  public static PermissionUtils proxyProvidePermissionUtils(
      ApplicationModule instance, PreferenceManager preferenceManager) {
    return Preconditions.checkNotNull(
        instance.providePermissionUtils(preferenceManager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
