package com.akaun.kt.sdk.models.aggregates.erp.inventoryitem

import com.akaun.kt.sdk.models.dbschema.bl_inv_mst_item_hdr

data class InventoryItemHeaderModel(
    val bl_inv_mst_item_hdr: bl_inv_mst_item_hdr = bl_inv_mst_item_hdr()
)