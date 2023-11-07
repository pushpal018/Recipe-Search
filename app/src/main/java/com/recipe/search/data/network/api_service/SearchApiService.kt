package com.recipe.search.data.network.api_service

import com.recipe.search.data.network.APIs
import com.recipe.search.data.network.api_response.GetSearchResponse
import com.recipe.search.data.network.api_response.RecipeDetailsResponseModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchApiService {

    @GET(APIs.SEARCH)
    fun getRecipesList(@Query("q") page: String): Single<GetSearchResponse>

    @GET(APIs.DETAILS)
    fun getRecipesDetails(@Query("rId") recipe: String): Single<RecipeDetailsResponseModel>
}