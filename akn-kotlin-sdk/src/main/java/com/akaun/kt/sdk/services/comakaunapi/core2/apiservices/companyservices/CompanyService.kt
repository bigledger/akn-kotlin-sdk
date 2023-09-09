package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.companyservices

import com.akaun.kt.sdk.models.aggregates.erp.company.CompanyModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import retrofit2.http.GET
import retrofit2.http.Path

interface CompanyService {
    @GET(Core2Config.TENANT_DOMAIN_URL_PREFIX + Core2Config.ERP_MODULE_PREFIX + "companies/{guid}")
    suspend fun getCompanyByGuid(
        @Path("guid") guid: String
    ): BasicApiResponseModel<CompanyModel>
}