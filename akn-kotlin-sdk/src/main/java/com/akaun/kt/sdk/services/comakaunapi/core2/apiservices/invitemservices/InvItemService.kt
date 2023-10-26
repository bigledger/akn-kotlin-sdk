package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.invitemservices

import com.akaun.kt.sdk.models.aggregates.erp.inventoryitem.InventoryItemHeaderModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import retrofit2.http.GET
import retrofit2.http.Query

object Core2UrlInvItemHdrPrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + "erp/" + "inv/" + "inv-items/hdrs/"
}


interface InvItemHdrService {

    @GET(Core2UrlInvItemHdrPrefix.PREFIX + "query")
    suspend fun getInventoryItemHdrsByCriteria(
        @Query("guid_fi_mst_item") mstItemGuid : String,
    ): PagingResponseModel<InventoryItemHeaderModel>

}