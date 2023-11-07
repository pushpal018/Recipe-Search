package com.recipe.search.ui.view.recipe_details

import com.recipe.search.base.BaseContract
import com.recipe.search.data.network.api_response.RecipeDetailsResponseModel

interface RecipeDetailsContract {

    interface View : BaseContract.View {

        fun getRecipeDetailsResponse(response: RecipeDetailsResponseModel)
    }

    interface Presenter : BaseContract.Presenter {

        fun recipeDetailsList(rId: String)

    }
}