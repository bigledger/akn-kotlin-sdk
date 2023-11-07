package com.akaun.kt.sdk.services.comakaunapi.core2.dto

data class JobsDto(
    val jobs_guids : Set<String> = emptySet(),
    val tripHdrGuid : String? = null

)
