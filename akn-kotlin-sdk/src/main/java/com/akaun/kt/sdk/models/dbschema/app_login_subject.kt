package com.akaun.kt.app.delivery.driverapp.model.userprofile

import com.akaun.kt.sdk.models.dbschema.intermediate.PropertyJson

data class app_login_subject(
    val account_type: Any?,
    val category: String?,
    val contact_key_guid: Any?,
    val created_date: String?,
    val description: String?,
    val guid: String?,
    val main_email: String?,
    val main_phone: String?,
    val name: String?,
    val name_first: String?,
    val name_last: String?,
    val property_json: PropertyJson?,
    val rank: Any?,
    val revision: String?,
    val status: String?,
    val updated_date: String?,
    val vrsn: Any?
)