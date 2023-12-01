package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.genericdocumentservices

import com.akaun.kt.sdk.models.aggregates.erp.gendoc.GenericDocumentHdrLineLinkQueueListModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

object Core2UrlGenericDocumentHdrImportServicePrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.GEN_DOC_PREFIX + "hdr-imports"
}

interface GenericDocumentHdrImportService {
    @GET(Core2UrlGenericDocumentHdrImportServicePrefix.PREFIX + "/{docType}/query")
    suspend fun getGenericDocumentHdrLineLinkOpenQueueByCriteria(
        @Path("docType") docType :String?,
        @Query("line_open_queue_server_doc_type_1") line_open_queue_server_doc_type_1: String?,
        @Query("line_open_queue_server_doc_type_2") line_open_queue_server_doc_type_2: String?,
        @Query("offset") offset: Int?,
        @Query("limit") limit: Int?,
        @Query("guids") guids : Set<String>?

    ): PagingResponseModel<GenericDocumentHdrLineLinkQueueListModel>
}