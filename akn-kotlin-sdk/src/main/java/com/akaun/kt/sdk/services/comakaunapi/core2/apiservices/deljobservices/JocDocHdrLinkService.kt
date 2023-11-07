package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.deljobservices

import com.akaun.kt.sdk.models.aggregates.erp.deljob.JobDocHdrLinkModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import retrofit2.http.GET
import retrofit2.http.Query


object Core2UrlJobDocHdrLinkPrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + "del/job-dochdr-links"
}


interface JobDocHdrLinkService {
    @GET(  Core2UrlJobDocHdrLinkPrefix.PREFIX +  "/query")
    suspend fun getJobDocHdrLinkByCriteria(
        @Query("hdr_guid") jobHdrGuid : String,
        @Query("calcTotalRecords") calcTotalRecords : Boolean,
        @Query("order") order : String,
        @Query("limit") limit : Int,
        @Query("offset") offset : Int
    ): PagingResponseModel<JobDocHdrLinkModel>
}