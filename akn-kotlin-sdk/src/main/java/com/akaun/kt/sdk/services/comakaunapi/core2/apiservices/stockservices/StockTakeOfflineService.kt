package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.stockservices

import com.akaun.kt.sdk.models.aggregates.erp.stock.StockTakeSessionRecordModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.dto.InventoryItemOfflineDto
import com.akaun.kt.sdk.services.comakaunapi.core2.dto.StockTakeMobileOfflineDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface StockTakeOfflineService {
    // STOCK TAKE
    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.STOCKTAKE_PREFIX + "offline/device-stocktake-info/{device_code}")
    suspend fun getAllOfflineStockTakeInfoForDevice(
        @Path("device_code") device_code: String
    ) : BasicApiResponseModel<StockTakeMobileOfflineDto>

    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.STOCKTAKE_PREFIX + "offline/inv-items")
    suspend fun getInventoryItemsForOffline() : ApiResponseModel<InventoryItemOfflineDto>

    @POST(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record" + "/multi")
    suspend fun createMultiStokeTakeSessionRecord(
        @Body stockTakeSessionRecordModels: List<StockTakeSessionRecordModel>
    ): ApiResponseModel<StockTakeSessionRecordModel>
}