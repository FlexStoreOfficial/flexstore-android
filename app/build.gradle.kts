plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.flexstore.flexstore_android"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.flexstore.flexstore_android"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation ('com.github.solkin:simple-image-loader:v0.9.6')
    implementation ('com.github.solkin:disk-lru-cache:1.5')
    implementation ('org.jetbrains.kotlin:kotlin-stdlib:1.9.24')
    implementation ('androidx.core:core-ktx:1.13.1')
    implementation ('androidx.appcompat:appcompat:1.7.0')
    implementation ('androidx.recyclerview:recyclerview:1.3.2')
    implementation ('androidx.startup:startup-runtime:1.2.0')
    implementation ('androidx.swiperefreshlayout:swiperefreshlayout:1.1.0')
    implementation ('androidx.annotation:annotation:1.9.1')
    implementation ('androidx.annotation:annotation:1.9.1')
    implementation ('com.google.android.material:material:1.12.0')
    implementation ('com.google.code.gson:gson:2.10.1')
    implementation ('com.google.dagger:dagger:2.50')
    implementation ('com.google.dagger:dagger-compiler:2.50')
    implementation ('org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.5.0')
    implementation ('io.reactivex.rxjava3:rxandroid:3.0.0')
    implementation ('io.reactivex.rxjava3:rxjava:3.0.6')
    implementation ('io.reactivex.rxjava3:rxkotlin:3.0.1')
    implementation ('com.jakewharton.rxrelay3:rxrelay:3.0.1')
    implementation ('com.squareup.okhttp3:okhttp:4.12.0')
    implementation ('com.squareup.retrofit2:retrofit:2.9.0')
    implementation ('com.squareup.retrofit2:converter-gson:2.9.0')
    implementation ('com.squareup.retrofit2:adapter-rxjava3:2.9.0')
    implementation ('com.caverock:androidsvg-aar:1.4')
    implementation ('me.zhanghai.android.materialratingbar:library:1.4.0')
    implementation ('com.greysonparrelli.permiso:permiso:0.3.0')
    implementation ('com.microsoft.appcenter:appcenter-analytics:4.4.5')
    implementation ('com.microsoft.appcenter:appcenter-crashes:4.4.5')
    implementation ('com.github.laobie:StatusBarUtil:2aac14c8e8')
    implementation ('com.github.avito-tech:Konveyor:0.42.2')
    implementation ('com.github.rubensousa:BottomSheetBuilder:1.6.0')
    debugImplementation ('com.github.chuckerteam.chucker:library:3.5.2')
    releaseImplementation ('com.github.chuckerteam.chucker:library-no-op:3.5.2')
    implementation ('org.androidannotations:androidannotations-api:4.8.0')
    testImplementation ('junit:junit:4.13.2')
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

}