# kustomCompare

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