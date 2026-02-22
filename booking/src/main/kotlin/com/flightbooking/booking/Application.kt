package com.flightbooking.booking

import com.flightbooking.database.Database
import io.ktor.server.application.Application
import org.jetbrains.exposed.v1.jdbc.transactions.TransactionManager

/**
 * The entry point for the booking module.
 * Launches the web server using Ktor.
 * @param args command-line arguments passed to the
 * @return Unit
 */
fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain
        .main(args)
}

/**
 * Sets up the booking application module.
 * Configures routing and templates to handle HTTP requests.
 * @return Unit
 */
fun Application.module() {
    TransactionManager.defaultDatabase = Database.db
    configureTemplates()
    configureRouting()
}

/**
 * Sets up the booking application module for testing.
 * Uses an in-memory database rather than the real DB.
 * Configures templates and routing identical to the main module.
 * @return Unit
 */
fun Application.testModule() {
    configureTemplates()
    configureRouting()
}
