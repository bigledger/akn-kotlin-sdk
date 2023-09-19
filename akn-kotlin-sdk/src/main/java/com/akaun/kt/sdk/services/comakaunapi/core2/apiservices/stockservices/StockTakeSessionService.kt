package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.stockservices

import com.akaun.kt.sdk.models.aggregates.erp.stock.StockTakeSessionDeviceModel
import com.akaun.kt.sdk.models.aggregates.erp.stock.StockTakeSessionHeaderModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface StockTakeSessionService {
    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-hdr/backoffice-ep")
    suspend fun getAllStockTakeSessionHdr(
    ): ApiResponseModel<StockTakeSessionHeaderModel>

    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-hdr/backoffice-ep/{guid}")
    suspend fun getStockTakeSessionHdrByGuid(
        @Path("guid") guid: String
    ): BasicApiResponseModel<StockTakeSessionHeaderModel>

    @POST(Core2Config.DOMAIN_URL_PREFIX + "stocktake-hdr/backoffice-ep")
    suspend fun createStockTakeSessionHdr(
        @Body stockTakeSessionHdrModel: StockTakeSessionHeaderModel
    ): BasicApiResponseModel<StockTakeSessionHeaderModel>

    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-hdr/backoffice-ep" + "/query")
    suspend fun getStockTakeSessionHdrByQuery(
        @Query("calcTotalRecords") calcTotalRecords: Boolean = true,
        @Query("orderBy") orderBy: String = "",
        @Query("order") order: String = "ASC",
        @Query("limit") limit: Int = 100,
        @Query("offset") offset: Int = 0
    ) : ApiResponseModel<StockTakeSessionDeviceModel>
}