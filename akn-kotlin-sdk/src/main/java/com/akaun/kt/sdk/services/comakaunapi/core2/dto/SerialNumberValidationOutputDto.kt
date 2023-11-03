package com.akaun.kt.sdk.services.comakaunapi.core2.dto

import com.akaun.kt.sdk.models.aggregates.erp.serialnumber.SerialNumberStatus

data class SerialNumberValidationOutputDto(
    var serialNumberList: List<SerialNumberStatus>
)