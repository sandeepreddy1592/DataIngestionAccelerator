package api

import org.apache.spark.sql.DataFrame

trait SourceProcessor {

  def process(Source : String) : DataFrame

}
