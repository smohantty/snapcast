plugins {
    id("snapcast.android.library")
    kotlin("kapt")
}

android {
    namespace = "com.samsung.snapcast.domain"

}

dependencies {

    implementation(libs.hilt.android)
    implementation(libs.kotlinx.coroutines.android)
    kapt(libs.hilt.compiler)
}