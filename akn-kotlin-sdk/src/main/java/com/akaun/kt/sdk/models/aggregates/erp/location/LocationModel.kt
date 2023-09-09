package com.akaun.kt.sdk.models.aggregates.erp.location

import com.akaun.kt.sdk.models.dbschema.bl_inv_mst_location
import com.akaun.kt.sdk.models.dbschema.bl_inv_mst_location_ext

data class LocationModel(
    val bl_inv_mst_location: bl_inv_mst_location,
    val bl_inv_mst_location_ext: List<bl_inv_mst_location_ext>
)