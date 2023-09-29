package com.akaun.kt.sdk.models.dbschema

import com.akaun.kt.sdk.models.dbschema.intermediate.PropertyJson

data class bl_fi_mst_comp_ext(
    var compHdrGuid: String? = null,
    var compLineGuid: String? = null,
    var createdDate: String? = null,
    var extCode: String? = null,
    var extOption: String? = null,
    var extType: String? = null,
    var guid: String? = null,
    var paramCode: String? = null,
    var paramName: String? = null,
    var paramOptionJson: Any? = null,
    var paramType: String? = null,
    var propertyJson: PropertyJson? = null,
    var revision: String? = null,
    var status: String? = null,
    var updatedDate: String? = null,
    var valueDatetime: String? = null,
    var valueFile: String? = null,
    var valueJson: Any? = null,
    var valueNumeric: String? = null,
    var valueString: String? = null,
    var vrsn: String? = null
)