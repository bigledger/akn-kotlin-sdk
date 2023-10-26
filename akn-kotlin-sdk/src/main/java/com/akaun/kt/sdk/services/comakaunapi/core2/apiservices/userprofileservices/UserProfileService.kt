package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.userprofileservices

import com.akaun.kt.sdk.models.aggregates.erp.applogin.AppLoginModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.BasicApiResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Path



object Core2UrlUserProfilePrefix {
    const val PREFIX = Core2Config.PLATFORM_DOMAIN_URL_PREFIX + "identity/userprofile"
}

interface UserProfileService {
    @GET(Core2UrlUserProfilePrefix.PREFIX)
    suspend fun getUserProfile() : BasicApiResponseModel<AppLoginModel>

    @GET(Core2UrlUserProfilePrefix.PREFIX + "/photo/{extGuid}")
    suspend fun getUserProfilePhoto(
        @Path("extGuid") extGuid : String
    ) : ResponseBody
}