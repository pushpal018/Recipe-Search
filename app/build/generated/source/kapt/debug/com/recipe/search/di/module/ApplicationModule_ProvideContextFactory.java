package com.recipe.search.di.module;

import android.content.Context;
import com.recipe.search.base.BaseApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideContextFactory implements Factory<Context> {
  private final ApplicationModule module;

  private final Provider<BaseApplication> baseAppProvider;

  public ApplicationModule_ProvideContextFactory(
      ApplicationModule module, Provider<BaseApplication> baseAppProvider) {
    this.module = module;
    this.baseAppProvider = baseAppProvider;
  }

  @Override
  public Context get() {
    return proxyProvideContext(module, baseAppProvider.get());
  }

  public static ApplicationModule_ProvideContextFactory create(
      ApplicationModule module, Provider<BaseApplication> baseAppProvider) {
    return new ApplicationModule_ProvideContextFactory(module, baseAppProvider);
  }

  public static Context proxyProvideContext(ApplicationModule instance, BaseApplication baseApp) {
    return Preconditions.checkNotNull(
        instance.provideContext(baseApp),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
