package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.stockservices

import com.akaun.kt.sdk.models.aggregates.erp.stock.StockTakeSessionHeaderModel
import com.akaun.kt.sdk.models.aggregates.erp.stock.StockTakeSessionRecordModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface StockTakeRecordService {
    @POST(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record")
    suspend fun createStokeTakeSessionRecord(
        @Body stockTakeSessionRecordModel: StockTakeSessionRecordModel
    ): ApiResponseModel<StockTakeSessionRecordModel>

    @POST(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record" + "/multi")
    suspend fun createMultiStokeTakeSessionRecord(
        @Body stockTakeSessionRecordModel: StockTakeSessionRecordModel
    ): ApiResponseModel<StockTakeSessionRecordModel>

    @PUT(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record")
    suspend fun updateStokeTakeSessionRecord(
        @Body stockTakeSessionRecordModel: StockTakeSessionRecordModel
    ): ApiResponseModel<StockTakeSessionRecordModel>

    @PUT(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record" + "/multi")
    suspend fun updateMultiStokeTakeSessionRecord(
        @Body stockTakeSessionRecordModel: StockTakeSessionRecordModel
    ): ApiResponseModel<StockTakeSessionRecordModel>

    @DELETE(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record")
    suspend fun deleteStokeTakeSessionRecord(
        @Path("guid") guid: String
    ): BasicApiResponseModel<StockTakeSessionRecordModel>

    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record")
    suspend fun getAllStokeTakeSessionRecord(
    ): ApiResponseModel<StockTakeSessionRecordModel>

    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record" + "/{guid}")
    suspend fun getStokeTakeSessionRecordByGuid(
    ): BasicApiResponseModel<StockTakeSessionRecordModel>

    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record" + "/query")
    suspend fun getStokeTakeSessionRecordByCriteria(
        //TODO: Fill up criteria
    ): BasicApiResponseModel<StockTakeSessionRecordModel>

    //TODO: Create Model and Fill up Criteria
//    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record" + "inv-item-devices/query")
//    suspend fun getStockTakeRecordWithInvItemByCriteria(
//    ): BasicApiResponseModel<StockTakeSessionRecordInvItemDeviceModel>

}