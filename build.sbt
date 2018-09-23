name := "microservice"

version := "0.1"

scalaVersion := "2.12.6"

resolvers += Resolver.bintrayRepo("hseeberger", "maven")

libraryDependencies ++= {
  val AkkaVersion       = "2.5.16"
  val AkkaHttpVersion   = "10.1.3"
  val CirceVersion = "0.9.3"

  Seq(
    "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
    "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
    "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
    "io.circe" %% "circe-core" % CirceVersion,
    "io.circe" %% "circe-generic" % CirceVersion,
    "io.circe" %% "circe-parser" % CirceVersion,
    "de.heikoseeberger" %% "akka-http-circe" % "1.21.1",
    "org.scalactic" %% "scalactic" % "3.0.5",
    "com.typesafe.akka" %% "akka-testkit" % AkkaVersion % Test,
    "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion % Test,
    "com.typesafe.akka" %% "akka-http-testkit" % "10.1.5" % Test,
    "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )
}