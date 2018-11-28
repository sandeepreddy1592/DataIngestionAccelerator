package source

import api.SourceProcessor
import org.apache.log4j.{Level, Logger}
import factory.SourceFactory
import java.sql.DriverManager
import processlayer.SparkJob


case class SourceName1(SourceName: String) extends SourceProcessor with SparkJob {

  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)

  override def process(SourceName: String) {

    import sparkSession.implicits._

    val jdbcHostname = "localhost"
    val jdbcPort = 3306
    val jdbcDatabase = "classicmodels"
    val jdbcUsername = "test"
    val jdbcPassword = "Test@123"

    // Create the JDBC URL without passing in the user and password parameters.
    val jdbcUrl = s"jdbc:mysql://${jdbcHostname}:${jdbcPort}"

    // Create a Properties() object to hold the parameters.
    import java.util.Properties
    val connectionProperties = new Properties()

    connectionProperties.put("user", s"${jdbcUsername}")
    connectionProperties.put("password", s"${jdbcPassword}")

    val df = sparkSession.read
      .format("jdbc")
      .option("url", jdbcUrl)
      .option("dbtable", "classicmodels.customer")
      .option("user", jdbcUsername)
      .option("password", jdbcPassword)
      .load()


  }

}
