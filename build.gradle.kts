// Upgrade Kotlin compiler for Firebase compatibility
buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.4.21")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false

    id("com.google.gms.google-services") version "4.6.0" apply false
}
