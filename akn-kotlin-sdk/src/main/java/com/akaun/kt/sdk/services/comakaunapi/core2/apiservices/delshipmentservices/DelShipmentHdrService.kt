package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.delshipmentservices

import com.akaun.kt.app.delivery.driverapp.model.job.JobsDto
import com.akaun.kt.sdk.models.dbschema.bl_del_shipment_processing_open_queue
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import retrofit2.http.Body
import retrofit2.http.POST


object Core2UrlDelShipmentHdrPrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + "delivery-shipment-hdr"
}

interface DelShipmentHdrService {

    @POST(Core2UrlDelShipmentHdrPrefix.PREFIX + "/login-driver-ep/cancel-jobs-from-shipment")
    suspend fun cancelJobsFromShipmentLoginDriverEp(
        @Body jobsDto : JobsDto
    ) : ApiResponseModel<bl_del_shipment_processing_open_queue>
}