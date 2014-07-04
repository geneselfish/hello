name := "hello"

version := "0.1"

//scalaVersion := "2.11.1"
scalaVersion := "2.9.1"

sampleKeyC in ThisBuild := "C: in build.sbt scoped to ThisBuild"

sampleKeyD := "D: in build.sbt"

libraryDependencies ++= Seq(
  "org.scala-tools.time" % "time_2.9.1" % "0.5"
)
