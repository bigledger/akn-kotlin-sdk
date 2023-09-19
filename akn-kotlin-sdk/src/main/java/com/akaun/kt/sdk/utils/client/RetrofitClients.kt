package com.akaun.kt.sdk.utils.client

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

object RetrofitClient {
    const val requestTimeout: Long = 30

    fun getAuthorizedClient(authorization: String, tenantCode: String): OkHttpClient {
        val authorziedLoggingClient = OkHttpClient.Builder()
            .connectTimeout(requestTimeout, TimeUnit.SECONDS) // Set the connection timeout
            .readTimeout(requestTimeout, TimeUnit.SECONDS)    // Set the read timeout
            .writeTimeout(requestTimeout, TimeUnit.SECONDS)   // Set the write timeout
            .addInterceptor(LoggingInterceptor.bodyLoggingInterceptor)
            .addInterceptor(HeaderInterceptor(authorization, tenantCode))
            .build()
        return authorziedLoggingClient
    }

    fun getBasicClient(): OkHttpClient {
        val basicClient = OkHttpClient.Builder()
            .connectTimeout(requestTimeout, TimeUnit.SECONDS) // Set the connection timeout
            .readTimeout(requestTimeout, TimeUnit.SECONDS)    // Set the read timeout
            .writeTimeout(requestTimeout, TimeUnit.SECONDS)   // Set the write timeout
            .addInterceptor(LoggingInterceptor.bodyLoggingInterceptor)
            .build()
        return basicClient
    }

//    fun getCustomLoggingClient(loggingInterceptor:  HttpLoggingInterceptor.Logger): OkHttpClient {
//        val customLoggingClient = OkHttpClient.Builder()
//            .connectTimeout(requestTimeout, TimeUnit.SECONDS) // Set the connection timeout
//            .readTimeout(requestTimeout, TimeUnit.SECONDS)    // Set the read timeout
//            .writeTimeout(requestTimeout, TimeUnit.SECONDS)   // Set the write timeout
//            .addInterceptor(loggingInterceptor)
//            .build()
//
//        return customLoggingClient
//    }
}