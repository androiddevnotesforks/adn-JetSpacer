package com.sakethh.jetspacer.screens.home.data.remote.issLocation


import com.sakethh.jetspacer.screens.home.data.remote.issLocation.dto.ISSLocationDTO
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class ISSLocationImplementation(private val ktorClient:HttpClient):ISSLocationService {
    override suspend fun getISSLocation(): ISSLocationDTO {
        // ISS_LOCATION_URL
        return ktorClient.get("http://api.open-notify.org/iss-now.json").body()
    }
}