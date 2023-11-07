package com.recipe.search.ui.view.dashboard

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.core.view.GravityCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.recipe.search.R
import com.recipe.search.base.MvpBaseActivity
import com.recipe.search.databinding.ActivityDashBoardBinding
import com.google.android.material.navigation.NavigationView
import com.recipe.search.data.network.api_response.GetSearchResponse
import com.recipe.search.data.network.api_response.Recipes
import com.recipe.search.ui.adapter.SearchAdapter


class DashBoardActivity : MvpBaseActivity<DashBoardPresenter>(), DashBoardContract.View {
    val handler = Handler()

    private lateinit var binding: ActivityDashBoardBinding

    private var recipesList = ArrayList<Recipes>()
    private lateinit var searchAdapter: SearchAdapter


    override fun getContentView(): View {
        binding = ActivityDashBoardBinding.inflate(layoutInflater)
        val view = binding.root
        return view
    }

    override fun onViewReady(savedInstanceState: Bundle?, intent: Intent) {


        binding.btnSearch.setOnClickListener {

            val search = binding.etSearch.text.toString()
            mPresenter.recipeSearchList(search)

            binding.etSearch.setText("")

            /////hide soft keyboard
            val view: View? = this.currentFocus
            if (view != null) {
                val inputMethodManager =
                    getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0)
            }
        }


    }

    private fun recycleViewAdapterSetup() {

        val linearLayoutManager = LinearLayoutManager(this)
        binding.rvRecipe.layoutManager = linearLayoutManager
        searchAdapter = SearchAdapter(this, recipesList)
        binding.rvRecipe.adapter = searchAdapter

    }


    override fun getRecipeSearchResponse(response: GetSearchResponse) {
        Log.d("response", response.toString())

        hideProgressDialog()

        binding.llRecipe.isVisible = true
        binding.llNoDataFound.isVisible = false

        binding.tvCount.text = "(" + response.count.toString() + ")"
        recipesList = response.recipes

        val linearLayoutManager = LinearLayoutManager(this)
        binding.rvRecipe.layoutManager = linearLayoutManager

        searchAdapter = SearchAdapter(this, recipesList)
        binding.rvRecipe.adapter = searchAdapter
        recycleViewAdapterSetup()
    }

    override fun noDataFound(message: String) {

        hideProgressDialog()

        binding.tvCount.text = "(0)"

        binding.llRecipe.isVisible = false
        binding.llNoDataFound.isVisible = true

        binding.tvNoData.text = "Couldn't find recipe with that name"
    }


}
