package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared

data class ApiVisa(
    val tenantCode: String?,
    val applet_code: String?,
    val api_domain_url: String?,
    val jwt_secret: String,
    val AccessID: String?,
    val AccessKey: String?
)