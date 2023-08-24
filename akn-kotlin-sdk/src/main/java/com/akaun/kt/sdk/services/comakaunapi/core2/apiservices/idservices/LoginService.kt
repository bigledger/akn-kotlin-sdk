package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.idservices

import com.akaun.kt.sdk.models.dbschema.LoginRequest
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query


interface LoginService {
    @POST(Core2Config.PLATFORM_DOMAIN_URL_PREFIX + "identity/login")
    fun login(@Body loginRequest: LoginRequest
              , @Query("tenantCode") tenantCode :String? = null) : Call<LoginResponse>
}