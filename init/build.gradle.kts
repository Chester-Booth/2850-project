dependencies {
    implementation(project(":database"))
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
