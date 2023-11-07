package com.recipe.search.ui.view.dashboard

import com.recipe.search.base.BaseContract
import com.recipe.search.data.network.api_response.GetSearchResponse

interface DashBoardContract {

    interface View : BaseContract.View {

        fun getRecipeSearchResponse(response: GetSearchResponse)

        fun noDataFound(message:String)
    }

    interface Presenter : BaseContract.Presenter {

        fun recipeSearchList(search: String)
    }
}