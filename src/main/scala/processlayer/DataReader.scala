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

    println("Datareader " + Source)

    val sourceprocessor: SourceProcessor = SourceFactory.sourceTypeProcessor(Source)

    val source_df: DataFrame = sourceprocessor.process(Source)

    source_df
  }
}
