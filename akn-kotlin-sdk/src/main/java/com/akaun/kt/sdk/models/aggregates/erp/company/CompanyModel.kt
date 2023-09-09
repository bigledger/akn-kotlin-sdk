package com.akaun.kt.sdk.models.aggregates.erp.company

import com.akaun.kt.sdk.models.dbschema.bl_fi_mst_comp
import com.akaun.kt.sdk.models.dbschema.bl_fi_mst_comp_ext

data class CompanyModel(
    val bl_fi_mst_comp: bl_fi_mst_comp,
    val bl_fi_mst_comp_ext: List<bl_fi_mst_comp_ext>
)