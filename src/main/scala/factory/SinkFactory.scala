package factory

import api.{SinkProcessor}
import org.apache.log4j.{Level, Logger}
import source._
import util.Constants._

object SinkFactory {

  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)


  def sinkTypeProcessor(SinkName: String): SinkProcessor = SinkName match {

    case hive if (hive.equalsIgnoreCase(SinkName)) =>
      println("Starting DBHive")
      new DBHive
    case "SinkName2" if ("SinkName2".equalsIgnoreCase(SinkName)) =>
      logger.info("Starting SourceName12")
      new SinkName2

  }
}
