package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.genericdocumentservices

import com.akaun.kt.sdk.models.aggregates.erp.gendoc.GenericDocumentModel
import com.akaun.kt.sdk.models.dbschema.LoginRequest
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.LoginResponse
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.dto.GenericDocumentDto
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface BaseGenDocTypeService {
    @POST(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.GEN_DOC_PREFIX +  "{docType}/custom/query/snapshot/backoffice-ep")
    suspend fun getGenericDocumentByDTOSnapshot(
        @Path("docType") docType: String,
        @Body genericDocumentDto: GenericDocumentDto
    ): PagingResponseModel<GenericDocumentModel>

//    @POST(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.GEN_DOC_PREFIX +  "{docType}/custom/query/snapshot/backoffice-ep")
//    suspend fun getGenericDocumentByDTOSnapshot(
//        @Path("docType") docType: String,
//        @Body genericDocumentDto: GenericDocumentDto
//    ): PagingResponseModel<GenericDocumentModel>
}