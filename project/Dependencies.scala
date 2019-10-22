import sbt._

object Dependencies {
  val ScalaTestVersion     = "3.0.8"
  val AkkaHttpVersion      = "10.1.10"
  val CatsEffectVersion    = "2.0.0"
  val AkkaVersion          = "2.5.26"
  val CirceVersion         = "0.12.3"
  val AkkaHttpCirceVersion = "1.29.1"
  val RefinedVersion       = "0.9.10"

  lazy val circe = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-refined",
    "io.circe" %% "circe-parser"
  ).map(_ % CirceVersion)

  lazy val akkaHttpCirce = Seq(
    "de.heikoseeberger" %% "akka-http-circe" % AkkaHttpCirceVersion
  )

  lazy val scalaTest = Seq(
    "org.scalatest" %% "scalatest" % ScalaTestVersion % Test
  )

  lazy val cats = Seq(
    "org.typelevel" %% "cats-effect" % CatsEffectVersion
  )

  lazy val refined = Seq(
    "eu.timepit" %% "refined"            % RefinedVersion,
    "eu.timepit" %% "refined-pureconfig" % RefinedVersion
  )

  lazy val akkaHttpDependencies = Seq(
    "com.typesafe.akka" %% "akka-http"           % AkkaHttpVersion,
    "com.typesafe.akka" %% "akka-stream"         % AkkaVersion,
    "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion % Test,
    "com.typesafe.akka" %% "akka-http-testkit"   % AkkaHttpVersion % Test
  )
}
