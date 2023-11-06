package com.recipe.search.di.module;

import com.recipe.search.utils.Navigator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideNavigatorFactory implements Factory<Navigator> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideNavigatorFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public Navigator get() {
    return proxyProvideNavigator(module);
  }

  public static ApplicationModule_ProvideNavigatorFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideNavigatorFactory(module);
  }

  public static Navigator proxyProvideNavigator(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideNavigator(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
