package config

import java.io.File
import org.apache.log4j.Logger
import java.util.Properties
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream
import util.Constants._

object PropertiesConfig {

  val logger = Logger.getLogger(getClass.getName)

  val prop : Properties = new Properties();
  var input: InputStream  = null;

  def parseArgs(argVal: String) = {

    input = new FileInputStream(path)
    prop.load(input);

    //TO DO : Properties Validation

    val ExecutionType = prop.getProperty(argVal)

    if(ExecutionType.size == 0) {
      defaultSettiing
    }
    ExecutionType
  }

  def loadConfig() = {

  }

  def defaultSettiing() = {

  }


}
