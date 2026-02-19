package com.flightbooking.booking

import io.ktor.server.application.Application

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain
        .main(args)
}

fun Application.module() {
    configureTemplates()
    configureRouting()
}

fun Application.testModule() {
    configureTemplates()
    configureRouting()
}
