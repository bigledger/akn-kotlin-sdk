package com.akaun.kt.sdk.models.aggregates.erp.gendoc

import com.akaun.kt.sdk.models.dbschema.bl_fi_generic_doc_event
import com.akaun.kt.sdk.models.dbschema.bl_fi_generic_doc_ext
import com.akaun.kt.sdk.models.dbschema.bl_fi_generic_doc_hdr
import com.akaun.kt.sdk.models.dbschema.bl_fi_generic_doc_line
import com.akaun.kt.sdk.models.dbschema.bl_fi_generic_doc_link

data class GenericDocumentModel(
    var bl_fi_generic_doc_hdr: bl_fi_generic_doc_hdr = bl_fi_generic_doc_hdr(),
    var bl_fi_generic_doc_ext: List<bl_fi_generic_doc_ext> = emptyList(),
    var bl_fi_generic_doc_line: List<bl_fi_generic_doc_line> = emptyList(),
    var bl_fi_generic_doc_event: List<bl_fi_generic_doc_event> = emptyList(),
    var bl_fi_generic_doc_link: List<bl_fi_generic_doc_link> = emptyList()
)