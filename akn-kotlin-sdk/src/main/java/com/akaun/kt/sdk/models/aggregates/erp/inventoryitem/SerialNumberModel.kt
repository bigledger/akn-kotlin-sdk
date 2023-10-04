package com.akaun.kt.sdk.models.aggregates.erp.inventoryitem

import com.akaun.kt.sdk.models.dbschema.bl_fi_generic_doc_hdr
import com.akaun.kt.sdk.models.dbschema.bl_inv_serial_number_event
import com.akaun.kt.sdk.models.dbschema.bl_inv_serial_number_ext
import com.akaun.kt.sdk.models.dbschema.bl_inv_serial_number_hdr
import com.akaun.kt.sdk.models.dbschema.bl_inv_serial_number_line

data class SerialNumberModel(
    val bl_inv_serial_number_hdr: bl_inv_serial_number_hdr = bl_inv_serial_number_hdr(),
    val bl_inv_serial_number_lines: List<bl_inv_serial_number_line> = emptyList(),
    val bl_inv_serial_number_exts: List<bl_inv_serial_number_ext> = emptyList(),
    val bl_inv_serial_number_events: List<bl_inv_serial_number_event> = emptyList()
)