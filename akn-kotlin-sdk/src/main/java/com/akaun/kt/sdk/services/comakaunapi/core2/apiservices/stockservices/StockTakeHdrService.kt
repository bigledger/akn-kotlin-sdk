package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.stockservices

import com.akaun.kt.sdk.models.aggregates.erp.stock.StockTakeSessionHeaderModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import retrofit2.Call
import retrofit2.http.GET

interface StockTakeHdrService {
    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-hdr/backoffice-ep")
    fun getAllStockTakeSessionHdr(
    ) : Call<ApiResponseModel<StockTakeSessionHeaderModel>>
}