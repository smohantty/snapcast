plugins {
    id("snapcast.android.library")
    id("snapcast.android.library.compose")
}

android {
    namespace = "com.samsung.snapcast.ui"
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(project(":designsystem"))
    implementation(project(":domain"))
    api(libs.bundles.compose)
    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)
    testImplementation(libs.junit)
    androidTestImplementation(libs.junit.ext)
    androidTestImplementation(libs.espresso.core)
    debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.ui.test.manifest)
}