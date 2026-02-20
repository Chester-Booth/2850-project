val exposedVersion: String by rootProject.extra
val sqliteVersion: String by rootProject.extra

dependencies {
    implementation("org.jetbrains.exposed:exposed-core:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-dao:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-java-time:$exposedVersion")
    implementation("org.xerial:sqlite-jdbc:$sqliteVersion")
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
