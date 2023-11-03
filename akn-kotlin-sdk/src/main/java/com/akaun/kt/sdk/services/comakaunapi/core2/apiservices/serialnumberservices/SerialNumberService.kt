package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.serialnumberservices

import com.akaun.kt.sdk.models.aggregates.erp.serialnumber.SerialNumberStatus
import com.akaun.kt.sdk.services.comakaunapi.core2.dto.SerialNumberValidationDto
import com.akaun.kt.sdk.models.aggregates.erp.inventoryitem.SerialNumberModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.dto.SerialNumberValidationOutputDto
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

object Core2UrlSerialNumberPrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.INV_MODULE_PREFIX + "serial-numbers/"
}


interface SerialNumberService{
    @POST(Core2UrlSerialNumberPrefix.PREFIX +  "multi-validation")
    suspend fun validateSerialNumbers(
        @Body serialNumberValidationDto: SerialNumberValidationDto
    ): ApiResponse<BasicApiResponseModel<SerialNumberValidationDto>>

    @POST(Core2UrlSerialNumberPrefix.PREFIX +  "validation")
    suspend fun validateSerialNumberList(
        @Body serialNumberValidationDto: SerialNumberValidationDto
    ): BasicApiResponseModel<SerialNumberValidationOutputDto>

    @GET(Core2UrlSerialNumberPrefix.PREFIX + "query")
    suspend fun getSerialNumbersByCriteria(
        @Query("sn_id") sn_id: String = "",
        @Query("sn_ids") sn_ids: Set<String> = emptySet(),
        @Query("hdr_item_guid") hdr_item_guid: String = "",
        @Query("location_guid") location_guid: String = "",
        @Query("quantity_balance_greater_than") quantity_balance_greater_than: Int = 0,
        @Query("calcTotalRecords") calcTotalRecords: Boolean = true,
        @Query("limit") limit: Int = 100,
        @Query("offset") offset: Int = 0
    ): ApiResponse<PagingResponseModel<SerialNumberModel>>




}