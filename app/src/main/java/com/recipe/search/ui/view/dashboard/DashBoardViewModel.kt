package com.recipe.search.ui.view.dashboard

import dagger.Binds
import dagger.Module

@Module
abstract class DashBoardViewModel {
    @Binds
    abstract fun provideSplashView(activity: DashBoardActivity): DashBoardContract.View
}