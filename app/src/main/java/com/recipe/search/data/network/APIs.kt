package com.recipe.search.data.network

object APIs {

    //BASR URL
    const val BASE_URL = "https://forkify-api.herokuapp.com/api/"




    ///SEARCH
    const val SEARCH = "${BASE_URL}search"

    ///DETAILS
    const val DETAILS = "${BASE_URL}get"

    const val LOGIN = "${BASE_URL}login"



    val CACHING_URLs = arrayOf(
        //banner
        "$BASE_URL$LOGIN"
    )

}