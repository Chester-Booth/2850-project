package com.flightbooking.management

import io.ktor.server.application.ApplicationCall
import io.ktor.server.pebble.respondTemplate

suspend fun ApplicationCall.homePage() {
    respondTemplate("index.peb", emptyMap())
}
