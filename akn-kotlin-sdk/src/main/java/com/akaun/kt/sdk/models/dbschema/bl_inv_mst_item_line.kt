package com.akaun.kt.sdk.models.dbschema

import com.akaun.kt.sdk.models.dbschema.intermediate.LogJson
import com.akaun.kt.sdk.models.dbschema.intermediate.ParameterJson

data class bl_inv_mst_item_line(
    var amount: Any? = null,
    var ccy_code: Any? = null,
    var ccy_xrate: Any? = null,
    var client_key: Any? = null,
    var client_source: Any? = null,
    var client_value: Any? = null,
    var code: String? = null,
    var uom: String? = null,
    var created_date: String? = null,
    var descr: Any? = null,
    var dim_height: Double? = null,
    var dim_length: Double? = null,
    var dim_weight: Double? = null,
    var dim_width: Double? = null,
    var guid: String? = null,
    var hdr_guid: String? = null,
    var item_hdr_guid: String? = null,
    var item_line_guid: String? = null,
    var log_json: Any? = null,
    var mkt_category: String? = null,
    var mkt_guid: String? = null,
    var mkt_item_id: String? = null,
    var mkt_item_status: String? = null,
    var name: String? = null,
    var parameter_attributes: Any? = null,
    var parameter_code: String? = null,
    var parameter_json: Any? = null,
    var parameter_name: String? = null,
    var parameter_type: String? = null,
    var parameter_value: String? = null,
    var property_json: Any? = null,
    var quantity: Double? = null,
    var revision: String? = null,
    var scan_code: String? = null,
    var status: String? = null,
    var sub_item_type: String? = null,
    var txn_type: String? = null
)
