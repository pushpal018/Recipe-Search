package com.recipe.search.ui.view.auth.login

import dagger.Binds
import dagger.Module

@Module
abstract class LoginViewModule {

    @Binds
    abstract fun provideRequirementsView(activity: LoginActivity): LoginContract.View
}