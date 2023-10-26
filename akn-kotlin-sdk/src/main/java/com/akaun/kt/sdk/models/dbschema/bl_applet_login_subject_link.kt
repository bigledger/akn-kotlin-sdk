package com.akaun.kt.app.inventory.stocktransfer.model.appletloginsubject

import com.akaun.kt.sdk.models.dbschema.intermediate.PropertyJson

data class bl_applet_login_subject_link(
    val app_login_guid: String?,
    val applet_catalog_guid: String?,
    val applet_catalog_link_guid: String?,
    val applet_hdr_guid: String?,
    val code: Any?,
    val comment_date: String?,
    val comments: Any?,
    val created_by_subject_guid: String?,
    val created_date: String?,
    val guid: String?,
    val link_type: Any?,
    val property_json: PropertyJson?,
    val rank: String?,
    val rating: Any?,
    val revision: String?,
    val status: String?,
    val tenant_guid: String?,
    val updated_by_subject_guid: String?,
    val updated_date: String?,
    val vrsn: Any?
)