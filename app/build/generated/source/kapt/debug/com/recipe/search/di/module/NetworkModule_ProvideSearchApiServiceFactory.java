package com.recipe.search.di.module;

import com.recipe.search.data.network.ApiServiceBuilder;
import com.recipe.search.data.network.api_service.SearchApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideSearchApiServiceFactory
    implements Factory<SearchApiService> {
  private final NetworkModule module;

  private final Provider<ApiServiceBuilder> apiServiceBuilderProvider;

  public NetworkModule_ProvideSearchApiServiceFactory(
      NetworkModule module, Provider<ApiServiceBuilder> apiServiceBuilderProvider) {
    this.module = module;
    this.apiServiceBuilderProvider = apiServiceBuilderProvider;
  }

  @Override
  public SearchApiService get() {
    return proxyProvideSearchApiService(module, apiServiceBuilderProvider.get());
  }

  public static NetworkModule_ProvideSearchApiServiceFactory create(
      NetworkModule module, Provider<ApiServiceBuilder> apiServiceBuilderProvider) {
    return new NetworkModule_ProvideSearchApiServiceFactory(module, apiServiceBuilderProvider);
  }

  public static SearchApiService proxyProvideSearchApiService(
      NetworkModule instance, ApiServiceBuilder apiServiceBuilder) {
    return Preconditions.checkNotNull(
        instance.provideSearchApiService(apiServiceBuilder),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
