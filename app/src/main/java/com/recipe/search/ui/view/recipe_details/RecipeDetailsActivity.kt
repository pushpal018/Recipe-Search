package com.recipe.search.ui.view.recipe_details

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.recipe.search.R
import com.recipe.search.base.MvpBaseActivity
import com.recipe.search.data.network.api_response.RecipeDetailsResponseModel
import com.recipe.search.data.network.api_response.Recipes
import com.recipe.search.databinding.ActivityRecipeDetailsBinding
import com.recipe.search.ui.adapter.RecipeDetailsAdapter
import com.recipe.search.ui.adapter.SearchAdapter

class RecipeDetailsActivity : MvpBaseActivity<RecipeDetailsPresenter>(), RecipeDetailsContract.View  {
    private lateinit var binding:ActivityRecipeDetailsBinding

    private var recipesList = ArrayList<String>()
    private lateinit var recipeAdapter: RecipeDetailsAdapter

    override fun getContentView(): View {

        binding = ActivityRecipeDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        return view


    }

    override fun onViewReady(savedInstanceState: Bundle?, intent: Intent) {

        val recipeId = intent.getStringExtra("recipe_id")

        Log.d("recipeId",recipeId.toString())
        mPresenter.recipeDetailsList(recipeId.toString())
    }


    private fun recycleViewAdapterSetup() {

        val linearLayoutManager = LinearLayoutManager(this)
        binding.rvRecipe.layoutManager = linearLayoutManager
        recipeAdapter = RecipeDetailsAdapter(this, recipesList)
        binding.rvRecipe.adapter = recipeAdapter

    }

    override fun getRecipeDetailsResponse(response: RecipeDetailsResponseModel) {

        Log.d("Recipe Details",response.recipe.toString())
        response.recipe?.socialRank

        binding.tvRecipeTitle.text = response.recipe?.title.toString()

        Glide.with(this)
            .load(response.recipe?.imageUrl.toString())
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.img_placeholder)
            .into(binding.ivRecipeImage)


        recipesList = response.recipe?.ingredients!!

        val linearLayoutManager = LinearLayoutManager(this)
        binding.rvRecipe.layoutManager = linearLayoutManager

        recipeAdapter = RecipeDetailsAdapter(this, recipesList)
        binding.rvRecipe.adapter = recipeAdapter
        recycleViewAdapterSetup()
    }



}