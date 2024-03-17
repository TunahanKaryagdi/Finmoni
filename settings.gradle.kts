pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}

rootProject.name = "Finmoni"
include(":app")
include(":core:data")
include(":core:network")
include(":feature:login")
include(":feature:overview")
include(":core:designsystem")
include(":core:ui")
include(":feature:payments")
include(":feature:add-payment")
include(":feature:signup")
