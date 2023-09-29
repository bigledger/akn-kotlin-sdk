package com.akaun.kt.sdk.models.dbschema.intermediate

data class Batch(
    val batch_no: String?,
    val expiry_date: String?,
    val issue_date: String?,
    val qty: Int?
)