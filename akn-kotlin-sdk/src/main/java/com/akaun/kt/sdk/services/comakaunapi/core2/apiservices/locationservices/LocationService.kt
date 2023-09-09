package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.locationservices

import com.akaun.kt.sdk.models.aggregates.erp.location.LocationModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import retrofit2.http.GET
import retrofit2.http.Path

interface LocationService {
    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + "locations/{guid}")
    suspend fun getLocationByGuid(
        @Path("guid") guid: String
    ): BasicApiResponseModel<LocationModel>

    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + "locations")
    suspend fun getLocationAll(): ApiResponseModel<LocationModel>

}