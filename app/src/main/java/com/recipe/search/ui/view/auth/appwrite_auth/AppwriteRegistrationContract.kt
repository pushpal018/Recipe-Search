package com.recipe.search.ui.view.auth.appwrite_auth

import com.recipe.search.base.BaseContract
import com.recipe.search.data.network.api_response.SignUpResponseModel

interface AppwriteRegistrationContract {

    interface View : BaseContract.View{


        fun signupDidSucceed(response: SignUpResponseModel)
    }


    interface Presenter : BaseContract.Presenter {
        fun doSignUp(dataMap: HashMap<String, String>)
    }
}