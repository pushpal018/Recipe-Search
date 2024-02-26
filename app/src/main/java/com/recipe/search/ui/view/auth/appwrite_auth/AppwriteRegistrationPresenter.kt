package com.recipe.search.ui.view.auth.appwrite_auth

import com.recipe.search.R
import com.recipe.search.base.BasePresenter
import com.recipe.search.data.network.SSDisposableSingleObserver
import com.recipe.search.data.network.api_response.SignUpResponseModel
import com.recipe.search.data.network.api_service.SearchApiService
import javax.inject.Inject

class AppwriteRegistrationPresenter @Inject constructor(view: AppwriteRegistrationContract.View) : BasePresenter<AppwriteRegistrationContract.View>(view), AppwriteRegistrationContract.Presenter{


    @Inject
    lateinit var searchApiService: SearchApiService
    override fun doSignUp(dataMap: HashMap<String, String>) {

        mView?.onNetworkCallStarted(context.getString(R.string.please_wait))
        compositeDisposable?.add(
            searchApiService.doSignUp(dataMap)
                .subscribeOn(appSchedulerProvider.io())
                .unsubscribeOn(appSchedulerProvider.computation())
                .observeOn(appSchedulerProvider.ui())
                .subscribeWith(object :
                    SSDisposableSingleObserver<SignUpResponseModel, AppwriteRegistrationContract.View>(mView) {
                    override fun onRequestSuccess(response: SignUpResponseModel) {

                        mView?.signupDidSucceed(response)

                    }


                })
        )

    }
}