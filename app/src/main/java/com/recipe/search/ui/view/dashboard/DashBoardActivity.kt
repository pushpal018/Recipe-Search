package com.recipe.search.ui.view.dashboard

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.recipe.search.R
import com.recipe.search.base.MvpBaseActivity
import com.recipe.search.databinding.ActivityDashBoardBinding
import com.google.android.material.navigation.NavigationView


class DashBoardActivity  : MvpBaseActivity<DashBoardPresenter>(), DashBoardContract.View
    {
    val handler = Handler()

    private lateinit var binding: ActivityDashBoardBinding


    override fun getContentView(): View {
        binding = ActivityDashBoardBinding.inflate(layoutInflater)
        val view = binding.root
        return view
    }

    override fun onViewReady(savedInstanceState: Bundle?, intent: Intent) {


    }


}
