package com.recipe.search.ui.view.auth.signUp

import android.content.Context
import com.recipe.search.utils.ValidationUtils
import com.recipe.search.utils.showToast


class SignUp(myContext: Context) {

    var myContext: Context;
    private lateinit var validation: ValidationUtils


    init {
        this.myContext = myContext;
    }

    fun checkSignupValidation(username: String,email:String, password: String,confirmPassword:String): Boolean{

        validation = ValidationUtils()
        when{

            username.isEmpty()->myContext.showToast("UserName must be Required")
            email.isEmpty()->myContext.showToast("Email must be Required")
            password.isEmpty()->myContext.showToast("Password must be Required")
            confirmPassword.isEmpty()->myContext.showToast("Confirm Password must be Required")



            validation.checkUsername(username) != null ->  myContext.showToast("Invalid UserName")
            validation.checkIfEmailIsValid(email) != null ->  myContext.showToast("Invalid Email Address")
            validation.checkvalidPassword(password) != null -> myContext.showToast("Minimum 8 Character Password and Must Contain 1 Upper-case Character, 1 Lower-case Character and 1 Special Character (@#\$%^&+=) ")
            validation.checkConfirmPassword(password,confirmPassword) != null  -> myContext.showToast("Password Do not Match")



            else -> {

                return true;
            }
        }
        return false
    }


}