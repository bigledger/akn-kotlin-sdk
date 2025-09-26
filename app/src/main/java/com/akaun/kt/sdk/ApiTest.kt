package com.akaun.kt.sdk

import android.util.Log
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.idservices.LoginService
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.stockservices.StockTakeSessionService
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

        val authorization = "eyJhbGciOiJSUzI1NiJ9.eyJzdWJqZWN0R3VpZCI6ImE3ZGIzYTFlLTJiZjktNGQyOS05ZjNjLWY2YjQxOWY2ZjU1MyIsImFwcENvZGUiOiIiLCJ0ZW5hbnRDb2RlIjoiIiwic3lzQWRtaW5HdWlkIjoiIiwic3lzQWRtaW5SYW5rIjoiIiwiYXBwbGV0TG9naW5TdWJqZWN0TGlua0d1aWQiOiIiLCJhcHBsZXRHdWlkIjoiIiwidGVuYW50R3VpZCI6IiIsImFwcGxldExvZ2luU3ViamVjdFJhbmsiOiIiLCJyZWdpc3RyYXRpb25Ub2tlblN0YXJ0RGF0ZVRpbWUiOiIiLCJleHAiOjE3NjAwNjQxNzJ9.QLkdYMoy8LHacs-smjqBGnw35gYBOXE1ehG28iA3mki9ZOe4BfVurbLTnPQgo26vYc2AG7Ymr4bM5jkKqlFlCesE1kNZqEdAXf3nJns0TgkikYqbrEiWCij9PTp7V_N8JDdOHl1h9bj12Puklk3LpG1OdORCxOXDO5rWFrNW3Ys"
        val tenantCode = "staging_tenant"
        val apiClient = RetrofitClient.getAuthorizedClient(authorization, tenantCode)

        val stockTakeSessionHdrRetrofit = Retrofit.Builder() // Set the connection timeout
            .baseUrl(Core2Config.CLOUD_URL)
            .client(apiClient)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val stockTakeSessionHdrService =
            stockTakeSessionHdrRetrofit.create(LoginService::class.java)

        // Create a coroutine on the GlobalScope
        GlobalScope.launch(Dispatchers.IO) {
            try {
                val response = stockTakeSessionHdrService.getUserAppletLInks()
                Log.d("responseBody", "code: ${response.data}")

            } catch (e: Exception) {
                Log.e("API Call", "Failed Reason: ${e.message}")
            }
        }
    }
}