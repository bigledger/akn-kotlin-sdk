package com.akaun.kt.sdk.models.aggregates.erp.applogin

import com.akaun.kt.app.delivery.driverapp.model.userprofile.app_login_principal
import com.akaun.kt.app.delivery.driverapp.model.userprofile.app_login_subject
import com.akaun.kt.app.delivery.driverapp.model.userprofile.app_login_subject_ext

data class AppLoginModel(
    val app_login_principal: List<app_login_principal>,
    val app_login_subject: app_login_subject,
    val app_login_subject_ext: List<app_login_subject_ext>
)