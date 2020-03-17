scalaVersion in Global := "2.12.11"

excludeDependencies ++= Seq(
  // workaround for https://github.com/sbt/sbt/issues/3618
  // include "jakarta.ws.rs" % "jakarta.ws.rs-api" instead
  ExclusionRule("javax.ws.rs", "javax.ws.rs-api"),
)

libraryDependencies += "org.apache.kafka" %% "kafka-streams-scala" % "2.0.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "com.madewithtea" %% "mockedstreams" % "2.0.0" % "test"
libraryDependencies += "jakarta.ws.rs" % "jakarta.ws.rs-api" % "2.1.5"
// libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.28" % Test