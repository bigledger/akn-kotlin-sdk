package com.akaun.kt.sdk.models.aggregates.erp.gendoc

data class GenericDocumentScanLineItemQtyContainer(
    val item_guid: String? = null,
    val item_code: String? = null,
    val item_name: String? = null,
    val uom: String? = null,
    val total_qty_matched: String? = null,
    val line_qty: String? = null,
    val qty_discrepancy: String? = null
)
