package com.akaun.kt.sdk.models.aggregates.erp.gendoc

import com.akaun.kt.sdk.models.dbschema.bl_fi_generic_doc_hdr
import com.akaun.kt.sdk.models.dbschema.bl_fi_generic_doc_scan_line

data class GenericDocumentScanLineModel(
    val bl_fi_generic_doc_scan_line: bl_fi_generic_doc_scan_line = bl_fi_generic_doc_scan_line()
)