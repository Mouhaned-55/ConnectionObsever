package com.example.connectionobserver

import kotlinx.coroutines.flow.Flow
import javax.net.ssl.SSLEngineResult.Status

interface ConnectivityObserver {

    fun observe(): Flow<Status>

    enum class Status {
        Available, Unavailable, Losing, Lost
    }

}