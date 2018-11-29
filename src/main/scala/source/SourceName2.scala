package source

import api.SourceProcessor
import org.apache.log4j.{Level, Logger}
import factory.SourceFactory
import org.apache.spark.sql.DataFrame
import processlayer.StartProcessLayer.sparkSession

class SourceName2 extends SourceProcessor {

  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)

  override def process(jdbcHostname:String,jdbcPort:String, jdbcDatabase:String, jdbcUsername:String, jdbcPassword:String, TableName:String): DataFrame = {

    val url = "jdbc"

    val df : DataFrame =null
/*
    val df : DataFrame = sparkSession.read
      .format("jdbc")
      .option("url", "")
      .option("dbtable", "classicmodels.customers")
      .option("user", jdbcUsername)
      .option("password", jdbcPassword)
      .load()
*/

    df
  }

}
