package com.flightbooking.booking

import io.ktor.server.application.Application
import io.ktor.server.http.content.staticResources
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

/**
 * Configures all routes for the booking system
 * Sets `/static` path to serve static resources.
 * Mounts all GET and POST endpoints with the correct route handler.
 *
 * @return Unit
 */
fun Application.configureRouting() {
    routing {
        staticResources("/static", "static")
        get("/") { call.homePage() }
    }
}
