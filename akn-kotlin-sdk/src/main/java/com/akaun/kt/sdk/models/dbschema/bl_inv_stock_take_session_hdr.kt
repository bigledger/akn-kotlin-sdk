package com.akaun.kt.sdk.models.dbschema

data class bl_inv_stock_take_session_hdr(
    val code: String,
    val created_by_subject_guid: String,
    val date_created: String,
    val date_end: String,
    val date_lastupdated: String,
    val date_start: String = "",
    val description: Any,
    val guid: String,
    val guid_branch: Any,
    val guid_comp: String,
    val guid_location: String,
    val name: String,
    val revision: String,
    val status: String,
    val status_adjustment: Any,
    val status_variance: Any,
    val updated_by_subject_guid: String,
    val vrsn: Any,
    val wf_process_hdr_guid: String,
    val wf_process_status_code: Any,
    val wf_process_status_guid: String,
    val wf_resolution_code: Any,
    val wf_resolution_guid: String
)