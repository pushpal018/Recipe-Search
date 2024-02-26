package com.recipe.search.data.network.api_response

import com.google.gson.annotations.SerializedName

data class SignUpResponseModel(

    @SerializedName("name"              ) var name              : String?           = null,
    @SerializedName("registration"      ) var registration      : String?           = null,
    @SerializedName("status"            ) var status            : Boolean?          = null,
    @SerializedName("labels"            ) var labels            : ArrayList<String> = arrayListOf(),
    @SerializedName("passwordUpdate"    ) var passwordUpdate    : String?           = null,
    @SerializedName("email"             ) var email             : String?           = null,
    @SerializedName("phone"             ) var phone             : String?           = null,
    @SerializedName("emailVerification" ) var emailVerification : Boolean?          = null,
    @SerializedName("phoneVerification" ) var phoneVerification : Boolean?          = null,
    @SerializedName("accessedAt"        ) var accessedAt        : String?           = null
)

