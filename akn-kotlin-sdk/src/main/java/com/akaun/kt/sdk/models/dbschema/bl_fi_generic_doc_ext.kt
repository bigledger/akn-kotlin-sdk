package com.akaun.kt.sdk.models.dbschema

import com.akaun.kt.sdk.model.table.PropertyJson
import com.akaun.kt.sdk.models.dbschema.intermediate.ParamOptionJson
import com.akaun.kt.sdk.models.dbschema.intermediate.ValueJson

data class bl_fi_generic_doc_ext(
    var acl_config: Any? = null,
    var acl_policy: Any? = null,
    var applet_guid: Any? = null,
    var created_by_subject_guid: String? = null,
    var created_date: String? = null,
    var ext_code: Any? = null,
    var ext_option: Any? = null,
    var ext_type: Any? = null,
    var guid: String? = null,
    var guid_doc_hdr: String? = null,
    var guid_doc_line: Any? = null,
    var module_guid: Any? = null,
    var namespace: Any? = null,
    var param_code: String? = null,
    var param_name: String? = null,
    var param_option_json: ParamOptionJson? = null,
    var param_type: String? = null,
    var property_json: PropertyJson? = null,
    var revision: String? = null,
    var status: String? = null,
    var updated_by_subject_guid: String? = null,
    var updated_date: String? = null,
    var value_datetime: Any? = null,
    var value_file: Any? = null,
    var value_json: ValueJson? = null,
    var value_numeric: Any? = null,
    var value_string: String? = null,
    var vrsn: Any? = null
)
