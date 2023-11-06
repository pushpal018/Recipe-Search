package com.recipe.search.di.module;

import android.content.Context;
import com.recipe.search.data.prefs.PreferenceManager;
import com.recipe.search.utils.NetworkUtils;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideRetrofitApiClientFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<Context> contextProvider;

  private final Provider<NetworkUtils> networkUtilsProvider;

  private final Provider<PreferenceManager> preferenceManagerProvider;

  public NetworkModule_ProvideRetrofitApiClientFactory(
      NetworkModule module,
      Provider<Context> contextProvider,
      Provider<NetworkUtils> networkUtilsProvider,
      Provider<PreferenceManager> preferenceManagerProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.networkUtilsProvider = networkUtilsProvider;
    this.preferenceManagerProvider = preferenceManagerProvider;
  }

  @Override
  public Retrofit get() {
    return proxyProvideRetrofitApiClient(
        module, contextProvider.get(), networkUtilsProvider.get(), preferenceManagerProvider.get());
  }

  public static NetworkModule_ProvideRetrofitApiClientFactory create(
      NetworkModule module,
      Provider<Context> contextProvider,
      Provider<NetworkUtils> networkUtilsProvider,
      Provider<PreferenceManager> preferenceManagerProvider) {
    return new NetworkModule_ProvideRetrofitApiClientFactory(
        module, contextProvider, networkUtilsProvider, preferenceManagerProvider);
  }

  public static Retrofit proxyProvideRetrofitApiClient(
      NetworkModule instance,
      Context context,
      NetworkUtils networkUtils,
      PreferenceManager preferenceManager) {
    return Preconditions.checkNotNull(
        instance.provideRetrofitApiClient(context, networkUtils, preferenceManager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
