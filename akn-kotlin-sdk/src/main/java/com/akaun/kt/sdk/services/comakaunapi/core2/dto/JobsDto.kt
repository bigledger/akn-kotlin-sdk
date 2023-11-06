package com.akaun.kt.app.delivery.driverapp.model.job

data class JobsDto(
    val jobs_guids : Set<String> = emptySet(),
    val tripHdrGuid : String? = null

)
