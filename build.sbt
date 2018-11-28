name := "DataIngestionAccelerator"

version := "0.1"

scalaVersion := "2.11.8"

val sparkVersion = "2.3.2"

resolvers ++= Seq(
  "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/",
  "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Maven Central" at "https://repo1.maven.org/maven2/",
  Resolver.sonatypeRepo("releases"),
  //"apache-snapshots" at "http://repository.apache.org/snapshots/",
  "Hortonworks Releases" at "http://repo.hortonworks.com/content/repositories/releases",
  "Jetty Releases" at "http://repo.hortonworks.com/content/repositories/jetty-hadoop/"
  //"mvn-repository at https://mvnrepository.com/artifact/org.apache.spark/spark-hive"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  // "net.hydromatic" % "eigenbase-properties" % "1.1.5",
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-hive-thriftserver" % sparkVersion,
  "net.sf.jt400" % "jt400" % "9.5",
  "mysql" % "mysql-connector-java" % "5.1.6"

)