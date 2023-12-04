package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.apppletloginsubjectservices

import com.akaun.kt.sdk.models.aggregates.erp.appletloginsubject.AppletLoginSubjectLinkModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Query

object Core2UrlAppletLoginSubjectLinkPrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + "applet-login-subject-link/"
}


interface AppletLoginSubjectLinkService {

    @GET(Core2UrlAppletLoginSubjectLinkPrefix.PREFIX + "query")
    suspend fun getAppletsUsersByCriteria(
        @Query("app_login_guid") app_login_guid : String,
        @Query("applet_hdr_guid") applet_hdr_guid : String,
        @Query("tenant_guid") tenant_guid : String,
        @Query("limit") limit : Int

    ): PagingResponseModel<AppletLoginSubjectLinkModel>

    @PUT(Core2UrlAppletLoginSubjectLinkPrefix.PREFIX)
    suspend fun updateAppletLoginSubject(
        @Body appletLoginSubjectContainer : AppletLoginSubjectLinkModel
    )  : BasicApiResponseModel<AppletLoginSubjectLinkModel>
}