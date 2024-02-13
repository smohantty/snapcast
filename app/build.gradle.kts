import com.samsung.snapcast.FlavorDimension
import com.samsung.snapcast.SnapcastFlavor

plugins {
    id("snapcast.android.application")
    id("snapcast.android.application.compose")
    id("snapcast.android.hilt")
    id("snapcast.android.application.flavors")
}

android {
    namespace = "com.samsung.snapcast"
    defaultConfig {
        applicationId = "com.samsung.snapcast"
        versionCode = libs.versions.versionCode.get().toInt()
        versionName = libs.versions.versionName.get()
    }

    buildTypes {
        debug {
            applicationIdSuffix = ".debug"
        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(":feature:home"))
    implementation(project(":feature:about"))
    implementation(project(":feature:collection"))
    implementation(project(":designsystem"))
    implementation(project(":ui"))
    implementation(project(":data"))


    implementation(libs.core.ktx)
    implementation(libs.lifecycler)
    implementation(libs.activity)

    implementation(platform(libs.compose.bom))
    implementation(libs.bundles.compose)
    implementation(libs.compose.navigation)
    implementation(libs.androidx.hilt.navigation.compose)
    testImplementation(libs.junit)
    androidTestImplementation(libs.junit.ext)
    androidTestImplementation(libs.espresso)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.compose.ui.testing)
    debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.ui.test.manifest)
}