package com.recipe.search.ui.view.auth.appwrite_auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.recipe.search.R
import com.recipe.search.base.MvpBaseActivity
import com.recipe.search.data.network.api_response.SignUpResponseModel
import com.recipe.search.databinding.ActivitySignUpBinding
import com.recipe.search.utils.showToast
import io.appwrite.ID

class AppwriteRegistrationActivity :  MvpBaseActivity<AppwriteRegistrationPresenter>(), AppwriteRegistrationContract.View {

    private lateinit var binding: ActivitySignUpBinding

    override fun getContentView(): View {
        binding = ActivitySignUpBinding .inflate(layoutInflater)
        val view = binding.root
        return view
    }

    override fun onViewReady(savedInstanceState: Bundle?, intent: Intent) {



        val signupData = HashMap<String, String>()
        signupData["userId"] = ID.unique()
        signupData["email"] = binding.etUserEmail.toString()
        signupData["password"] = binding.etPin.toString()
        signupData["name"] = binding.etUserName.toString()


        mPresenter.doSignUp(signupData)
    }

    override fun signupDidSucceed(response: SignUpResponseModel) {

        this.showToast("Login SuccessFully")
    }

}