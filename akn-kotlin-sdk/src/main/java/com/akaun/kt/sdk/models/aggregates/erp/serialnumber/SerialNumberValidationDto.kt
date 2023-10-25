package com.akaun.kt.app.inventory.stocktransfer.model.serialnumbers

data class SerialNumberValidationDto(
    val txn_type: String? = null,
    val location_guid: String? = null,
    val company_guid: String? = null,
    val inv_item_guid: String? = null,
    val serialNumbers: Set<SerialNumberStatus>? = null,
    val serialNumberList: Set<String>? = null,
    val fi_item_guid: String? = null
)