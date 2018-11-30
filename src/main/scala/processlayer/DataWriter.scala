package processlayer


import api.{SinkProcessor, SourceProcessor}
import org.apache.log4j.Logger
import config.PropertiesConfig
import config.PropertiesConfig.prop
import factory.{SinkFactory, SourceFactory}
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.{IntegerType, TimestampType}

object DataWriter {

  val logger = Logger.getLogger(getClass.getName)

  val Sink = prop.getProperty("Sink")

  def RouteTargetDB(Sink : String, source_df: DataFrame) = {

    val sinkprocessor: SinkProcessor = SinkFactory.sinkTypeProcessor(Sink)

    sinkprocessor.process(source_df : DataFrame)

  }

}
