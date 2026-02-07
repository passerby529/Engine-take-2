plugins {
    id("com.android.application") version "8.4.2"
    kotlin("android") version "1.9.24"
}

android {
    namespace = "com.specopsfps.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.specopsfps.app"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "0.1-A"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            // default
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    // Pure Android + OpenGL ES. No external deps required.
}
