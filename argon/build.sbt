import Dependencies._

ThisBuild / scalaVersion     := "2.13.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"


enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.13.1" // or any other Scala version >= 2.11.12

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.akka-js" %%% "akkajsactor" % "2.2.6.5"
libraryDependencies += "org.akka-js" %%% "akkajsactorstream" % "2.2.6.5"
libraryDependencies += "org.akka-js" %%% "akkajstestkit" % "2.2.6.5" % "test"
libraryDependencies += "org.akka-js" %%% "akkajsstreamtestkit" % "2.2.6.5" % "test"
libraryDependencies += "org.akka-js" %%% "akkajsactortyped" % "2.2.6.5"
libraryDependencies += "org.akka-js" %%% "akkajstypedtestkit" % "2.2.6.5" % "test"
libraryDependencies += "org.akka-js" %%% "akkajsactorstreamtyped" % "2.2.6.5"

libraryDependencies += "com.github.cornerman" %%% "sloth" % "0.3.0"

scalacOptions ++= {
  import Ordering.Implicits._
  if (VersionNumber(scalaVersion.value).numbers >= Seq(2L, 13L)) {
    Seq("-Ymacro-annotations")
  } else {
    Nil
  }
}

// Enable macro annotations by adding compiler plugins for Scala 2.12
libraryDependencies ++= {
  import Ordering.Implicits._
  if (VersionNumber(scalaVersion.value).numbers >= Seq(2L, 13L)) {
    Nil
  } else {
    Seq(compilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full))
  }
}

libraryDependencies += "org.lrng.binding" %%% "html" % "latest.release"


libraryDependencies += "com.github.xuwei-k" %% "msgpack4z-core" % "0.5.0"

scalacOptions ++= {
  import Ordering.Implicits._
  if (VersionNumber(scalaVersion.value).numbers >= Seq(2L, 13L)) {
    Seq("-Ymacro-annotations")
  } else {
    Nil
  }
}

// Enable macro annotations by adding compiler plugins for Scala 2.12
libraryDependencies ++= {
  import Ordering.Implicits._
  if (VersionNumber(scalaVersion.value).numbers >= Seq(2L, 13L)) {
    Nil
  } else {
    Seq(compilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full))
  }
}

libraryDependencies += "org.lrng.binding" %%% "html" % "latest.release"