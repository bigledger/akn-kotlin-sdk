package com.akaun.kt.sdk.models.aggregates.erp.applogin

import com.akaun.kt.sdk.models.dbschema.app_login_principal
import com.akaun.kt.sdk.models.dbschema.app_login_subject
import com.akaun.kt.sdk.models.dbschema.app_login_subject_ext

data class AppLoginModel(
    val appLoginPrincipalList: List<app_login_principal>,
    val appLoginSubject: app_login_subject,
    val appLoginSubjectExtList: List<app_login_subject_ext>
)