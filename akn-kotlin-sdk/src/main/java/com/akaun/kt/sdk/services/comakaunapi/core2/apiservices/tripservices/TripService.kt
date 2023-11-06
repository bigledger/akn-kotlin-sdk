package com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.tripservices


import com.akaun.kt.app.delivery.driverapp.model.trip.DriverTripQueryCriteria
import com.akaun.kt.app.delivery.driverapp.model.trip.TripsPostQueryCriteria
import com.akaun.kt.sdk.models.aggregates.erp.trip.TripsDriverVehicleModel
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.Core2Config
import com.akaun.kt.sdk.services.comakaunapi.core2.apiservices.shared.PagingResponseModel
import com.akaun.kt.sdk.services.comakaunapi.core2.dto.TripListingWithDriverOutputDTO
import retrofit2.http.Body
import retrofit2.http.POST



object Core2UrlTripPrefix {
    const val PREFIX = Core2Config.TENANT_DOMAIN_URL_PREFIX + "del/trips"
}

interface TripService {

    @POST(Core2UrlTripPrefix.PREFIX +"/backoffice-ep/driver-trip-listing/query")
    suspend fun getDriverTrips(
        @Body DriverTripQueryCriteria: DriverTripQueryCriteria
    ) : PagingResponseModel<TripListingWithDriverOutputDTO>

    @POST(Core2UrlTripPrefix.PREFIX + "/login-driver-ep/getTrip/query")
    suspend fun getDriverTripsLoginDriverEp(
        @Body TripsPostQueryCriteria: TripsPostQueryCriteria
    ) : PagingResponseModel<TripsDriverVehicleModel>

}