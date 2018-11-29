package config

import java.io.File

import org.apache.log4j.Logger

object PropertiesConfig {

  val logger = Logger.getLogger(getClass.getName)

  def parseArgs(args: Array[String]) = {

    if(args.size == 0) {
      defaultSettiing
    } else {
      loadConfig()
    }

  }

  def loadConfig() = {

  }

  def defaultSettiing() = {

  }


}
