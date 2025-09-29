package com.akaun.kt.sdk.models.aggregates.erp


data class UserAppletLinkResponse(
    val guid: String,
    val user_applet_rank: String,
    val applet_catalog_link_guid: String,
    val user_applet_index: Int,
    val status: String,
    val applet: Applet,
    val catalog: Catalog,
    val tenant: Tenant,
    val store: Store,
    val isStore: Boolean,
    val notificationCount: Int
)

data class Applet(
    val guid: String,
    val applet_mf_html_tag: String,
    val applet_code: String,
    val applet_shortcode: String,
    val applet_icon_guid: String,
    val applet_name: String,
    val applet_description: String,
    val es_module_url: String,
    val routerlink: String,
    val store_guid: String,
    val status: String
)

data class Catalog(
    val guid: String,
    val catalog_code: String,
    val catalog_name: String,
    val status: String
)

data class Tenant(
    val guid: String,
    val tenant_code: String,
    val tenant_name: String,
    val status: String
)

data class Store(
    val guid: String,
    val code: String,
    val name: String
)