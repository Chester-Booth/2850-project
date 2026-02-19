package com.flightbooking.booking

import io.ktor.server.application.ApplicationCall
import io.ktor.server.pebble.respondTemplate

suspend fun ApplicationCall.homePage() {
    respondTemplate("index.peb", emptyMap())
}
