package com.akaun.kt.app.delivery.driverapp.network

import com.akaun.kt.app.delivery.driverapp.model.job.JobsDeliveryStatusDto
import com.akaun.kt.sdk.models.aggregates.erp.deljob.JobModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.criteria.JobHdrListingQueryCriteria
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query



object Core2UrlJobPrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + "del/jobs"
}


interface DelJobService {
    @GET(  Core2UrlJobPrefix.PREFIX +  "/backoffice-ep/query")
    suspend fun getJobs(
        @Query("calcTotalRecords") calcTotalRecords : Boolean,
        @Query("orderBy") orderBy : String,
        @Query("order") order : String,
        @Query("guid_trip_hdr") tripGuid : String,
        @Query("limit") limit : Int,
        @Query("offset") offset : Int
    ): PagingResponseModel<JobModel>

    @POST(Core2UrlJobPrefix.PREFIX + "/login-driver-ep/job-hdr-listings/query")
    suspend fun getJobHdrListingForLoginDriverByPost(
        @Body jobHdrListingQueryCriteria : JobHdrListingQueryCriteria
    ) : ApiResponseModel<JobModel>

    @POST(Core2UrlJobPrefix.PREFIX + "/login-driver-ep/complete-jobs/{guid}")
    suspend fun completeJobsLoginDriverEp(
        @Path("guid") guid : String
    ) : BasicApiResponseModel<JobsDeliveryStatusDto>

    @PUT(Core2UrlJobPrefix.PREFIX )
    suspend fun updateJob(
        @Body jobModel: JobModel
    ) : BasicApiResponseModel<JobModel>
}