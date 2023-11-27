package com.akaun.kt.sdk.models.dbschema

import java.time.ZonedDateTime

data class LoginRequest(
    val password: String,
    val email: String? = null,
    val mobileNumber: String? = null
)

data class GoogleLoginRequest(
    val googleToken: String = "",
    val googleAppId: String = ""
)

data class RegistrationRequest(
    val password: String? = null,
    val email: String? = null,
    val mobileNumber: String? = null,
    val pinNumber: String? = null,
    val hostName: String? = null,
    val messageTemplate: String? = null,
    val validDateEnd: ZonedDateTime? = null,
    val description: String = "AKAUN",
    val domain: String = "akaun.com",
    val appLoginSubjectExtList: List<bl_applet_login_subject_link_ext> = emptyList(),
    val nameFirst: String? = null,
    val nameLast: String? = null,
    val dob: ZonedDateTime? = null,
    val appLoginType: LoginSubjectType? = null
)

enum class LoginSubjectType {
    PLATFORM, TENANT
}
