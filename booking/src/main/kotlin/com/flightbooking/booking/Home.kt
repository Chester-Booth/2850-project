package com.flightbooking.booking

import io.ktor.server.application.ApplicationCall
import io.ktor.server.pebble.respondTemplate

/**
 * Shows the home page.
 * Responds with the associated template and data model.
 * The home page has no dynamic content so an empty map is used.
 *
 * Must be called within a routing context.
 *
 * @return Unit
 */
suspend fun ApplicationCall.homePage() {
    respondTemplate("index.peb", emptyMap())
}
