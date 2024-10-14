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
    //Retrofit Core
    api (libs.retrofit.core)
    //GSON converter
    api (libs.retrofit.converter.gson)
    //moshi converter
    api (libs.retrofit.converter.moshi)
    // Logging response
    api (libs.okhttp.logging)
    // okhttp core
    api (libs.okhttp.core)
    // sandwich library model retrofit responses
    api (libs.sandwich)
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.10")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.bigledger"
            artifactId = "akn-kotlin-sdk"
            version = "0.0.74"
            from(components["java"])
        }
    }
}