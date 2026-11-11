# UMKMedu

An Android educational application with articles, discussion, account, and profile screens.

[Repository](https://github.com/MirzaAlbab/UMKMedu)

## Features

- Article browsing and reading screens
- Discussion interface
- Login, sign-up, and profile screens
- Java/Kotlin sources and a local database helper

## Technology

Java, Kotlin, AndroidX, Navigation, Gradle

## Getting started

Install Android Studio with the SDK/build tools required by `app/build.gradle` and a JDK compatible with the checked-in Android Gradle plugin.

```bash
git clone https://github.com/MirzaAlbab/UMKMedu.git
cd UMKMedu
```

Open the repository in Android Studio, allow Gradle sync to complete, and select the `app` run configuration. Choose a compatible emulator or device.

A debug APK can also be built with the repository's Gradle wrapper:

```bash
bash gradlew assembleDebug
```

On Windows, use `gradlew.bat assembleDebug`.

## Development and checks

```bash
bash gradlew test
```

Run `bash gradlew connectedAndroidTest` with an emulator or device connected for instrumented tests.

## Project structure

- `app/` — Application source

## Project notes

The app module specifies compile SDK 31 and minimum SDK 19. Match the checked-in Gradle and Android plugin versions when choosing a JDK.

## License

No root `LICENSE` file was present in the reviewed repository. Consult the repository owner about reuse; dependencies and third-party assets retain their own terms.
