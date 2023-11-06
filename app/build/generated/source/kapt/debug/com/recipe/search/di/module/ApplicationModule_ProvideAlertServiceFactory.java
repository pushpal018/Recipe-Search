package com.recipe.search.di.module;

import com.recipe.search.utils.MyAlertService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideAlertServiceFactory implements Factory<MyAlertService> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideAlertServiceFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public MyAlertService get() {
    return proxyProvideAlertService(module);
  }

  public static ApplicationModule_ProvideAlertServiceFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideAlertServiceFactory(module);
  }

  public static MyAlertService proxyProvideAlertService(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideAlertService(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
