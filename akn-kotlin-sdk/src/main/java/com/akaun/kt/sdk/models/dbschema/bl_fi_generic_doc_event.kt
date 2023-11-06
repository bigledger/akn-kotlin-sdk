package com.akaun.kt.sdk.models.dbschema

import com.akaun.kt.sdk.models.dbschema.intermediate.MessageJson

data class bl_fi_generic_doc_event(
    var acl_config: Any? = null,
    var acl_policy: Any? = null,
    var action: String? = null,
    var applet_guid: Any? = null,
    var created_by_subject_guid: String? = null,
    var date_completed: Any? = null,
    var date_created: String? = null,
    var date_txn: String? = null,
    var descr: Any? = null,
    var event_code: String? = null,
    var foreign_key: Any? = null,
    var foreign_table: Any? = null,
    var guid: String? = null,
    var guid_doc_hdr: String? = null,
    var guid_doc_line: Any? = null,
    var id_device: Any? = null,
    var id_user: Any? = null,
    var id_user_agent: Any? = null,
    var link_guid: Any? = null,
    var message_json: Any? = null,
    var module_guid: Any? = null,
    var namespace: Any? = null,
    var property_json: Any? = null,
    var revision: String? = null,
    var status: String? = null,
    var txn_type: String? = null,
    var updated_by_subject_guid: String? = null,
    var vrsn: Any? = null
)

