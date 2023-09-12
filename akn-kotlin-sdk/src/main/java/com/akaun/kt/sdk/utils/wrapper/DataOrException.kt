package com.akaun.kt.sdk.utils.wrapper

data class DataOrException<T, E : Exception>(
    val data: T? = null,
    val loading: Boolean? = null,
    val e: E? = null
)