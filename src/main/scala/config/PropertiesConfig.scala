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

  def parseArgs(Type: String) = {

    input = new FileInputStream(path)
    prop.load(input);

    //TO DO : Properties Validation

    val Type = prop.getProperty(Type)

    if(Type.size == 0) {
      defaultSettiing
    }
    Type
  }

  def loadConfig() = {

  }

  def defaultSettiing() = {

  }


}
