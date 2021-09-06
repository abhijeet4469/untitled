plugins {
    kotlin("js") version "1.5.30"

}

group = "me.admin"
version = "0.3"

repositories {
    mavenCentral()
    google()
    mavenCentral()
    jcenter()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:17.0.2-pre.206-kotlin-1.5.10")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:17.0.2-pre.206-kotlin-1.5.10")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-styled:5.3.0-pre.206-kotlin-1.5.10")

    //implementation("org.example.myproject", "1.1.0")
    implementation(npm("react", "> 14.0.0 <=16.9.0")) // npm dependencies sample
    implementation(npm("is-sorted", "1.0.5"))

    implementation(npm("react-native-camera-kit", "11.2.1"))
    implementation(npm("mathjs", "9.4.4"))
    implementation(npm("string", "3.3.3"))
    //implementation(npm("chalk", "9.4.4"))
}

kotlin {
    /*js(LEGACY) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }*/
    js {
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
        binaries.executable()
    }
}