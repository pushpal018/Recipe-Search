package com.recipe.search.di.module;

import com.recipe.search.data.network.ApiServiceBuilder;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideApiServiceBuilderFactory
    implements Factory<ApiServiceBuilder> {
  private final NetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideApiServiceBuilderFactory(
      NetworkModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiServiceBuilder get() {
    return proxyProvideApiServiceBuilder(module, retrofitProvider.get());
  }

  public static NetworkModule_ProvideApiServiceBuilderFactory create(
      NetworkModule module, Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideApiServiceBuilderFactory(module, retrofitProvider);
  }

  public static ApiServiceBuilder proxyProvideApiServiceBuilder(
      NetworkModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.provideApiServiceBuilder(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
