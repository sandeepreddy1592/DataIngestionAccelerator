package api

import org.apache.spark.sql.DataFrame

trait SinkProcessor {

  def process(df : DataFrame, fileFormat: String, DBName : String, TableName : String)

}
