package com.recipe.search.di.module;

import com.recipe.search.utils.NetworkUtils;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideNetworkUtilsFactory implements Factory<NetworkUtils> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideNetworkUtilsFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public NetworkUtils get() {
    return proxyProvideNetworkUtils(module);
  }

  public static ApplicationModule_ProvideNetworkUtilsFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideNetworkUtilsFactory(module);
  }

  public static NetworkUtils proxyProvideNetworkUtils(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideNetworkUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
