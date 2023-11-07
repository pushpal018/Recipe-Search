package com.recipe.search.ui.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.recipe.search.R
import com.recipe.search.data.network.api_response.Recipes
import com.recipe.search.ui.view.dashboard.DashBoardActivity
import com.recipe.search.ui.view.recipe_details.RecipeDetailsActivity
import com.recipe.search.utils.Navigator

class SearchAdapter(

    private var context: Context,

    private var recipesList: ArrayList<Recipes>


):


    RecyclerView.Adapter<SearchAdapter.MyViewHolder>()  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recipe__item_layout, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return recipesList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val recipes = recipesList[position]

        holder.recipeId.text = recipes.recipeId
        holder.publisher.text = recipes.publisher
        holder.publisherUrl.text = recipes.publisherUrl
        holder.socialRank.text = recipes.socialRank.toString()
        holder.sourceUrl.text = recipes.sourceUrl
        holder.recipeTitle.text = recipes.title


        Glide.with(context)
            .load(recipes.imageUrl)
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.img_placeholder)
            .into(holder.recipeImage)


        holder.itemView.setOnClickListener {

            val intent = Intent(context, RecipeDetailsActivity::class.java)
            intent.putExtra("recipe_id", recipes.recipeId.toString())
            context.startActivity(intent)

        }
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        var recipeId: TextView = itemView.findViewById<View>(R.id.tv_recipe_id) as TextView
        var publisher: TextView = itemView.findViewById<View>(R.id.tv_publisher) as TextView
        var publisherUrl: TextView = itemView.findViewById<View>(R.id.tv_publisher_link) as TextView
        var socialRank: TextView = itemView.findViewById<View>(R.id.tv_social_rank) as TextView
        var sourceUrl: TextView = itemView.findViewById<View>(R.id.tv_source_url) as TextView
        var recipeTitle: TextView = itemView.findViewById<View>(R.id.tv_recipe_title) as TextView
        var recipeImage: ImageView = itemView.findViewById<View>(R.id.iv_recipe_image) as ImageView

    }
}