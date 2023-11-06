package com.recipe.search.ui.view.auth.signUp

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.recipe.search.base.MvpBaseActivity
import com.recipe.search.databinding.ActivitySignUpBinding


class SignUpActivity : MvpBaseActivity<SignUpPresenter>(), SignUpContract.View  {

    private lateinit var binding: ActivitySignUpBinding

    override fun getContentView(): View {
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        return view
    }

    override fun onViewReady(savedInstanceState: Bundle?, intent: Intent) {

    }
}