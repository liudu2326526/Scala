package com.atguigu.summer.framework

import java.util.ResourceBundle

/**
 * @author Dustin liu
 * @create 2020-05-23-21:48
 */
object PropertiesUtil {

  val summer : ResourceBundle = ResourceBundle.getBundle("summer")

  def getValue(key:String): String ={
    summer.getString(key)
  }
}
