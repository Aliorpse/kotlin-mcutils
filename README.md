# mcutils

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/d83f9fcc077b448f9ce2a40865b17343)](https://app.codacy.com/gh/Aliorpse/kotlin-mcutils/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_grade)
[![CodeFactor](https://www.codefactor.io/repository/github/aliorpse/kotlin-mcutils/badge/main)](https://www.codefactor.io/repository/github/aliorpse/kotlin-mcutils/overview/main)
[![Maven Central](https://maven-badges.sml.io/sonatype-central/tech.aliorpse/mcutils/badge.svg)](https://central.sonatype.com/artifact/tech.aliorpse/mcutils)

A Kotlin-based Minecraft request library provides utility functions related to Minecraft queries.

## Installation

### Gradle

```kotlin
dependencies {
    implementation("tech.aliorpse:mcutils:$version")
}
```

### Maven

```xml
<dependency>
    <groupId>tech.aliorpse</groupId>
    <artifactId>mcutils</artifactId>
    <version><!-- version --></version>
</dependency>
```

## Basic examples

```kotlin
fun main() = runBlocking {
    var status
    status = JavaServer.getStatus("mc.hypixel.net")
    status = JavaServer.getStatus(
        host = "wdsj.net",
        port = 25565,
        enableSrv = true
    )
    status = BedrockServer.getStatus("play.easecation.net")
    
    var playerInfo
    playerInfo = Player.getProfile("ec042e1200ac4a249cc83eb1fab0bd88")
    playerInfo = Player.getProfileByName("Aliorpse")
}
```
