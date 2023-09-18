package com.akaun.kt.sdk.utils.wrapper

data class DataOrException<T, Boolean, E : Exception>(
    val data: T? = null,
    val loading: Boolean? = null,
    val e: E? = null
)