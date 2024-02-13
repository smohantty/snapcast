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
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}

dependencies {

    implementation(project(":core:designsystem"))
    implementation(project(":core:mcf"))


    implementation(libs.core.ktx)
    implementation(libs.lifecycler)
    implementation(libs.activity)

    implementation(platform(libs.compose.bom))
    implementation(libs.bundles.compose)
    implementation(libs.compose.navigation)
    implementation(libs.androidx.hilt.navigation.compose)
    debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.ui.test.manifest)
}