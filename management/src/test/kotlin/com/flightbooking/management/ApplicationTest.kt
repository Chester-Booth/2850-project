package com.flightbooking.management

import io.kotest.core.spec.style.StringSpec
import io.ktor.client.request.get
import io.ktor.http.HttpStatusCode
import io.ktor.server.config.MapApplicationConfig
import io.ktor.server.testing.testApplication
import kotlin.test.assertEquals

class ApplicationTest :
    StringSpec({
        "Home Page Returns 200/OK" {
            testApplication {
                environment {
                    config = MapApplicationConfig()
                }
                application {
                    testModule()
                }
                val response = client.get("/")
                assertEquals(HttpStatusCode.OK, response.status)
            }
        }
    })
