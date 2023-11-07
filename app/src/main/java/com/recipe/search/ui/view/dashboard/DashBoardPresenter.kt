package com.recipe.search.ui.view.dashboard

import android.util.Log
import com.recipe.search.R
import com.recipe.search.base.BasePresenter
import com.recipe.search.data.network.SSDisposableSingleObserver
import com.recipe.search.data.network.api_response.GetSearchResponse
import com.recipe.search.data.network.api_service.SearchApiService
import javax.inject.Inject

class DashBoardPresenter
@Inject constructor(view: DashBoardContract.View) : BasePresenter<DashBoardContract.View>(view),
    DashBoardContract.Presenter
    {
        @Inject
        lateinit var searchApiService: SearchApiService
        override fun recipeSearchList(search: String) {
            if (this::searchApiService.isInitialized) {
                mView?.onNetworkCallStarted(context.getString(R.string.please_wait))
                compositeDisposable?.add(
                    searchApiService.getRecipesList(search)
                        .subscribeOn(appSchedulerProvider.io())
                        .unsubscribeOn(appSchedulerProvider.computation())
                        .observeOn(appSchedulerProvider.ui())
                        .subscribeWith(object :
                            SSDisposableSingleObserver<GetSearchResponse, DashBoardContract.View>(mView) {
                            override fun onRequestSuccess(response: GetSearchResponse) {
                                mView?.getRecipeSearchResponse(response)
                            }

                            override fun onSuccess(t: GetSearchResponse) {
                                mView?.getRecipeSearchResponse(t)
                            }

                            override fun onError(throwable: Throwable) {
                                super.onError(throwable)
                                Log.d("error",throwable.message.toString())
                                mView?.noDataFound(throwable.message.toString())
                            }

                        })
                )
            }
        }


    }
