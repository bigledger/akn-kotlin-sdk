package com.akaun.kt.sdk.models.aggregates.erp.appletloginsubject

import com.akaun.kt.app.inventory.stocktransfer.model.appletloginsubject.bl_applet_login_subject_link
import com.akaun.kt.app.inventory.stocktransfer.model.appletloginsubject.bl_applet_login_subject_link_ext

data class AppletLoginSubjectLinkModel(
    val bl_applet_login_subject_link: bl_applet_login_subject_link,
    val bl_applet_login_subject_link_ext: List<bl_applet_login_subject_link_ext>
)