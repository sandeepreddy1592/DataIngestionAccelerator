package processlayer


import org.apache.log4j.Logger
import config.PropertiesConfig
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.{IntegerType, TimestampType}
import java.util.Properties
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream

import PropertiesConfig.prop
import api.SourceProcessor
import factory.SourceFactory
import org.apache.spark.sql.DataFrame

object DataReader {

  val logger = Logger.getLogger(getClass.getName)

  def RouteSourceDB(Source: String) = {

    val Source = prop.getProperty("Source")

    val jdbcHostname = prop.getProperty("HostName")
    val jdbcPort = prop.getProperty("PortNum")
    val jdbcDatabase = prop.getProperty("Database")
    val jdbcUsername = prop.getProperty("UserName")
    val jdbcPassword = prop.getProperty("Password")
    val TableName = prop.getProperty("TableName")

    println("Datareader " + Source)

    val sourceprocessor: SourceProcessor = SourceFactory.sourceTypeProcessor(Source)

    val source_df: DataFrame = sourceprocessor.process(jdbcHostname,jdbcPort, jdbcDatabase, jdbcUsername, jdbcPassword, TableName)

    source_df
  }
}
