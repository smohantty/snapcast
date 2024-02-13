plugins {
    id("snapcast.android.library")
    id("snapcast.android.hilt")
}

android {
    namespace = "com.samsung.snapcast.data"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.bundles.network)
    implementation(libs.kotlinx.serialization.json)
    implementation(project(":domain"))
}