package com.akaun.kt.sdk.models.aggregates.erp.stock

import com.akaun.kt.sdk.models.dbschema.bl_inv_stock_take_session_record

data class StockTakeSessionRecordModel (
    val bl_inv_stock_take_session_record: bl_inv_stock_take_session_record = bl_inv_stock_take_session_record()
)