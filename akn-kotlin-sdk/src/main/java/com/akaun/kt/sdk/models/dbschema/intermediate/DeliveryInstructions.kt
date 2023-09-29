package com.akaun.kt.sdk.models.dbschema.intermediate

data class DeliveryInstructions(
    val from: String?,
    val instructions: String?,
    val message: String?,
    val requestedDeliveryDate: String?,
    val to: String?
)