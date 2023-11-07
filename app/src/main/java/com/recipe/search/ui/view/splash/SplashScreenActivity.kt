package com.recipe.search.ui.view.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View

import com.recipe.search.base.MvpBaseActivity
import com.recipe.search.data.prefs.PrefKeys
import com.recipe.search.data.prefs.PreferenceManager
import com.recipe.search.databinding.ActivitySplashScreenBinding
import com.recipe.search.ui.view.auth.login.LoginActivity
import com.recipe.search.ui.view.dashboard.DashBoardActivity
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

        mPrefManager = PreferenceManager(this)

        Handler().postDelayed({
            if (mPrefManager.getBoolean(PrefKeys.LOGGED_IN, false)) {
                val intent = Intent(this, DashBoardActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }

            finish()
        }, 2000)

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

