package com.recipe.search.ui.view.recipe_details

import dagger.Binds
import dagger.Module

@Module
abstract class RecipeDetailsModule {
    @Binds
    abstract fun provideRecipeView(activity: RecipeDetailsActivity): RecipeDetailsContract.View
}