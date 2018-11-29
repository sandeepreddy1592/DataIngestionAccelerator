package source

import api.SinkProcessor
import org.apache.log4j.{Level, Logger}
import factory.SourceFactory
import org.apache.spark.sql.DataFrame
import util.SparkActions

class SinkName2 extends SinkProcessor {

  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)

  override def process(source_df : DataFrame, fileFormat: String, SinkDBName : String, TableName : String) {

    val url = "jdbc"

    SparkActions.writeToHive(source_df : DataFrame, fileFormat: String, SinkDBName : String, TableName : String)

  }

}
