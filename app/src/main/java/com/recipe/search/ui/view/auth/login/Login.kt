package com.recipe.search.ui.view.auth.login

import android.content.Context
import com.recipe.search.utils.ValidationUtils
import com.recipe.search.utils.showToast


class Login(myContext: Context) {

    var myContext: Context;
    private lateinit var validation: ValidationUtils


    init {
        this.myContext = myContext;
    }

    fun checkSignupValidation(email:String, password: String): Boolean{

        validation = ValidationUtils()
        when{

            email.isEmpty()->myContext.showToast("Email must be Required")
            password.isEmpty()->myContext.showToast("Password must be Required")

            validation.checkIfEmailIsValid(email) != null ->  myContext.showToast("Invalid Email Address")
            validation.checkvalidPassword(password) != null -> myContext.showToast("Minimum 8 Character Password and Must Contain 1 Upper-case Character, 1 Lower-case Character and 1 Special Character (@#\$%^&+=) ")


            else -> {

                return true;
            }
        }
        return false
    }


}