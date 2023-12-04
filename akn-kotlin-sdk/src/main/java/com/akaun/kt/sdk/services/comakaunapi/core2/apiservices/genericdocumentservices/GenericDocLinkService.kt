package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.genericdocumentservices

import com.akaun.kt.sdk.models.aggregates.erp.gendoc.GenericDocumentLinkModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import retrofit2.http.Body
import retrofit2.http.POST

object Core2UrlGenericDocLinkServicePrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.GENERIC_DOC_PREFIX + "links"
}


interface GenericDocLinkService {
    @POST(Core2UrlGenericDocLinkServicePrefix.PREFIX + "/backoffice-ep")
    suspend fun createGenericDocumentLinkBackofficeEP(
        @Body genericDocumentLinkContainerList :List<GenericDocumentLinkModel>

    ): ApiResponseModel<GenericDocumentLinkModel>
}