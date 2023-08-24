package com.akaun.kt.sdk

import android.util.Log
import com.akaun.kt.sdk.models.aggregates.erp.stock.StockTakeSessionHeaderModel
import com.akaun.kt.sdk.models.dbschema.LoginRequest
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.ApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.stockservices.StockTakeHdrService
import com.akaun.kt.sdk.utils.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiTestCall {
    fun trialApiCall() {
//        val identityApi = ApiTest.identityService
//        val loginRequest = LoginRequest("krishnaInTheOffice108!", "shyamborkar@wavelet.net")
//        val call = identityApi.login(loginRequest)

        val authorization =
            "eyJhbGciOiJSUzI1NiJ9.eyJzdWJqZWN0R3VpZCI6ImExNzIxZTlkLWFjMmMtNGExNy1iZDBlLTI4YzYzNmM3MWIwMyIsImFwcENvZGUiOiIiLCJ0ZW5hbnRDb2RlIjoiIiwic3lzQWRtaW5HdWlkIjoiIiwic3lzQWRtaW5SYW5rIjoiIiwiYXBwbGV0TG9naW5TdWJqZWN0TGlua0d1aWQiOiIiLCJhcHBsZXRHdWlkIjoiIiwidGVuYW50R3VpZCI6IiIsImFwcGxldExvZ2luU3ViamVjdFJhbmsiOiIiLCJhbm9ueW1vdXMiOmZhbHNlLCJhcHBsZXRUZW5hbnRUb2tlbiI6ZmFsc2UsImV4cCI6MTY5NTM2Mzk4Nn0.WsPXGn0XkaUrOLWcnh-lwN-ZmfOC1ur4vo5eQp0WMNaC5FMCTyH-mL_f5BUCtuN7I14YBMTbLfp5Q6Kz10WIy_v6OIRitYdsG3kbNi6169ElczOVs9lMut8QAEvMcnDSTfsf59MfqcxDR_is-7d26LxJPtCZ2wQ-vSxd-zsIAbU"
        val tenantCode = "staging_tenant"
        val apiClient = RetrofitClient.getAuthorizedClient(authorization, tenantCode)

        val stockTakeSessionHdrRetrofit = Retrofit.Builder() // Set the connection timeout
            .baseUrl(Core2Config.CLOUD_URL)
            .client(apiClient)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val stockTakeSessionHdrService =
            stockTakeSessionHdrRetrofit.create(StockTakeHdrService::class.java)
        val call = stockTakeSessionHdrService.getAllStockTakeSessionHdr()

        call.enqueue(object : Callback<ApiResponseModel<StockTakeSessionHeaderModel>> {
            override fun onResponse(
                call: Call<ApiResponseModel<StockTakeSessionHeaderModel>>,
                response: Response<ApiResponseModel<StockTakeSessionHeaderModel>>
            ) {
                if (response.isSuccessful) {
                    val responseBody: List<StockTakeSessionHeaderModel>? = response.body()?.data
                    if (responseBody != null) {
                        Log.d("responseBody", "code: $responseBody")

                        Log.d("responseBody", "code: $responseBody")
                    }
                } else {

                    val errorBody: String? = response.errorBody()?.string()
                    // Handle error response
                    Log.d("Error response", "error reason: $errorBody")
                }
            }

            override fun onFailure(
                call: Call<ApiResponseModel<StockTakeSessionHeaderModel>>,
                t: Throwable
            ) {
                Log.e("API Call", "Failed Reason: ${t.message}")
            }
        })
    }
}