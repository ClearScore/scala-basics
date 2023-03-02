ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root =
  (project in file("."))
    .settings(name := "scala-basics")

libraryDependencies ++= Seq("org.scalameta" %% "munit" % "0.7.29" % Test)
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.15"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"
