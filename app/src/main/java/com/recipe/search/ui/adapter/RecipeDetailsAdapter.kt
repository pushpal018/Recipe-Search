package com.recipe.search.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.recipe.search.R
import com.recipe.search.data.network.api_response.Recipe
import com.recipe.search.data.network.api_response.Recipes

class RecipeDetailsAdapter(

    private var context: Context,

    private var recipesList: ArrayList<String>


) :


    RecyclerView.Adapter<RecipeDetailsAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recipe_details_item_layout, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return recipesList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val recipes = recipesList[position]

        holder.ingredients.text = recipes.toString()
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var ingredients: TextView = itemView.findViewById<View>(R.id.tv_ingredients) as TextView




    }
}