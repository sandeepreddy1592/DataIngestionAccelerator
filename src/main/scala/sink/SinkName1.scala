package source

import api.SinkProcessor
import org.apache.log4j.{Level, Logger}
import factory.SourceFactory

case class SinkName1(SinkName: String) extends SinkProcessor {

  val logger = Logger.getLogger(getClass.getName)
  Logger.getLogger("org").setLevel(Level.WARN)

  override def process(SinkName: String): Unit {

    val url = "jdbc"


  }

}
