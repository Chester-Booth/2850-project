package com.flightbooking.management

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.pebble.Pebble
import io.pebbletemplates.pebble.loader.ClasspathLoader

/**
 * Sets up the pebble templates.
 * Installs the pebble plugin and sets templates loading from `templates/`.
 *
 * Must be called before handling requests that render templates.
 *
 * @return Unit
 */
fun Application.configureTemplates() {
    install(Pebble) {
        loader(ClasspathLoader().apply { prefix = "templates/" })
    }
}
