package com.akaun.kt.app.inventory.stocktransfer.model.stocktransferout

data class Bin(
    val bin_hdr_code: String?,
    val bin_hdr_guid: Any?,
    val bin_line_guid: Any?,
    val container_measure: Int?,
    val container_qty: Int?,
    val qty: Int?
)