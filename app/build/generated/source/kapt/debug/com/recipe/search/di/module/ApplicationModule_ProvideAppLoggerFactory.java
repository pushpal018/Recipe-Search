package com.recipe.search.di.module;

import com.recipe.search.utils.AppLogger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideAppLoggerFactory implements Factory<AppLogger> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideAppLoggerFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public AppLogger get() {
    return proxyProvideAppLogger(module);
  }

  public static ApplicationModule_ProvideAppLoggerFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideAppLoggerFactory(module);
  }

  public static AppLogger proxyProvideAppLogger(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideAppLogger(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
