package com.akaun.kt.sdk

import android.util.Log
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.`stock-services`.StockTakeSessionService
import com.akaun.kt.sdk.utils.client.RetrofitClient
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiTestCall {
    @OptIn(DelicateCoroutinesApi::class)
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
            stockTakeSessionHdrRetrofit.create(StockTakeSessionService::class.java)

        // Create a coroutine on the GlobalScope
        GlobalScope.launch(Dispatchers.IO) {
            try {
                val response = stockTakeSessionHdrService.getAllStockTakeSessionHdr()
                Log.d("responseBody", "code: ${response.data}")

            } catch (e: Exception) {
                Log.e("API Call", "Failed Reason: ${e.message}")
            }
        }
    }
}