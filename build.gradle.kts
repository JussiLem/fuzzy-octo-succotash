plugins {
    java
    scala
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.1")
    implementation("com.typesafe:config:1.4.0")
    implementation("ch.qos.logback:logback-classic:1.2.3")
    implementation("org.apache.spark:spark-core_2.12:2.4.4")

    testImplementation("org.scalatest:scalatest_2.11:3.0.0")
    testImplementation("junit:junit:4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}