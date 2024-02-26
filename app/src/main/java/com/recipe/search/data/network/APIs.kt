package com.recipe.search.data.network

object APIs {

    //BASR URL
    const val BASE_URL = "https://forkify-api.herokuapp.com/api/"
    const val BASE_URL_Appwrite = "https://cloud.appwrite.io/v1/"




    ///SEARCH
    const val SEARCH = "${BASE_URL}search"

    ///DETAILS
    const val DETAILS = "${BASE_URL}get"

    const val LOGIN = "${BASE_URL}login"


    //Appwrite Signup
    const val SIGNUP = "${BASE_URL}account"



    val CACHING_URLs = arrayOf(
        //banner
        "$BASE_URL$LOGIN"
    )

}