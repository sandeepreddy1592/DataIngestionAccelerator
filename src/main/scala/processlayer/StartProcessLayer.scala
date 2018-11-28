package processlayer

import config.PropertiesConfig

object StartProcessLayer extends SparkJob("Data Ingestion"){


  def main(args: Array[String]): Unit = {

    PropertiesConfig.parseArgs(args)

    import sparkSession.implicits._


  }


}
