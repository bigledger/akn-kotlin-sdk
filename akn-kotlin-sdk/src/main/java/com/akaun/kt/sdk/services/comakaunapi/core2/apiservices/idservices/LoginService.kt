package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.idservices

import com.akaun.kt.sdk.models.aggregates.erp.UserAppletLinkResponse
import com.akaun.kt.sdk.models.dbschema.GoogleLoginRequest
import com.akaun.kt.sdk.models.dbschema.LoginRequest
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query



object LoginServicePrefix {
    const val PREFIX = Core2Config.PLATFORM_DOMAIN_URL_PREFIX + "identity/login"
}
interface LoginService {
    @POST(LoginServicePrefix.PREFIX + "/no-applet-loading")
    suspend fun loginWithCall(
        @Body loginRequest: LoginRequest,
        @Query("tenantCode") tenantCode :String? = null
    ): Call<BasicApiResponseModel<LoginResponse>>

    @POST(LoginServicePrefix.PREFIX + "/no-applet-loading")
    suspend fun login(
        @Body loginRequest: LoginRequest,
        @Query("tenantCode") tenantCode :String? = null
    ): BasicApiResponseModel<LoginResponse>

    @POST(LoginServicePrefix.PREFIX  + "/google")
    suspend fun loginToGoogleWithCall(
        @Body loginRequest: GoogleLoginRequest,
        @Query("inviteKey") inviteKey :String? = null
    ): Call<BasicApiResponseModel<LoginResponse>>

    @POST(LoginServicePrefix.PREFIX  + "/google")
    suspend fun loginToGoogle(
        @Body loginRequest: GoogleLoginRequest,
        @Query("inviteKey") inviteKey :String? = null
    ): BasicApiResponseModel<LoginResponse>

    @GET(Core2Config.PLATFORM_DOMAIN_URL_PREFIX  + "applets/user-applet-links")
    suspend fun getUserAppletLInks(): ApiResponseModel<UserAppletLinkResponse>

    @GET(Core2Config.PLATFORM_DOMAIN_URL_PREFIX  + "applets/user-applet-links")
    suspend fun getUserAppletLInksWithCall(): Call<ApiResponseModel<UserAppletLinkResponse>>
}