package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared

import com.akaun.kt.sdk.models.dbschema.bl_fi_mst_entity_login_subject_link

data class BasicApiResponseModel<T>(
    val code: String?,
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
    val message: String?
)

// Additional attributes excluded
//data class AppletTenantToken(
//    val tenantCode: String,
//    val appletCode: String,
//    val token: String
//)

data class AppletTenantToken(
    val tenantCode: String,
    val appletCode: String,
    val token: String,
    val appletGuid : String,
    val tenantGuid : String
)

data class LoginResponse(
    val appletTenantTokenList: List<AppletTenantToken>,
    val authToken: String,
    val bl_fi_mst_entity_login_subject_link: List<bl_fi_mst_entity_login_subject_link>,
    val email: String,
    val mobileNumber: String,
    val subjectGuid: String?
)