plugins {
    application
    id("io.ktor.plugin")
}

val ktorVersion: String by rootProject.extra
val logbackVersion: String by rootProject.extra
val kotestVersion: String by rootProject.extra

application {
    mainClass.set("com.flightbooking.management.ApplicationKt")
}

dependencies {
    implementation(project(":logic"))

    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("io.ktor:ktor-server-pebble:$ktorVersion")
    implementation("io.ktor:ktor-server-config-yaml:$ktorVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")

    testImplementation("io.ktor:ktor-server-test-host:$ktorVersion")
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
}

kover {
    reports {
        verify {
            rule {
                minBound(70)
            }
        }
    }
}
