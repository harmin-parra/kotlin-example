plugins {
    kotlin("jvm") version "2.2.20"
    java
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    // JUnit 5 for both Java & Kotlin
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testImplementation(kotlin("test"))

    // Mocking libraries
    testImplementation("io.mockk:mockk:1.14.5")            // Kotlin mocks
    testImplementation("org.mockito:mockito-core:5.20.0")  // Java mocks
}

tasks.test {
    useJUnitPlatform()  // Runs both JUnit 5 Kotlin and Java tests
    systemProperties = System.getProperties().mapKeys { it.key.toString() }

    testLogging {
        events("passed", "skipped", "failed")
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        showCauses = true
        showExceptions = true
        showStackTraces = true
    }

    reports {
        html.required.set(true)
        junitXml.required.set(true)

        html.outputLocation.set(layout.buildDirectory.dir("reports/tests/html"))
        junitXml.outputLocation.set(layout.buildDirectory.dir("reports/tests/xml"))
    }
}
