package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.stockservices

import com.akaun.kt.sdk.models.aggregates.erp.inventoryitem.InventoryItemModel
import com.akaun.kt.sdk.models.aggregates.erp.inventoryitem.SerialNumberModel
import com.akaun.kt.sdk.models.aggregates.erp.stock.StockTakeSessionRecordInvItemDeviceModel
import com.akaun.kt.sdk.models.aggregates.erp.stock.StockTakeSessionRecordModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface StockTakeRecordService {

    /*
    * StockTakeSessionRecordController
    */
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

    @DELETE(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record/{guid}")
    suspend fun deleteStokeTakeSessionRecord(
        @Path("guid") guid: String
    ): BasicApiResponseModel<Boolean>

    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record")
    suspend fun getAllStokeTakeSessionRecord(
    ): ApiResponseModel<StockTakeSessionRecordModel>

    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record" + "/{guid}")
    suspend fun getStokeTakeSessionRecordByGuid(
        @Path("guid") guid: String
    ): BasicApiResponseModel<StockTakeSessionRecordModel>

    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record" + "/query")
    suspend fun getStokeTakeSessionRecordByCriteria(
        @Query("guid_session_hdr") guid_session_hdr: String = "",
        @Query("guid_session_device") guid_session_device: String = "",
        @Query("calcTotalRecords") calcTotalRecords: Boolean = true,
        @Query("limit") limit: Int = 100,
        @Query("offset") offset: Int = 0
    ): PagingResponseModel<StockTakeSessionRecordModel>

    @GET(Core2Config.DOMAIN_URL_PREFIX + "stocktake-record" + "/inv-item-devices" + "/query")
    suspend fun getStockTakeRecordWithInvItemByCriteria(
        @Query("guid_session_hdr") guid_session_hdr: String = "",
        @Query("guid_session_device") guid_session_device: String = "",
        @Query("calcTotalRecords") calcTotalRecords: Boolean = true,
        @Query("limit") limit: Int = 100,
        @Query("offset") offset: Int = 0
    ): PagingResponseModel<StockTakeSessionRecordInvItemDeviceModel>


    /*
    * InventoryItemController
    */
    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.INV_MODULE_PREFIX + "inv-items/" + "stock-take/items/backoffice-ep")
    suspend fun getInventoryItemFromItemCode(
        @Query("item_code") item_code: String = "",
        @Query("location_guid") location_guid: String = ""
    ): ApiResponseModel<InventoryItemModel>

    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.INV_MODULE_PREFIX + "inv-items/" + "stock-take/serial-batch/backoffice-ep")
    suspend fun getInventoryItemFromSerialOrBatch(
        @Query("scan_code") scan_code: String = "",
        @Query("location_guid") location_guid: String = ""
    ): ApiResponseModel<InventoryItemModel>

    /*
    * SerialNumberController
    */
    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.INV_MODULE_PREFIX + "serial-numbers" + "/query")
    suspend fun getSerialNumbersByCriteria(
        @Query("sn_id") sn_id: String = "",
        @Query("sn_ids") sn_ids: Set<String> = emptySet(),
        @Query("hdr_item_guid") hdr_item_guid: String = "",
        @Query("location_guid") location_guid: String = "",
        @Query("quantity_balance_greater_than") quantity_balance_greater_than: Int = 0,
        @Query("calcTotalRecords") calcTotalRecords: Boolean = true,
        @Query("limit") limit: Int = 100,
        @Query("offset") offset: Int = 0
    ): PagingResponseModel<SerialNumberModel>

}