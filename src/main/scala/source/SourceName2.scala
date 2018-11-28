package source

import api.SourceProcessor
import org.apache.log4j.{Level, Logger}
import factory.SourceFactory

case class SourceName2(SourceName: String) extends SourceProcessor {

  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)

  override def process(SourceName: String) {

    val url = "jdbc"


  }

}
