package com.recipe.search.data.network.api_service

import com.recipe.search.data.network.APIs
import com.recipe.search.data.network.api_response.GetSearchResponse
import com.recipe.search.data.network.api_response.RecipeDetailsResponseModel
import com.recipe.search.data.network.api_response.SignUpResponseModel
import io.reactivex.Single
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface SearchApiService {

    @GET(APIs.SEARCH)
    fun getRecipesList(@Query("q") page: String): Single<GetSearchResponse>

    @GET(APIs.DETAILS)
    fun getRecipesDetails(@Query("rId") recipe: String): Single<RecipeDetailsResponseModel>

    @FormUrlEncoded
    @POST(APIs.SIGNUP)
    fun doSignUp(@FieldMap signupData : HashMap<String, String>): Single<SignUpResponseModel>


}