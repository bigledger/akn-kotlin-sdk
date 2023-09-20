package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.stockservices

import com.akaun.kt.sdk.models.aggregates.erp.stock.StockTakeDeviceModel
import com.akaun.kt.sdk.models.aggregates.erp.stock.StockTakeSessionDeviceModel
import com.akaun.kt.sdk.models.aggregates.erp.stock.StockTakeSessionHeaderModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface StockTakeDeviceService {
    // STOCK TAKE DEVICE
    @POST(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.STOCKTAKE_PREFIX + "devices/" + "backoffice-ep")
    suspend fun createStockTakeDevice(
        @Body stockTakeDeviceModel: StockTakeDeviceModel
    ) : BasicApiResponseModel<StockTakeDeviceModel>

    @PUT(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.STOCKTAKE_PREFIX + "devices/" + "backoffice-ep")
    suspend fun updateStockTakeDevice(
        stockTakeDeviceModel: StockTakeDeviceModel
    ) : BasicApiResponseModel<StockTakeDeviceModel>

    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.STOCKTAKE_PREFIX + "devices/" + "backoffice-ep")
    suspend fun getAllStockTakeDevice(
    ) : ApiResponseModel<StockTakeDeviceModel>

    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.STOCKTAKE_PREFIX + "devices/" + "backoffice-ep")
    suspend fun getStockTakeDeviceByGuid(
        @Path("guid") guid: String
    ) : BasicApiResponseModel<StockTakeDeviceModel>

    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.STOCKTAKE_PREFIX + "devices/" + "backoffice-ep/query")
    suspend fun getStockTakeDeviceByCriteria(
        @Query("calcTotalRecords") calcTotalRecords: Boolean = true,
        @Query("code") sessionGuid: String,
        @Query("limit") limit: Int = 100,
        @Query("offset") offset: Int = 0
    ) : PagingResponseModel<StockTakeDeviceModel>


    // STOCK TAKE SESSION DEVICE
    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-device" + "/query")
    suspend fun getStockTakeSessionDeviceByCriteria(
        @Query("calcTotalRecords") calcTotalRecords: Boolean = true,
        @Query("session_guid") sessionGuid: String,
        @Query("limit") limit: Int = 100,
        @Query("offset") offset: Int = 0
    ) : PagingResponseModel<StockTakeSessionDeviceModel>

    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-device" + "/query")
    suspend fun getStockTakeSessionDeviceByGuid(
        @Path("guid") guid: String
    ) : ApiResponseModel<StockTakeSessionDeviceModel>

    @POST(Core2Config.DOMAIN_URL_PREFIX + "stocktake-device")
    suspend fun createStockTakeSessionDevice(
        stockTakeSessionDeviceModel: StockTakeSessionDeviceModel
    ) : BasicApiResponseModel<StockTakeSessionDeviceModel>

    @PUT(Core2Config.DOMAIN_URL_PREFIX + "stocktake-device")
    suspend fun updateStockTakeSessionDevice(
        stockTakeSessionDeviceModel: StockTakeSessionDeviceModel
    ) : BasicApiResponseModel<StockTakeSessionDeviceModel>

}