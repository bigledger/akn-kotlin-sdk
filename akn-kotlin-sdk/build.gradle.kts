plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    //Retrofit
    api ("com.squareup.retrofit2:retrofit:2.9.0")
    //GSON converter
    api ("com.squareup.retrofit2:converter-gson:2.9.0")
    //moshi converter
    api ("com.squareup.retrofit2:converter-moshi:2.9.0")
    // Logging response
    api ("com.squareup.okhttp3:logging-interceptor:4.11.0")
    // okhttp
    api ("com.squareup.okhttp3:okhttp:4.11.0")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.ShyamBorkar"
            artifactId = "akn-kotlin-sdk"
            version = "0.0.1"
            from(components["java"])
        }
    }
}