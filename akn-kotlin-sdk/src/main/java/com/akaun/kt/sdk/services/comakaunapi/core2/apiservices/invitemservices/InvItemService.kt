package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.invitemservices

import com.akaun.kt.sdk.models.aggregates.erp.inventoryitem.InventoryItemHeaderModel
import com.akaun.kt.sdk.models.aggregates.erp.inventoryitem.InventoryItemModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

object Core2UrlInvItemPrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.INV_MODULE_PREFIX + "inv-items/"
}


interface InvItemService {

    @GET( Core2UrlInvItemPrefix.PREFIX + "backoffice-ep/{guid}")
    suspend fun getInventoryItemByGuid(
        @Path("guid") guid: String
    ): BasicApiResponseModel<InventoryItemModel>

    @GET(Core2UrlInvItemPrefix.PREFIX+ "stock-take/items/backoffice-ep")
    suspend fun getInventoryItemFromItemCode(
        @Query("item_code") item_code: String = "",
        @Query("location_guid") location_guid: String = ""
    ): ApiResponseModel<InventoryItemModel>

    @GET(Core2UrlInvItemPrefix.PREFIX + "stock-take/serial-batch/backoffice-ep")
    suspend fun getInventoryItemFromSerialOrBatch(
        @Query("scan_code") scan_code: String = "",
        @Query("location_guid") location_guid: String = ""
    ): ApiResponseModel<InventoryItemModel>

}