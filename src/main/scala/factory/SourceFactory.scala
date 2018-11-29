package factory

import org.apache.log4j.{Level, Logger}
import api.SourceProcessor
import source._
import util.Constants._

object SourceFactory {

  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)


  def sourceTypeProcessor(SourceName: String): SourceProcessor = SourceName match {

    case mysql if (mysql.equalsIgnoreCase(SourceName)) =>
      logger.info("Starting mysql")
      println("Starting mysql")
      new DBMySql
    case "SourceName12" if ("SourceName1".equalsIgnoreCase(SourceName)) =>
      logger.info("Starting SourceName12")
      new SourceName2
    case _ =>
      println(SourceName)
      println("Starting default case")
      new SourceName2

  }
}
