package com.recipe.search.ui.view.recipe_details

import android.util.Log
import com.recipe.search.R
import com.recipe.search.base.BasePresenter
import com.recipe.search.data.network.SSDisposableSingleObserver
import com.recipe.search.data.network.api_response.RecipeDetailsResponseModel


import com.recipe.search.data.network.api_service.SearchApiService
import javax.inject.Inject

class RecipeDetailsPresenter
@Inject constructor(view: RecipeDetailsContract.View) : BasePresenter<RecipeDetailsContract.View>(view),
    RecipeDetailsContract.Presenter {

    @Inject
    lateinit var recipeApiService: SearchApiService
    override fun recipeDetailsList(rId: String) {

        if (this::recipeApiService.isInitialized) {
            mView?.onNetworkCallStarted(context.getString(R.string.please_wait))
            compositeDisposable?.add(
                recipeApiService.getRecipesDetails(rId)
                    .subscribeOn(appSchedulerProvider.io())
                    .unsubscribeOn(appSchedulerProvider.computation())
                    .observeOn(appSchedulerProvider.ui())
                    .subscribeWith(object :
                        SSDisposableSingleObserver<RecipeDetailsResponseModel, RecipeDetailsContract.View>(mView) {
                        override fun onRequestSuccess(response: RecipeDetailsResponseModel) {
                            mView?.getRecipeDetailsResponse(response)
                        }

                    })
            )
        }

    }


}