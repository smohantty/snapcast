plugins {
    id("snapcast.android.library")
    id("snapcast.android.hilt")
}

android {
    namespace = "com.samsung.snapcast.mcf"
}

dependencies {
    api(libs.core.ktx)
}