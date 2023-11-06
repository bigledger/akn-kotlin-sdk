package com.akaun.kt.app.delivery.driverapp.network

import com.akaun.kt.sdk.models.aggregates.erp.deljob.JobAttachmentModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path


object Core2UrlJobAttachmentPrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + "del/job-attachments"
}


interface JobAttachmentService {

    @Multipart
    @POST(Core2UrlJobAttachmentPrefix.PREFIX + "/login-driver-ep")
    suspend fun createJobAttachment(
        @Part files: List<MultipartBody.Part>,
        @Part("data") data: JobAttachmentModel
    ): ApiResponseModel<JobAttachmentModel>

    @GET(Core2UrlJobAttachmentPrefix.PREFIX + "/login-driver-ep/file/{guid}")
    suspend fun getJobAttachmentFileByGuidLoginDriver(
        @Path("guid") guid : String
    ) : ResponseBody
}