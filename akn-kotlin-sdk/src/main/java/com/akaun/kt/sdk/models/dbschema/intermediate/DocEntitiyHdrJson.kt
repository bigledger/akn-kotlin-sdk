package com.akaun.kt.sdk.models.dbschema.intermediate

data class DocEntityHdrJson(
    val entityId: String?,
    val entityName: String?,
    val entityType: String?,
    val glCode: String?,
    val idNumber: String?,
    val identityType: String?,
    val salesAgent: String?,
    val salesLead: String?,
    val status: String?
)