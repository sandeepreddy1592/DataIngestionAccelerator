package processlayer

import config.PropertiesConfig
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object StartProcessLayer {

  val sparkConf = new SparkConf()

  lazy implicit val sparkSession = SparkSession.builder
    .config(sparkConf)
    .getOrCreate()

  def main(args: Array[String]): Unit = {

    PropertiesConfig.parseArgs(args)


  }


}
