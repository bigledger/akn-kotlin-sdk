package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.idservices

import com.akaun.kt.sdk.models.dbschema.ForgotPasswordConfirmRequest
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

object IdentityPasswordPrefix{
    const val PREFIX = Core2Config.PLATFORM_DOMAIN_URL_PREFIX + "/identity/password"
}

interface IdentityPasswordService{

    @POST( IdentityPasswordPrefix.PREFIX  + "/reset_confirm")
    fun forgotPasswordConfirm(
        @Body ForgotPasswordConfirmRequest: ForgotPasswordConfirmRequest
    ) : BasicApiResponseModel<String?>

    @POST( IdentityPasswordPrefix.PREFIX  + "/reset_init")
    fun forgotPasswordInit(
        @Body ForgotPasswordConfirmRequest: ForgotPasswordConfirmRequest,
        @Query("tenantCode") tenantCode: String? = null
    ) : BasicApiResponseModel<String?>
}