package com.recipe.search.ui.view.auth.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.recipe.search.base.MvpBaseActivity
import com.recipe.search.databinding.ActivityLoginBinding
import com.recipe.search.ui.view.dashboard.DashBoardActivity
import com.recipe.search.utils.Navigator

class LoginActivity :  MvpBaseActivity<LoginPresenter>(), LoginContract.View {

    private lateinit var binding: ActivityLoginBinding
    override fun getContentView(): View {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        return view
    }

    override fun onViewReady(savedInstanceState: Bundle?, intent: Intent) {

        binding.btnLogin.setOnClickListener {
            Navigator.sharedInstance.navigate(getContext(),DashBoardActivity::class.java)
        }




    }

}