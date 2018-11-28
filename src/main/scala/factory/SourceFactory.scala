package factory

import org.apache.log4j.{Level, Logger}
import api.SourceProcessor
import source._

object SourceFactory {

  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)


  def sourceTypeProcessor(SourceName: String): SourceProcessor = SourceName match {

    case "SourceName1" if ("SourceName".equalsIgnoreCase(SourceName)) =>
      logger.info("Starting SourceName1")
      new SourceName1(SourceName: String)
    case "SourceName12" if ("SourceName1".equalsIgnoreCase(SourceName)) =>
      logger.info("Starting SourceName12")
      new SourceName2(SourceName: String)

  }
}
