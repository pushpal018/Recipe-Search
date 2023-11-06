package com.recipe.search.ui.view.auth.signUp

import dagger.Binds
import dagger.Module

@Module
abstract  class SignUpViewModel {
    @Binds
    abstract fun provideSingUpView(activity: SignUpActivity): SignUpContract.View
}