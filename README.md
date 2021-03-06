# kustomCompare

[![Maven Central](https://img.shields.io/maven-metadata/v?color=40BA13&metadataUrl=https%3A%2F%2Frepo1.maven.org%2Fmaven2%2Fio%2Fgithub%2Fabaddon%2FkustomCompare%2Fmaven-metadata.xml&versionPrefix=0.)](https://ossindex.sonatype.org/component/pkg:maven/io.github.abaddon/kustomCompare)
[![Java CI with Gradle](https://github.com/abaddon/kustomCompare/actions/workflows/gradle.yml/badge.svg)](https://github.com/abaddon/kustomCompare/actions/workflows/gradle.yml)
[![codecov](https://codecov.io/gh/abaddon/kustomCompare/branch/main/graph/badge.svg?token=N24T6BXQB8)](https://codecov.io/gh/abaddon/kustomCompare)

A library to compare classes

Example

```kotlin
data class User(
    val name: String,
    val birthdate: Instant
)

val birthdate = Instant.now()
val user1 = UserTest("stefano", Instant.now())
val user2 = UserTest("stefano", Instant.now())

// Define the fields to exclude in the compare
val compareLogicConfig = CompareLogicConfig()
    .addMemberToIgnore("birthdate")
// Create che compare 
val compareLogic = CompareLogic(compareLogicConfig)

// compare the 2 elements
val result = compareLogic.compare(user1, user2)

assertTrue(result.result())


```
