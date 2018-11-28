package source

import api.SourceProcessor
import org.apache.log4j.{Level, Logger}
import factory.SourceFactory

case class SourceName1(SourceName: String) extends SourceProcessor {

  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)

  override def process(SourceName: String): Unit {

    val url = "jdbc"


  }

}
