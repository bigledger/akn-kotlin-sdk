package com.akaun.kt.sdk.models.dbschema.intermediate

import com.akaun.kt.sdk.models.dbschema.intermediate.Batch

data class BatchNo(
    val batches: List<Batch>?,
    val bins: List<Any>?
)