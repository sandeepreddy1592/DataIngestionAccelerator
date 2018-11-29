package util

import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.DataFrame
import processlayer.StartProcessLayer.sparkSession
import java.sql.DriverManager

object SparkActions {


  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)

  def readJDBC(jdbcUrl : String, jdbcDatabase:String, jdbcUsername:String, jdbcPassword:String, TableName:String): DataFrame = {

    println(jdbcUrl + jdbcDatabase + TableName + jdbcUsername + jdbcPassword)
    logger.info(jdbcUrl + jdbcDatabase + TableName)

    val df : DataFrame = sparkSession.read
      .format("jdbc")
      //.option("driver","com.mysql.jdbc.Driver")
      .option("url", jdbcUrl)
      .option("dbtable", jdbcDatabase + "." +TableName)
      .option("user", jdbcUsername)
      .option("password", jdbcPassword)
      .load()

    df
  }

  def writeToHive(df : DataFrame, fileFormat: String, DBName : String, TableName : String) = {
   df.write.mode("overwrite").format(fileFormat).saveAsTable(DBName + "." + TableName)
  }
}
