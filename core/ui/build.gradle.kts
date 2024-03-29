@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.tunahankaryagdi.ui"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    composeOptions{
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    buildFeatures{
        compose = true
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(":core:designsystem"))

    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.material3)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui.tooling)
    implementation(libs.charts)


}