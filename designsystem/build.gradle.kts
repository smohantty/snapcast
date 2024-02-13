plugins {
    id("snapcast.android.library")
    id("snapcast.android.library.compose")
}

android {
    namespace = "com.samsung.snapcast.designsystem"
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    api(libs.core.ktx)
    api(libs.bundles.compose)
}