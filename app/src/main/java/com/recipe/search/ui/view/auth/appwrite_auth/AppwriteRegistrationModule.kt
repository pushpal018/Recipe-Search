package com.recipe.search.ui.view.auth.appwrite_auth

import dagger.Binds
import dagger.Module

@Module
abstract  class AppwriteRegistrationModule {

    @Binds
    abstract fun provideSignUpView(activity: AppwriteRegistrationActivity): AppwriteRegistrationContract.View
}