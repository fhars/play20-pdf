name := "play-pdf"

organization := "de.joergviola"

version := "0.6.2-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.xhtmlrenderer" % "flying-saucer-pdf" % "9.0.6",
  "nu.validator.htmlparser" % "htmlparser" % "1.4"
)

play.Project.playJavaSettings
