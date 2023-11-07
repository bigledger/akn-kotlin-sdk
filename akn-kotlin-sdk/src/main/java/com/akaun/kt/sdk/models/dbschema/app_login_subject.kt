package com.akaun.kt.sdk.models.dbschema

import com.akaun.kt.sdk.models.dbschema.intermediate.PropertyJson

data class app_login_subject(
    var account_type: Any? = null,
    var category: String? = null,
    var contact_key_guid: Any? = null,
    var created_date: String? = null,
    var description: String? = null,
    var guid: String? = null,
    var main_email: String? = null,
    var main_phone: String? = null,
    var name: String? = null,
    var name_first: String? = null,
    var name_last: String? = null,
    var property_json: Any? = null,
    var rank: Any? = null,
    var revision: String? = null,
    var status: String? = null,
    var updated_date: String? = null,
    var vrsn: Any? = null
)