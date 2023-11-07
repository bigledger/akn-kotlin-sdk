package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.deljobservices


import com.akaun.kt.sdk.services.comakaunapi.core2.dto.JobsDto
import com.akaun.kt.sdk.models.aggregates.erp.pickpackqueue.FinanciaPickPackQueueModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import retrofit2.http.Body
import retrofit2.http.POST



object Core2UrlJobsDocPrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + "del/job-docs"
}


interface JobsDocService {

    @POST(Core2UrlJobsDocPrefix.PREFIX + "/cancel-job/login-driver-ep")
    suspend fun cancelJobLoginDriver(
        @Body JobsDto : JobsDto
    ) : ApiResponseModel<FinanciaPickPackQueueModel>

}