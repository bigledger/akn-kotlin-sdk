package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.idservices

import com.akaun.kt.sdk.models.aggregates.erp.applogin.AppLoginRegistrationModel
import com.akaun.kt.sdk.models.dbschema.RegistrationRequest
import com.akaun.kt.sdk.models.dbschema.ResendConfirmationRequest
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


object IdentityRegistrationPrefix{
    const val PREFIX = Core2Config.PLATFORM_DOMAIN_URL_PREFIX + "identity/registration"
}
interface IdentityRegistrationService{


    @POST(IdentityRegistrationPrefix.PREFIX + "/with-token/email/public-ep")
    suspend fun registerWithEmail(
        @Body registrationRequest: RegistrationRequest,
        @Query("tenantCode") tenantCode: String? = null,
        @Query("websiteCode") websiteCode: String? = null,
        @Query("inviteKey") inviteKey: String? = null
    ): BasicApiResponseModel<AppLoginRegistrationModel>

    @POST(IdentityRegistrationPrefix.PREFIX + "/with-token/mobile-number/public-ep")
    suspend fun registerWithMobileNumber(
        @Body registrationRequest: RegistrationRequest,
        @Query("tenantCode") tenantCode: String? = null,
        @Query("websiteCode") websiteCode: String? = null,
        @Query("inviteKey") inviteKey: String? = null
    ): BasicApiResponseModel<AppLoginRegistrationModel>

    @GET(IdentityRegistrationPrefix.PREFIX + "/generate-token/public-ep")
    suspend fun generateJWTToken(
        @Query("gRecaptchaResponseToken") gRecaptchaResponseToken: String? = null,
    ): BasicApiResponseModel<String?>

    @GET(IdentityRegistrationPrefix.PREFIX + "/generate-token-without-captcha/public-ep")
    suspend fun generateJWTTokenWithoutCaptcha(
    ): BasicApiResponseModel<String?>

    @POST(IdentityRegistrationPrefix.PREFIX + "/resend_confirmation_email")
    suspend fun resendConfirmationEmail(
        @Body resendConfirmationRequest: ResendConfirmationRequest,
        @Query("tenantCode") tenantCode: String? = null
    ): BasicApiResponseModel<AppLoginRegistrationModel>

    @POST(IdentityRegistrationPrefix.PREFIX + "/resend_confirmation_mobile_number")
    suspend fun resendConfirmationMobileNumber(
        @Body resendConfirmationRequest: ResendConfirmationRequest,
        @Query("tenantCode") tenantCode: String? = null
    ): BasicApiResponseModel<AppLoginRegistrationModel>

}