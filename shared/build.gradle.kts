import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    //to deserialize JSON responses into objects of entity classes.
    alias(libs.plugins.kotlinxSerialization)



}

kotlin {
    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "Shared"
            isStatic = true
        }
    }
    
    sourceSets {
        commonMain.dependencies {
            // put your Multiplatform dependencies here

            // Ktor Api
            implementation(libs.ktor.client.core)
            implementation(libs.kotlinx.coroutines.core)

            // To deserialize JSON responses into objects of entity classes.
            implementation(libs.ktor.serialization.kotlinx.json)
            // Deserialize the result of a GET request.
            // The plugin processes the request and the response payload as JSON,
            // serializing and deserializing them as needed.
            implementation(libs.ktor.client.content.negotiation)

        }

        androidMain.dependencies {
            implementation(libs.ktor.client.okhttp)

        }

        iosMain.dependencies {
            implementation(libs.ktor.client.darwin)
        }
    }
}

android {
    namespace = "com.codeplace.kmpmvvmmindfulnessapp.shared"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}
