package com.akaun.kt.sdk.models.aggregates.erp.deljob

import com.akaun.kt.sdk.models.dbschema.bl_del_job_event
import com.akaun.kt.sdk.models.dbschema.bl_del_job_ext
import com.akaun.kt.sdk.models.dbschema.bl_del_job_hdr
import com.akaun.kt.sdk.models.dbschema.bl_del_job_attachment

data class JobModel(
    val bl_del_job_attachments: List<bl_del_job_attachment>,
    val bl_del_job_event: List<bl_del_job_event>,
    val bl_del_job_ext: List<bl_del_job_ext>,
    val bl_del_job_hdr: bl_del_job_hdr
)