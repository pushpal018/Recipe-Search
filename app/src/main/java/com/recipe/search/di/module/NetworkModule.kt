package com.recipe.search.di.module

import android.content.Context
import com.recipe.search.data.network.ApiServiceBuilder
import com.recipe.search.data.network.RetrofitApiClient
import com.recipe.search.data.prefs.PreferenceManager
import com.recipe.search.utils.NetworkUtils
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofitApiClient(
        context: Context,
        networkUtils: NetworkUtils,
        preferenceManager: PreferenceManager
    ): Retrofit {
        return RetrofitApiClient.getRetrofit(context, networkUtils, preferenceManager)
    }


    @Provides
    @Singleton
    fun provideApiServiceBuilder(retrofit: Retrofit): ApiServiceBuilder {
        return ApiServiceBuilder(retrofit)
    }
}