package processlayer


import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkConf

abstract class SparkJob(appName:String) {

  val sparkConf = new SparkConf()

  lazy implicit val sparkSession = SparkSession.builder
    .config(sparkConf)
    .getOrCreate()

}