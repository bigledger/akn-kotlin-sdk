package com.akaun.kt.sdk.models.dbschema

data class LoginRequest(
    val password: String,
    val email: String? = null,
    val mobileNumber: String? = null
)

data class GoogleLoginRequest(
    val googleToken: String = "",
    val googleAppId: String = ""
)
