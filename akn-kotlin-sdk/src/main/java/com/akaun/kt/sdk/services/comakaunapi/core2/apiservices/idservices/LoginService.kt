package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.idservices

import com.akaun.kt.sdk.models.dbschema.GoogleLoginRequest
import com.akaun.kt.sdk.models.dbschema.LoginRequest
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query


interface LoginService {
    @POST(Core2Config.PLATFORM_DOMAIN_URL_PREFIX + "identity/login")
    fun loginWithCall(
        @Body loginRequest: LoginRequest,
        @Query("tenantCode") tenantCode :String? = null
    ): Call<BasicApiResponseModel<LoginResponse>>

    @POST(Core2Config.PLATFORM_DOMAIN_URL_PREFIX + "identity/login")
    fun login(
        @Body loginRequest: LoginRequest,
        @Query("tenantCode") tenantCode :String? = null
    ): BasicApiResponseModel<LoginResponse>

    @POST(Core2Config.PLATFORM_DOMAIN_URL_PREFIX + "identity/login/google")
    fun loginToGoogleWithCall(
        @Body loginRequest: GoogleLoginRequest,
        @Query("inviteKey") inviteKey :String? = null
    ): Call<BasicApiResponseModel<LoginResponse>>

    @POST(Core2Config.PLATFORM_DOMAIN_URL_PREFIX + "identity/login/google")
    fun loginToGoogle(
        @Body loginRequest: GoogleLoginRequest,
        @Query("inviteKey") inviteKey :String? = null
    ): BasicApiResponseModel<LoginResponse>
}