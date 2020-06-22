package com.atguigu.summer.framework

import java.net.{ServerSocket, Socket}

import scala.util.control.BreakControl

class Application {

    var envData : Any = null

    /**
      * 启动应用
      * 1. 函数柯里化
      * 2. 控制抽象
      */
    def start( t:String = "jdbc" )( op : =>Unit ): Unit = {

        // TODO 1. 初始化环境
        if (t == "socket") {
            envData = new Socket(
                PropertiesUtil.getValue("server.host"),
                PropertiesUtil.getValue("server.port").toInt)
        } else if(t == "socket2"){
            envData = new Socket(
                PropertiesUtil.getValue("server.host"),
                PropertiesUtil.getValue("server.port2").toInt)
        } else if ( t == "serverSocket"){
            envData = new ServerSocket(PropertiesUtil.getValue("server.port").toInt)
        }else if ( t == "serverSocket2"){
            envData = new ServerSocket(PropertiesUtil.getValue("server.port2").toInt)
        }

        // TODO 2. 业务逻辑
        try {
            op
        } catch {
            case ex: Exception => println("业务执行失败 ：" + ex.getMessage)
        }

        // TODO 3. 环境关闭
        if (t == "socket") {
            envData.asInstanceOf[Socket].close()
        } else if ( t == "serverSocket"){
            envData.asInstanceOf[ServerSocket].close()
        }
    }
}
