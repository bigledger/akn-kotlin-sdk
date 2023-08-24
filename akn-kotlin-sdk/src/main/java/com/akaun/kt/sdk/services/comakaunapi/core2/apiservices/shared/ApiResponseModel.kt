package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared

data class BasicApiResponseModel<T>(
    val code: String,
    val message: String?,
    val data: T?
)

data class ApiResponseModel<T>(
    val code: String,
    val message: String?,
    val data: List<T>?
)

data class PagingResponseModel<T>(
    val data: List<T>,
    val totalRecords: Int,
    val offset: Int,
    val limit: Int,
    val code: String,
    val message: String
)

// Additional attributes excluded
data class AppletTenantToken(
    val tenantCode: String,
    val appletCode: String,
    val token: String
)

data class LoginResponse(
    val authToken: String,
    val tenantCodes: List<String>,
    val appletTenantTokenList: List<AppletTenantToken>,
    val subjectGuid: String,
    val email: String,
    val mobileNumber: String
)