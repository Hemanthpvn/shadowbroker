name := "shadowbroker"

version := "1.0"

libraryDependencies ++= Seq(
  "org.apache.camel" % "camel-core" % "2.11.0",
  "org.apache.camel" % "camel-scala" % "2.11.0",
  "org.apache.camel" % "camel-xmpp" % "2.11.0",
  "org.apache.camel" % "camel-mail" % "2.11.0",
  "ch.qos.logback" % "logback-core" % "1.0.9",
  "ch.qos.logback" % "logback-classic" % "1.0.9"
)

mainClass := Some("uk.ac.sanger.hgi.shadowbroker.Main")