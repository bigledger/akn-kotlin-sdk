# AKAUN Kotlin SDK #
[![](https://jitpack.io/v/bigledger/akn-kotlin-sdk.svg)](https://jitpack.io/#bigledger/akn-kotlin-sdk)

This reusable library is similar to the ts-lib (for Angular Typescript reusable library for the applets in the bigledger platform). Essentially, we are using this library to write the wrappers of various API calls. 
Examples would be for the login (authentication / authorization), retrieval of a list of applets , a list of tenants. This module will contain all the network related code using  the popular retrofit library.


## Gradle
To get a Git project into your build:

Add the dependency below into your **module**'s `build.gradle` file:

### Kotlin

```gradle
dependencies {
    implementation("com.github.bigledger:akn-kotlin-sdk:Tag")
}
```

### Groovy

```gradle
dependencies {
    implementation 'com.github.bigledger:akn-kotlin-sdk:Tag'
}
```

Make sure to add this into the settings.gradle file of your project:

### Kotlin

```gradle
allprojects {
  repositories {
    ...
    maven("https://www.jitpack.io")
  }
}
```

### Groovy

```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
