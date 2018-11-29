package source

import api.SinkProcessor
import org.apache.log4j.{Level, Logger}
import factory.SourceFactory
import org.apache.spark.sql.DataFrame
import util.SparkActions

class DBHive extends SinkProcessor {

  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)

  override def process(df : DataFrame, fileFormat: String, DBName : String, TableName : String) {

    println(DBName + " " + TableName)
  SparkActions.writeToHive(df : DataFrame, fileFormat: String, DBName : String, TableName : String)

  }

}
