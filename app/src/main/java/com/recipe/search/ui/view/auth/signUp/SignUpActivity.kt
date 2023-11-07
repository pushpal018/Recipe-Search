package com.recipe.search.ui.view.auth.signUp

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import com.recipe.search.base.MvpBaseActivity
import com.recipe.search.databinding.ActivitySignUpBinding
import com.recipe.search.utils.AppwriteInit
import io.appwrite.ID
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class SignUpActivity : MvpBaseActivity<SignUpPresenter>(), SignUpContract.View  {

    private lateinit var binding: ActivitySignUpBinding


    private lateinit var appwriteInit: AppwriteInit

    private var isPinVisible = false
    private val VISIBLE: HideReturnsTransformationMethod = HideReturnsTransformationMethod.getInstance()
    private val HIDDEN: PasswordTransformationMethod = PasswordTransformationMethod.getInstance()


    private lateinit var signup: SignUp

    override fun getContentView(): View {
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        return view
    }

    override fun onViewReady(savedInstanceState: Bundle?, intent: Intent) {

        appwriteInit = AppwriteInit(this)
        signup= SignUp(this)


        binding.ivPinVisibility.setOnClickListener {
            isPinVisible = !isPinVisible
            binding.ivPinVisibility.isSelected = isPinVisible
            binding.etPin.transformationMethod = if (isPinVisible) VISIBLE else HIDDEN
            binding.etPin.setSelection(binding.etPin.text!!.length)
        }
        binding.ivPinVisibilityConfirm.setOnClickListener {
            isPinVisible = !isPinVisible
            binding.ivPinVisibilityConfirm.isSelected = isPinVisible
            binding.etPinConfirm.transformationMethod = if (isPinVisible) VISIBLE else HIDDEN
            binding.etPinConfirm.setSelection(binding.etPinConfirm.text!!.length)
        }

        binding.btnCreateAccount.setOnClickListener {

            showProgressDialog("")

            val username = binding.etUserName.text.toString()
            val useremail = binding.etUserEmail.text.toString()
            val userpassword = binding.etPin.text.toString()
            val confirmPassword = binding.etPinConfirm.text.toString()

            val data=signup.checkSignupValidation(username,useremail,userpassword,confirmPassword)
            if(data){

                GlobalScope.launch {
                    appwriteInit.register(username,useremail, userpassword)

                    hideProgressDialog()
                }
            }else{
                appwriteInit.loader?.cancel()
            }
        }

    }
}