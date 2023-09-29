package com.akaun.kt.sdk.services.comakaunapi.core2.dto

data class GenericDocumentDto (
    val store_guids : Set<String>,
    val limit : Int,
    val orderBy : String,
    val order : String,
    val search_word : String? = null,
    val snapshot : String? = null
)