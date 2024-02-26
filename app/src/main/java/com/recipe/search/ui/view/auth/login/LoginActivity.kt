package com.recipe.search.ui.view.auth.login

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.ImageView
import com.recipe.search.base.MvpBaseActivity
import com.recipe.search.databinding.ActivityLoginBinding
import com.recipe.search.ui.view.auth.appwrite_auth.AppwriteRegistrationActivity
import com.recipe.search.ui.view.auth.signUp.SignUpActivity
import com.recipe.search.ui.view.dashboard.DashBoardActivity
import com.recipe.search.utils.AppwriteInit
import com.recipe.search.utils.Navigator
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class LoginActivity :  MvpBaseActivity<LoginPresenter>(), LoginContract.View {

    private lateinit var binding: ActivityLoginBinding

    private lateinit var appwriteInit: AppwriteInit

    private var isPinVisible = false
    private val VISIBLE: HideReturnsTransformationMethod =
        HideReturnsTransformationMethod.getInstance()
    private val HIDDEN: PasswordTransformationMethod = PasswordTransformationMethod.getInstance()

    private lateinit var login: Login



    override fun getContentView(): View {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        return view
    }

    override fun onViewReady(savedInstanceState: Bundle?, intent: Intent) {

        appwriteInit = AppwriteInit(this)
        login = Login(this)


        binding.ivPinVisibility.setOnClickListener {

            isPinVisible = !isPinVisible
            binding.ivPinVisibility.isSelected = isPinVisible
            binding.etPin.transformationMethod = if (isPinVisible) VISIBLE else HIDDEN
            binding.etPin.setSelection(binding.etPin.text!!.length)

        }



        binding.btnLogin.setOnClickListener {

            showProgressDialog("")

            val user_email = binding.etUserEmail.text.toString()
            val user_pass = binding.etPin.text.toString()

            val data = login.checkSignupValidation(user_email,user_pass )
            if (data) {

                GlobalScope.launch {
                    appwriteInit.login(user_email, user_pass)

                    hideProgressDialog()
                }

            }else{
                appwriteInit.loader?.cancel()
            }

        }

        binding.llSignupBtn.setOnClickListener {
            Navigator.sharedInstance.navigate(this, AppwriteRegistrationActivity::class.java)
        }




    }

}