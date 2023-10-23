package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.scanservices

import com.akaun.kt.sdk.models.aggregates.erp.gendoc.GenericDocumentScanLineModel
import com.akaun.kt.sdk.models.aggregates.erp.inventoryitem.InventoryItemModel
import com.akaun.kt.sdk.models.aggregates.erp.inventoryitem.SerialNumberModel
import com.akaun.kt.sdk.models.aggregates.erp.stock.StockTakeSessionHeaderModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface GenDocScanLineService {

    /*
    * GenericDocumentScanLineController
    */
    @POST(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.GENERIC_DOC_PREFIX + "scan-lines" + "/backoffice-ep")
    suspend fun createGenDocScanLine(
        @Body genericDocumentScanLineModel: GenericDocumentScanLineModel
    ): BasicApiResponseModel<GenericDocumentScanLineModel>

    @PUT(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.GENERIC_DOC_PREFIX + "scan-lines" + "/backoffice-ep")
    suspend fun updateGenDocScanLine(
        @Body genericDocumentScanLineModel: GenericDocumentScanLineModel
    ): BasicApiResponseModel<GenericDocumentScanLineModel>

    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.GENERIC_DOC_PREFIX + "scan-lines" + "/backoffice-ep")
    suspend fun getAllGenDocScanLine(
        @Query("item_code") item_code: String = "",
        @Query("location_guid") location_guid: String = ""
    ): ApiResponseModel<GenericDocumentScanLineModel>

    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.GENERIC_DOC_PREFIX + "scan-lines" + "/backoffice-ep/{guid}")
    suspend fun getByGuidGenDocScanLine(
        @Path("guid") guid: String
    ): BasicApiResponseModel<GenericDocumentScanLineModel>

    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.GENERIC_DOC_PREFIX + "scan-lines" + "/backoffice-ep/query")
    suspend fun getByCriteriaGenDocScanLine(
        @Query("generic_doc_hdr_guid") generic_doc_hdr_guid: String? = null,
        @Query("guid_comp") guid_comp: String? = null,
        @Query("guid_branch") location_guid: String? = null,
        @Query("item_guid") item_guid: String? = null,
        @Query("item_code") item_code: String? = null,
        @Query("ean_code") ean_code: String? = null,
        @Query("serial_number") serial_number: String? = null,
    ): PagingResponseModel<GenericDocumentScanLineModel>

    @DELETE(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.GENERIC_DOC_PREFIX + "scan-lines" + "/backoffice-ep/{guid}")
    suspend fun deleteGenDocScanLine(
        @Path("guid") guid: String
    ): BasicApiResponseModel<Boolean>

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
    ): ApiResponse<PagingResponseModel<SerialNumberModel>>
}