package com.recipe.search.di.module

import com.recipe.search.di.scope.ActivityScope
import com.recipe.search.ui.view.auth.appwrite_auth.AppwriteRegistrationActivity
import com.recipe.search.ui.view.auth.appwrite_auth.AppwriteRegistrationModule
import com.recipe.search.ui.view.auth.login.LoginActivity
import com.recipe.search.ui.view.auth.login.LoginViewModule
import com.recipe.search.ui.view.auth.signUp.SignUpActivity
import com.recipe.search.ui.view.auth.signUp.SignUpViewModel
import com.recipe.search.ui.view.dashboard.DashBoardActivity
import com.recipe.search.ui.view.dashboard.DashBoardViewModel
import com.recipe.search.ui.view.recipe_details.RecipeDetailsActivity
import com.recipe.search.ui.view.recipe_details.RecipeDetailsModule

import com.recipe.search.ui.view.splash.SplashScreenActivity
import com.recipe.search.ui.view.splash.SplashViewModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module(includes = [FragmentBindingModule::class])
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [SplashViewModule::class])
    abstract fun bindEventSplashActivity(): SplashScreenActivity


    @ActivityScope
    @ContributesAndroidInjector(modules = [DashBoardViewModel::class])
    abstract fun bindEventDashBoard(): DashBoardActivity



    @ActivityScope
    @ContributesAndroidInjector(modules = [LoginViewModule::class])
    abstract fun bindEventLogin(): LoginActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [SignUpViewModel::class])
    abstract fun bindEventSignUp(): SignUpActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [RecipeDetailsModule::class])
    abstract fun bindEventDetails(): RecipeDetailsActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [AppwriteRegistrationModule::class])
    abstract fun bindEventAppWriteRegistration(): AppwriteRegistrationActivity

}