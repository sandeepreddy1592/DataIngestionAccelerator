package source

import api.SourceProcessor
import org.apache.log4j.{Level, Logger}
import factory.SourceFactory
import java.sql.DriverManager

import org.apache.spark.sql.DataFrame
import processlayer.StartProcessLayer._
import java.util.Properties

import util.SparkActions

class DBMySql extends SourceProcessor {

  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)

  override def process(jdbcHostname:String,jdbcPort:String, jdbcDatabase:String, jdbcUsername:String, jdbcPassword:String, TableName:String): DataFrame = {

    import sparkSession.implicits._

    println("inside DBmysql")
    val jdbcUrl = s"jdbc:mysql://${jdbcHostname}:${jdbcPort}"
    //val jdbcUrl = "jdbc:mysql://" + jdbcHostname + ":" + jdbcPort
    //val jdbcUrl = s"jdbc:mysql://localhost:3306"

    println(jdbcUrl)
    logger.info(jdbcUrl)

    val source_df = SparkActions.readJDBC(jdbcUrl : String, jdbcDatabase:String, jdbcUsername:String, jdbcPassword:String, TableName:String)

    source_df
  }
}
