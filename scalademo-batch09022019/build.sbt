import Dependencies._

lazy val root = (project in file("."))
  .settings(
    name := "scalademo-batch09022019",
    scalaVersion := "2.11.8",
    libraryDependencies += scalaTest % Test
  )
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.1"