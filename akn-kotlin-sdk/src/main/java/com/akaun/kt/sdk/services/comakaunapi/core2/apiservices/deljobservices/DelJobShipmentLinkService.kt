package com.akaun.kt.app.delivery.driverapp.network


import com.akaun.kt.sdk.models.aggregates.erp.delshipment.DelJobShipmentLinkModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import retrofit2.http.GET
import retrofit2.http.Query


object Core2UrlDelJobShipmentLinkPrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + "del/job-shipment-links"
}

interface DelJobShipmentLinkService {

    @GET(Core2UrlDelJobShipmentLinkPrefix.PREFIX + "/login-driver-ep/query")
    suspend fun getJobShipmentLinkByCriteriaLoginDriver(
        @Query("calcTotalRecords") calcTotalRecords : Boolean? = true,
        @Query("orderBy") orderBy : String? = null,
        @Query("limit") limit : String? = null,
        @Query("job_hdr_guids") jobHdrGuids : Set<String>? = null,
    ) : PagingResponseModel<DelJobShipmentLinkModel>
}