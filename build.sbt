import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.2",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Tagless-final-blog",
    libraryDependencies ++= Seq(slick, h2, scalaTest % Test)
  )
