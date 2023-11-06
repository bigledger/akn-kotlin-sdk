package com.akaun.kt.app.delivery.driverapp.model.job

import com.akaun.kt.app.delivery.driverapp.model.deljobshipmentlink.BlDelJobShipmentLink
import com.akaun.kt.app.delivery.driverapp.model.jobdochdrlink.bl_del_job_dochdr_link

data class JobsDeliveryStatusDto(
    val bl_del_job_hdr: bl_del_job_hdr,
    val bl_del_job_dochdr_links: List<bl_del_job_dochdr_link>,
    val bl_del_job_docline_links: List<bl_del_job_docline_link>,
    val bl_del_job_shipment_links: List<BlDelJobShipmentLink>,
    val bl_del_job_event: bl_del_job_event
)