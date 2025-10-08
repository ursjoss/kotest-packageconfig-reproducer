plugins {
    application
    kotlin("jvm") version "2.2.20"
    id("io.kotest") version "6.0.3"
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(JavaVersion.VERSION_17.majorVersion.toInt())
}

dependencies {
    testImplementation("io.kotest:kotest-framework-engine:6.0.3")
   testImplementation("io.kotest:kotest-runner-junit5:6.0.3")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

