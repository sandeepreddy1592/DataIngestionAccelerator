package processlayer

import config.PropertiesConfig
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession


object StartProcessLayer {

  val sparkConf = new SparkConf()

  lazy implicit val sparkSession = SparkSession.builder
    .config(sparkConf).enableHiveSupport()
    .getOrCreate()

  def main(args: Array[String]): Unit = {

    println("Execution Started")

    val Source = PropertiesConfig.parseArgs("Source")
    println(Source)

    val Source_df = DataReader.RouteSourceDB(Source)

    val Sink = PropertiesConfig.parseArgs("Sink")
    println(Sink)

    DataWriter.RouteTargetDB(Sink, Source_df)

  }


}