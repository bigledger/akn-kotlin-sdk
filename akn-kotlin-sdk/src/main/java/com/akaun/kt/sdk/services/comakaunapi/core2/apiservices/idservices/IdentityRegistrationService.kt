package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.idservices

import com.akaun.kt.sdk.models.aggregates.erp.applogin.AppLoginRegistrationModel
import com.akaun.kt.sdk.models.dbschema.RegistrationRequest
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query


object IdentityRegistrationPrefix{
    const val PREFIX = Core2Config.PLATFORM_DOMAIN_URL_PREFIX + "identity/registration"
}
interface IdentityRegistrationService{


    @POST(IdentityRegistrationPrefix.PREFIX + "/with-token/email/public-ep")
    fun registerWithEmail(
        @Body registrationRequest: RegistrationRequest,
        @Query("tenantCode") tenantCode: String? = null,
        @Query("websiteCode") websiteCode: String? = null,
        @Query("inviteKey") inviteKey: String? = null
    ): BasicApiResponseModel<AppLoginRegistrationModel>

    @POST(IdentityRegistrationPrefix.PREFIX + "/with-token/mobile-number/public-ep")
    fun registerWithMobileNumber(
        @Body registrationRequest: RegistrationRequest,
        @Query("tenantCode") tenantCode: String? = null,
        @Query("websiteCode") websiteCode: String? = null,
        @Query("inviteKey") inviteKey: String? = null
    ): BasicApiResponseModel<AppLoginRegistrationModel>

}