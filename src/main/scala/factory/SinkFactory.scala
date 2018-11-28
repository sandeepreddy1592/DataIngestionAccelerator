package factory

import api.{SinkProcessor}
import org.apache.log4j.{Level, Logger}
import source._

object SinkFactory {

  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)


  def sinkTypeProcessor(SinkName: String): SinkProcessor = SinkName match {

    case "SinkName1" if ("SinkName1".equalsIgnoreCase(SinkName)) =>
      logger.info("Starting SourceName1")
      new SourceName1(SinkName: String)
    case "SinkName2" if ("SinkName2".equalsIgnoreCase(SinkName)) =>
      logger.info("Starting SourceName12")
      new SourceName2(SinkName: String)

  }
}
