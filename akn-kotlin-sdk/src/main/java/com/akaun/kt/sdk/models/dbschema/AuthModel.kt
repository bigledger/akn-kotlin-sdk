package com.akaun.kt.sdk.models.dbschema

import java.time.ZonedDateTime

data class LoginRequest(
    var password: String,
    var email: String? = null,
    var mobileNumber: String? = null
)

data class GoogleLoginRequest(
    val googleToken: String = "",
    val googleAppId: String = ""
)

data class RegistrationRequest(
    var password: String? = null,
    var email: String? = null,
    var mobileNumber: String? = null,
    var pinNumber: String? = null,
    var hostName: String? = null,
    var messageTemplate: String? = null,
    var validDateEnd: ZonedDateTime? = null,
    var description: String = "AKAUN",
    var domain: String = "akaun.com",
    var appLoginSubjectExtList: List<bl_applet_login_subject_link_ext> = emptyList(),
    var nameFirst: String? = null,
    var nameLast: String? = null,
    var dob: ZonedDateTime? = null,
    var appLoginType: LoginSubjectType? = null
)

data class ResendConfirmationRequest(
    var email: String?  = null,
    var mobileNumber: String?  = null,
    var messageTemplate: String? = null
)

data class ForgotPasswordConfirmRequest (
    var email : String? = null,
    var mobileNumber : String? = null,
    var confirmationCode  : String? = null,
    var newPassword  : String? = null,
)

data class ForgotPasswordInitRequest(
    var email: String?  = null,
    var mobileNumber: String?  = null,
    var messageTemplate: String? = null
)
enum class LoginSubjectType {
    PLATFORM, TENANT
}
