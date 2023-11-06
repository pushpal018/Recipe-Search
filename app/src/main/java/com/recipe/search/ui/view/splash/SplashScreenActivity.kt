package com.recipe.search.ui.view.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View

import com.recipe.search.base.MvpBaseActivity
import com.recipe.search.databinding.ActivitySplashScreenBinding
import com.recipe.search.ui.view.auth.login.LoginActivity
import com.recipe.search.utils.Navigator


class SplashScreenActivity : MvpBaseActivity<SplashPresenter>(), SplashContract.View  {


    val handler = Handler()

    var bundle=Bundle()

    private lateinit var binding: ActivitySplashScreenBinding

    override fun getContentView(): View {

        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        return view


    }

    override fun onViewReady(savedInstanceState: Bundle?, intent: Intent) {


        Handler().postDelayed({
            Navigator.sharedInstance.navigate(this, LoginActivity::class.java)
        }, 5000)

       // Glide.with(this).load(R.drawable.donate_blood_lg_clr).into(binding.ivImage);



    }

    override fun onNetworkCallStarted(loadingMessage: String) {
        TODO("Not yet implemented")
    }

    override fun onServerError() {
        TODO("Not yet implemented")
    }

    override fun onTimeOutError() {
        TODO("Not yet implemented")
    }

    override fun onNetworkUnavailable() {
        TODO("Not yet implemented")
    }

    override fun onSystemUpgrading() {
        TODO("Not yet implemented")
    }

    override fun onUserDidTooManyAttempts(errorMsg: String) {
        TODO("Not yet implemented")
    }


}

