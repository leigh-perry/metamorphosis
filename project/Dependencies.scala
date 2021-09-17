import sbt._

object Dependencies {

  object Version {
    val scala = "2.12.14"

    val kafka = "2.8.1"
  }

  val kafkaConnectTransforms = "org.apache.kafka" % "connect-transforms" % Version.kafka

  val scalaReflect = "org.scala-lang" % "scala-reflect" % Version.scala
}
