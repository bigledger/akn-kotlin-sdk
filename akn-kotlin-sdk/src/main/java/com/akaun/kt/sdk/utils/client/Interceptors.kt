package com.akaun.kt.sdk.utils.client

import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor

object LoggingInterceptor {
    val basicLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC)
    val headersLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.HEADERS)
    val bodyLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
}

class HeaderInterceptor(private val authorization: String, private val tenantCode: String) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("Authorization", authorization)
            .addHeader("tenantCode", tenantCode)
            .build()
        return chain.proceed(request)
    }
}
