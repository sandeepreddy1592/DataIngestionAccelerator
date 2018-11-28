package processlayer

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

*/
abstract class SparkJob(appName:String) {

  val sparkConf = new SparkConf()

  lazy implicit val sparkSession = SparkSession.builder
    .config(sparkConf)
    .getOrCreate()

}