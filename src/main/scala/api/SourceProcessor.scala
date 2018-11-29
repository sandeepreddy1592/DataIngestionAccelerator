package api

import org.apache.spark.sql.DataFrame

trait SourceProcessor {

  def process(jdbcHostname:String,jdbcPort:String, jdbcDatabase:String, jdbcUsername:String, jdbcPassword:String, TableName:String) : DataFrame

}
