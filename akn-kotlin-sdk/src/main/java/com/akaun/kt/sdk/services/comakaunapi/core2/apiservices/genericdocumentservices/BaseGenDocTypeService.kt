package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.genericdocumentservices

import com.akaun.kt.sdk.models.aggregates.erp.gendoc.GenericDocumentModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.dto.GenericDocumentDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

object BaseGenDocUrlPrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.GEN_DOC_PREFIX
}

interface BaseGenDocTypeService {

    @POST(BaseGenDocUrlPrefix.PREFIX +  "{docType}")
    suspend fun create(
        @Path("docType") docType: String,
        @Body genericDocumentModel: GenericDocumentModel
    ): BasicApiResponseModel<GenericDocumentModel>

    @POST(BaseGenDocUrlPrefix.PREFIX +  "{docType}/custom/query/snapshot/backoffice-ep")
    suspend fun getGenericDocumentByDTOSnapshot(
        @Path("docType") docType: String,
        @Body genericDocumentDto: GenericDocumentDto
    ): PagingResponseModel<GenericDocumentModel>

    @GET(BaseGenDocUrlPrefix.PREFIX + "{docType}/{guid}")
    suspend fun getGenericDocumentByGuid(
        @Path("docType") docType : String,
        @Path("guid") guid : String
    ) : BasicApiResponseModel<GenericDocumentModel>

    @PUT(BaseGenDocUrlPrefix.PREFIX + "{docType}")
    suspend fun updateGenericDocument(
        @Path("docType") docType : String,
        @Body genericDocumentModel: GenericDocumentModel
    ) : BasicApiResponseModel<GenericDocumentModel>

//    @POST(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + Core2Config.GEN_DOC_PREFIX +  "{docType}/custom/query/snapshot/backoffice-ep")
//    suspend fun getGenericDocumentByDTOSnapshot(
//        @Path("docType") docType: String,
//        @Body genericDocumentDto: GenericDocumentDto
//    ): PagingResponseModel<GenericDocumentModel>
}