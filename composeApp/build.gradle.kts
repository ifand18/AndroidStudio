import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
    id("com.google.gms.google-services")
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
            baseName = "ComposeApp"
            isStatic = true
        }
    }
    
    sourceSets {
        
        androidMain.dependencies {
            implementation(compose.preview)
            implementation(libs.androidx.activity.compose)
            implementation(libs.androidx.lifecycle.viewmodel)
            implementation(libs.androidx.lifecycle.runtime.compose)
            implementation("androidx.compose.material:material-icons-extended:1.5.0")

            implementation("com.google.firebase:firebase-auth-ktx:21.0.3")
            implementation(platform("com.google.firebase:firebase-bom:33.1.2"))
            implementation("com.google.firebase:firebase-analytics")
            implementation("androidx.navigation:navigation-compose:2.5.3")
            // okhttp
            implementation("com.squareup.okhttp3:okhttp:4.9.3")

            // define a BOM and its version
            implementation(platform("com.squareup.okhttp3:okhttp-bom:4.12.0"))

            // define any required OkHttp artifacts without version
            implementation("com.squareup.okhttp3:okhttp")
            implementation("com.squareup.okhttp3:logging-interceptor")


        }
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)

            // retrofit
            implementation("com.squareup.retrofit2:retrofit:2.9.0")

            // json converter
            implementation("com.squareup.retrofit2:converter-gson:2.9.0")

            implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.0")

            implementation("io.ktor:ktor-client-logging:2.3.12")

            implementation("io.ktor:ktor-client-core:2.3.12")

            api("moe.tlaster:precompose:1.6.1")

        }
    }
}

android {
    namespace = "com.diskominfo.ragem"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")

    defaultConfig {
        applicationId = "com.diskominfo.ragem"
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
        viewBinding = true
    }
    dependencies {
        debugImplementation(compose.uiTooling)
    }

}
dependencies {
    implementation(libs.firebase.database)
    implementation(libs.play.services.auth.api.phone)
    implementation(libs.firebase.auth.ktx)
    implementation(libs.androidx.navigation.runtime.ktx)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.constraintlayout.compose)
}

