package com.akaun.kt.sdk.models.dbschema

import com.akaun.kt.sdk.models.dbschema.intermediate.PropertyJson
import com.akaun.kt.sdk.models.dbschema.intermediate.ParamOptionJson
import com.akaun.kt.sdk.models.dbschema.intermediate.ValueJson

data class bl_inv_mst_item_ext(
    var created_date: String? = null,
    var ext_code: String? = null,
    var ext_option: String? = null,
    var ext_type: String? = null,
    var guid: String? = null,
    var inv_item_hdr_guid: String? = null,
    var inv_item_line_guid: String? = null,
    var param_code: String? = null,
    var param_name: String? = null,
    var param_option_json: Any? = null,
    var param_type: String? = null,
    var property_json: Any? = null,
    var revision: String? = null,
    var status: String? = null,
    var updated_date: String? = null,
    var value_datetime: String? = null,
    var value_file: Any? = null,
    var value_json: Any? = null,
    var value_numeric: Any? = null,
    var value_string: String? = null,
    var vrsn: String? = null
)
