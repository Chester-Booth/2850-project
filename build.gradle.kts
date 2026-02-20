plugins {
    kotlin("jvm") version "2.3.10" apply false
    id("org.jlleitschuh.gradle.ktlint") version "14.0.1" apply false
    id("io.gitlab.arturbosch.detekt") version "1.23.8" apply false
    id("io.ktor.plugin") version "3.4.0" apply false
    id("org.jetbrains.kotlinx.kover") version "0.9.7" apply false
}
val ktorVersion = "3.4.0"
val exposedVersion = "1.0.0"
val sqliteVersion = "3.51.2.0"
val logbackVersion = "1.5.32"
val kotestVersion = "6.1.3"

extra["ktorVersion"] = ktorVersion
extra["exposedVersion"] = exposedVersion
extra["sqliteVersion"] = sqliteVersion
extra["logbackVersion"] = logbackVersion
extra["kotestVersion"] = kotestVersion

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jlleitschuh.gradle.ktlint")
    apply(plugin = "io.gitlab.arturbosch.detekt")
    apply(plugin = "org.jetbrains.kotlinx.kover")

    repositories {
        mavenCentral()
    }

    dependencies {
        "testImplementation"(kotlin("test"))
    }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
        }
    }

    configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
        version.set("1.8.0")
        outputToConsole.set(true)
    }

    configure<io.gitlab.arturbosch.detekt.extensions.DetektExtension> {
        config.setFrom(rootProject.files("detekt.yml"))
        buildUponDefaultConfig = true
    }
}
