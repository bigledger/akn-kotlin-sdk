package com.akaun.kt.sdk.services.comakaunapi.core2.dto

import com.akaun.kt.app.delivery.driverapp.model.trip.bl_del_driver_hdr
import com.akaun.kt.app.delivery.driverapp.model.trip.bl_del_region_hdr
import com.akaun.kt.app.delivery.driverapp.model.trip.bl_del_trip_driver_link
import com.akaun.kt.app.delivery.driverapp.model.trip.bl_del_trip_hdr

data class TripListingWithDriverOutputDTO(
    val bl_del_driver_hdrs: List<bl_del_driver_hdr>,
    val bl_del_region_hdrs: List<bl_del_region_hdr>,
    val bl_del_trip_driver_links: List<bl_del_trip_driver_link>,
    val bl_del_trip_hdr: bl_del_trip_hdr
)