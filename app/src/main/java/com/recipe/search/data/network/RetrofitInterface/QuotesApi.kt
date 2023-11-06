package com.recipe.search.data.network.RetrofitInterface


import com.recipe.search.model.QuoteList
import retrofit2.Response
import retrofit2.http.GET

interface QuotesApi {

    @GET("/quotes")
    suspend fun getQuotes() : Response<QuoteList>
}