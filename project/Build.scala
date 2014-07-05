import sbt._
import Keys._

object HelloBuild extends Build {

    val sampleKeyA = SettingKey[String]("sampleA", "demo key A")
    val sampleKeyB = SettingKey[String]("sampleB", "demo key B")
    val sampleKeyC = SettingKey[String]("sampleC", "demo key C")
    val sampleKeyD = SettingKey[String]("sampleD", "demo key D")

    override lazy val settings = super.settings ++
        Seq(sampleKeyA := "A: in Build.settings in Build.scala", resolvers := Seq())

    lazy val root = Project(id = "hello",
                            base = file("."),
                            settings = Project.defaultSettings ++ Seq(sampleKeyB := "B: in the root project settings in Build.scala")
                           ) aggregate(foo, bar)

    lazy val bar = Project(id = "hello-bar",
                           base = file("bar")
                          ) dependsOn(root)

    lazy val foo = Project(id = "hello-foo",
                           base = file("foo"),
                           settings = Project.defaultSettings ++ Seq(
                             version := "0.7",
                             scalaVersion := "2.11.1")
                          ) dependsOn(bar)

}