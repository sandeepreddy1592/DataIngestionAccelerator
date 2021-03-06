package source

import api.SinkProcessor
import config.PropertiesConfig.prop
import org.apache.log4j.{Level, Logger}
import factory.SourceFactory
import org.apache.spark.sql.DataFrame
import util.SparkActions

class DBHive extends SinkProcessor {

  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)

  override def process(df : DataFrame) {

    val Sink = prop.getProperty("Sink")
    val SinkDBName = prop.getProperty("SinkDBName")
    val SinkTableName = prop.getProperty("SinkTableName")
    val fileFormat = prop.getProperty("FileFormat")

    println(SinkDBName + " " + SinkTableName)
  SparkActions.writeToHive(df : DataFrame, fileFormat: String, SinkDBName : String, SinkTableName : String)

  }

}
