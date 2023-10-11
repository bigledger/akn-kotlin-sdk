package com.akaun.kt.sdk.models.dbschema

import com.akaun.kt.sdk.models.dbschema.intermediate.BillingJson
import com.akaun.kt.sdk.models.dbschema.intermediate.DeliveryOption
import com.akaun.kt.sdk.models.dbschema.intermediate.CancelInfoJson
import com.akaun.kt.sdk.models.dbschema.intermediate.DeliveryEntityJson
import com.akaun.kt.sdk.models.dbschema.intermediate.DocEntityHdrJson

data class bl_fi_generic_doc_hdr(
    var acl_config: Any? = null,
    var acl_policy: Any? = null,
    var amount_cogs: Any? = null,
    var amount_discount: Int? = null,
    var amount_gst_balance: Any? = null,
    var amount_internal_settlement: Int? = null,
    var amount_json: Any? = null,
    var amount_net: Double? = null,
    var amount_open_balance: Double? = null,
    var amount_signum: Int? = null,
    var amount_std: Double? = null,
    var amount_tax_gst: Int? = null,
    var amount_tax_wht: Int? = null,
    var amount_txn: Double? = null,
    var amount_wht_balance: Any? = null,
    var app_id: Any? = null,
    var applet_guid: Any? = null,
    var apportion_type: Any? = null,
    var arap_bal: Int? = null,
    var arap_contra: Int? = null,
    var arap_doc_open: Int? = null,
    var arap_pns_amount: Int? = null,
    var arap_stlm_amount: Int? = null,
    var base_doc_ccy: Any? = null,
    var base_doc_guid: Any? = null,
    var base_doc_xrate: Any? = null,
    var bill_to: Any? = null,
    var billing_json: BillingJson? = null,
    var cancel_date: Any? = null,
    var cancel_info_json: CancelInfoJson? = null,
    var cfg_delivery: Any? = null,
    var cfg_production: Any? = null,
    var client_doc_1: Any? = null,
    var client_doc_2: Any? = null,
    var client_doc_3: Any? = null,
    var client_doc_4: Any? = null,
    var client_doc_5: Any? = null,
    var client_doc_date_01: Any? = null,
    var client_doc_date_02: Any? = null,
    var client_doc_date_03: Any? = null,
    var client_doc_date_04: Any? = null,
    var client_doc_date_05: Any? = null,
    var client_doc_status_01: Any? = null,
    var client_doc_status_02: Any? = null,
    var client_doc_status_03: Any? = null,
    var client_doc_status_04: Any? = null,
    var client_doc_status_05: Any? = null,
    var client_doc_type: String? = null,
    var client_entity_code: Any? = null,
    var client_guid: Any? = null,
    var client_key: Any? = null,
    var client_salesman_code: Any? = null,
    var client_source: Any? = null,
    var client_value: Any? = null,
    var code_branch: String? = null,
    var code_company: String? = null,
    var code_location: String? = null,
    var contact_hdr_guid: Any? = null,
    var contact_key_guid: Any? = null,
    var created_by_subject_guid: String? = null,
    var created_date: String? = null,
    var credit_terms_json: Any? = null,
    var custom_status: Any? = null,
    var date_txn: String? = null,
    var del_region_hdr_guid: Any? = null,
    var del_region_hdr_reg_code: Any? = null,
    var del_region_hdr_state: Any? = null,
    var delivery_branch_code: Any? = null,
    var delivery_branch_guid: Any? = null,
    var delivery_date_actual: Any? = null,
    var delivery_date_expected: Any? = null,
    var delivery_date_planned: Any? = null,
    var delivery_date_preferred: Any? = null,
    var delivery_entity_guid: Any? = null,
    var delivery_entity_json: DeliveryEntityJson? = null,
    var delivery_location_code: Any? = null,
    var delivery_location_guid: String? = null,
    var delivery_option: DeliveryOption? = null,
    var delivery_preferences: Any? = null,
    var delivery_required: Any? = null,
    var delivery_time_preferred: Any? = null,
    var device_guid: Any? = null,
    var display_entity_guid: Any? = null,
    var display_entity_json: Any? = null,
    var doc_ccy: String? = null,
    var doc_desc: String? = null,
    var doc_entity_hdr_guid: String? = null,
    var doc_entity_hdr_json: DocEntityHdrJson? = null,
    var doc_entity_line_guid: Any? = null,
    var doc_entity_line_json: Any? = null,
    var doc_external_remarks: Any? = null,
    var doc_internal_remarks: Any? = null,
    var doc_level: Any? = null,
    var doc_reference: String? = null,
    var doc_reference_tax_date: Any? = null,
    var doc_reference_tax_num: Any? = null,
    var doc_remarks: String? = null,
    var doc_source_type: String? = null,
    var due_date: Any? = null,
    var end_datetime: String? = null,
    var entity_branch_hdr_guid: Any? = null,
    var far_hdr_guid: Any? = null,
    var foreign_ccy: Any? = null,
    var foreign_references_json: Any? = null,
    var gst_entity_contact_json: Any? = null,
    var gst_entity_hdr_guid: Any? = null,
    var gst_entity_hdr_json: Any? = null,
    var gst_entity_tax_num: Any? = null,
    var gst_entity_type: Any? = null,
    var guid: String? = null,
    var guid_branch: String? = null,
    var guid_comp: String? = null,
    var guid_dimension: Any? = null,
    var guid_profit_center: Any? = null,
    var guid_project: Any? = null,
    var guid_segment: Any? = null,
    var guid_store: String? = null,
    var guid_store_2: String? = null,
    var intercompany_hdr_guid: Any? = null,
    var intercompany_line_guid: Any? = null,
    var label_json: Any? = null,
    var landed_cost_amount: Any? = null,
    var log_json: Any? = null,
    var marketplace_status: Any? = null,
    var member_guid: Any? = null,
    var mkt_order_no: Any? = null,
    var mkt_payment_status: Any? = null,
    var module_guid: Any? = null,
    var namespace: String? = null,
    var notification_email: Any? = null,
    var notification_phone: Any? = null,
    var payment_url_expiry: Any? = null,
    var payment_url_key: Any? = null,
    var pic_entity_01: Any? = null,
    var pic_entity_01_name: Any? = null,
    var pic_entity_02: Any? = null,
    var pic_entity_02_name: Any? = null,
    var pic_entity_03: Any? = null,
    var pic_entity_03_name: Any? = null,
    var pickup_branch_guid: Any? = null,
    var posting_bundle: String? = null,
    var posting_cashbook: Any? = null,
    var posting_finance_charge_amount: String? = null,
    var posting_fixed_asset: Any? = null,
    var posting_inventory: String? = null,
    var posting_journal: String? = null,
    var posting_membership: Any? = null,
    var posting_membership_points_commission_queue: Any? = null,
    var posting_mto: String? = null,
    var posting_running_no: Any? = null,
    var posting_sales_commission_queue: String? = null,
    var posting_status: String? = null,
    var posting_tax_gst: Any? = null,
    var posting_tax_wht: Any? = null,
    var posting_trade_in: Any? = null,
    var process: Any? = null,
    var property_json: Any? = null,
    var ready_to_ship: Any? = null,
    var reseller_entity_hdr_guid: Any? = null,
    var reseller_member_hdr_guid: Any? = null,
    var revision: String? = null,
    var sales_entity_hdr_guid: String? = null,
    var sales_entity_hdr_name: Any? = null,
    var sales_member_hdr_guid: Any? = null,
    var server_doc_1: String? = null,
    var server_doc_2: String? = null,
    var server_doc_3: String? = null,
    var server_doc_4: Any? = null,
    var server_doc_5: Any? = null,
    var server_doc_location: String? = null,
    var server_doc_type: String? = null,
    var status: String? = null,
    var status_client: Any? = null,
    var status_json: Any? = null,
    var status_server: Any? = null,
    var track_delivery_date_requested: Any? = null,
    var track_delivery_guid: Any? = null,
    var track_delivery_id: Any? = null,
    var track_delivery_logic: Any? = null,
    var track_delivery_pic_contact: Any? = null,
    var track_delivery_pic_name: String? = null,
    var track_delivery_remarks: Any? = null,
    var track_delivery_status: Any? = null,
    var track_delivery_table: Any? = null,
    var track_delivery_time_actual: Any? = null,
    var track_delivery_time_estimated: Any? = null,
    var track_delivery_time_planned: Any? = null,
    var track_production_guid: Any? = null,
    var track_production_id: Any? = null,
    var track_production_logic: Any? = null,
    var track_production_pic_contact: Any? = null,
    var track_production_pic_name: Any? = null,
    var track_production_remarks: Any? = null,
    var track_production_status: Any? = null,
    var track_production_table: Any? = null,
    var track_production_time_actual: Any? = null,
    var track_production_time_estimated: Any? = null,
    var track_production_time_planned: Any? = null,
    var tracking_id: String? = null,
    var txn_code: Any? = null,
    var txn_type: Any? = null,
    var updated_by_subject_guid: String? = null,
    var updated_date: String? = null,
    var url_key: String? = null,
    var valid_days: Double? = null,
    var void_reason: Any? = null,
    var vrsn: Any? = null,
    var wf_process_hdr_guid: Any? = null,
    var wf_process_status_code: Any? = null,
    var wf_process_status_guid: Any? = null,
    var wf_resolution_code: Any? = null,
    var wf_resolution_guid: Any? = null
)