import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {

    const val kotlinCompilerExtensionVersion = "1.4.0"

    /* ktx Core Dependencies*/
    private const val ktxCoreVersion = "1.12.0"
    const val ktxCore = "androidx.core:core-ktx:${ktxCoreVersion}"

    private const val lifeCycleRuntimeVersion = "2.7.0"
    const val ktxLifeCycleRuntime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${lifeCycleRuntimeVersion}"


    /*Compose UI Dependencies*/
    private const val composeActivityVersion = "1.8.2"
    const val composeActivity = "androidx.activity:activity-compose:${composeActivityVersion}"

    private const val composeUiVersion = "1.6.1"
    const val composeUi = "androidx.compose.ui:ui:${composeUiVersion}"
    const val composeGraphics = "androidx.compose.ui:ui-graphics:${composeUiVersion}"
    const val composeToolPreview = "androidx.compose.ui:ui-tooling-preview:${composeUiVersion}"

    /*Compose Material3 Dependencies*/
    private const val composeMaterial3Version = "1.2.0"
    const val composeMaterial3 = "androidx.compose.material3:material3:${composeMaterial3Version}"

    /*Coil Dependencies*/
    private const val coilVersion = "2.2.2"
    const val coilCompose = "io.coil-kt:coil-compose:${coilVersion}"
    const val coilGif = "io.coil-kt:coil-gif:${coilVersion}"
    const val coilSvg = "io.coil-kt:coil-svg:${coilVersion}"

    /*Ktor Network Dependencies*/
    private const val ktorVersion = "2.3.8"
    const val ktorClientCore = "io.ktor:ktor-client-core:${ktorVersion}"
    const val ktorClientAndroid = "io.ktor:ktor-client-android:${ktorVersion}"
    const val ktorLogging = "io.ktor:ktor-client-logging:${ktorVersion}"
    const val ktorClientJson = "io.ktor:ktor-client-json:${ktorVersion}"
    const val ktorNegotiation = "io.ktor:ktor-client-content-negotiation:${ktorVersion}"
    const val ktorClientSerialization = "io.ktor:ktor-client-serialization:${ktorVersion}"
    const val ktorKotlinSerialization = "io.ktor:ktor-serialization-kotlinx-json:${ktorVersion}"
    const val ktorOkHttpClient = "io.ktor:ktor-client-okhttp:${ktorVersion}"

    /*Koin Injection Dependencies*/
    private const val koinVersion = "3.5.3"
    const val koinCore = "io.insert-koin:koin-core:${koinVersion}"
    const val koinAndroid = "io.insert-koin:koin-android:${koinVersion}"
    const val koinCompose = "io.insert-koin:koin-androidx-compose:${koinVersion}"

    /*Splash Dependencies*/
    private const val splashScreenCoreVersion = "1.0.1"
    const val splashScreen = "androidx.core:core-splashscreen:${splashScreenCoreVersion}"


    /*Json Serialization Dependencies*/
    private const val kotlinSerializationVersion = "1.5.1"
    const val kotlinJsonSerialize =
        "org.jetbrains.kotlinx:kotlinx-serialization-json:${kotlinSerializationVersion}"


    /*ViewModel LifeCycle Dependencies*/
    private const val viewModelLifeCycleVersion = "2.7.0"
    const val viewModelLifeCycle =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${viewModelLifeCycleVersion}"


    /*Coroutine Dependencies*/
    private const val coroutinesCoreVersion = "1.7.3"
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${coroutinesCoreVersion}"


    /*Compose Navigation Dependencies*/
    private const val composeNavigationVersion = "2.7.7"
    const val composeNavigation = "androidx.navigation:navigation-compose:${composeNavigationVersion}"
    const val composeNavigationUi =
        "androidx.navigation:navigation-ui-ktx:${composeNavigationVersion}"


    /*SQL Delight Dependencies*/
    private const val sqlDelightDriverVersion = "1.5.5"
    const val sqlDelightDriver = "com.squareup.sqldelight:android-driver:${sqlDelightDriverVersion}"
    const val sqlDelightCoroutineExt =
        "com.squareup.sqldelight:coroutines-extensions-jvm:${sqlDelightDriverVersion}"


    /*Test Dependencies*/
    private const val testJunitVersion = "4.13.2"
    const val testJUnit = "junit:junit:${testJunitVersion}"

    private const val testJunitExtVersion = "1.1.5"
    const val testJUnitExt = "androidx.test.ext:junit:${testJunitExtVersion}"

    private const val testExpressoCoreVersion = "3.5.1"
    const val testExpressoCore = "androidx.test.espresso:espresso-core:${testExpressoCoreVersion}"

    private const val testComposeUiVersion = "1.6.1"
    const val testComposeUi = "androidx.compose.ui:ui-test-junit4:${testComposeUiVersion}"
    const val testComposeUiTooling = "androidx.compose.ui:ui-tooling:${testComposeUiVersion}"
    const val testComposeManifest = "androidx.compose.ui:ui-test-manifest:${testComposeUiVersion}"


}


fun DependencyHandler.viewModelLifeCycle() {
    implementation(Dependencies.viewModelLifeCycle)
}

fun DependencyHandler.coroutines() {
    implementation(Dependencies.coroutinesCore)
}

fun DependencyHandler.navigationCompose() {
    implementation(Dependencies.composeNavigation)
    implementation(Dependencies.composeNavigationUi)
}

fun DependencyHandler.ktxCore() {
    implementation(Dependencies.ktxCore)
    implementation(Dependencies.ktxLifeCycleRuntime)
}

fun DependencyHandler.composeUi() {
    implementation(Dependencies.composeActivity)
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeGraphics)
    implementation(Dependencies.composeToolPreview)
    implementation(Dependencies.composeMaterial3)
}


fun DependencyHandler.ktor() {
    implementation(Dependencies.ktorClientCore)
    implementation(Dependencies.ktorClientAndroid)
    implementation(Dependencies.ktorLogging)
    implementation(Dependencies.ktorClientJson)
    implementation(Dependencies.ktorNegotiation)
    implementation(Dependencies.ktorClientSerialization)
    implementation(Dependencies.ktorOkHttpClient)
    implementation(Dependencies.ktorKotlinSerialization)
    implementation(Dependencies.kotlinJsonSerialize)
}

fun DependencyHandler.sqlDelight() {
    implementation(Dependencies.sqlDelightDriver)
    implementation(Dependencies.sqlDelightCoroutineExt)
}

fun DependencyHandler.coil() {
    implementation(Dependencies.coilCompose)
    implementation(Dependencies.coilGif)
    implementation(Dependencies.coilSvg)
}

fun DependencyHandler.splashScreen() {
    implementation(Dependencies.splashScreen)
}

fun DependencyHandler.koin() {
    implementation(Dependencies.koinCore)
    implementation(Dependencies.koinAndroid)
    implementation(Dependencies.koinCompose)
}

fun DependencyHandler.jUnitTest() {
    testImplementation(Dependencies.testJUnit)
    androidTestImplementation(Dependencies.testJUnitExt)
    androidTestImplementation(Dependencies.testExpressoCore)
    androidTestImplementation(Dependencies.testComposeUi)
    androidTestImplementation(Dependencies.testComposeUiTooling)
    androidTestImplementation(Dependencies.testComposeManifest)
}

fun DependencyHandler.composeUiTest() {
    androidTestImplementation(Dependencies.testComposeUi)
    androidTestImplementation(Dependencies.testComposeUiTooling)
    androidTestImplementation(Dependencies.testComposeManifest)
}