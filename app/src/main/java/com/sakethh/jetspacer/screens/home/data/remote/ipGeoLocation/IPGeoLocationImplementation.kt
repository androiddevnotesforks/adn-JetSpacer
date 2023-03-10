package com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation


import com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class IPGeoLocationImplementation(private val httpClient: HttpClient) : IPGeolocationService {
    override suspend fun getGeoLocationData(): IPGeoLocationDTO {
        return httpClient.get("https://api.ipgeolocation.io/ipgeo").body()
    }
}