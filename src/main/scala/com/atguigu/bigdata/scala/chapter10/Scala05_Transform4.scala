package com.atguigu.bigdata.scala.chapter10

object Scala05_Transform4 {

    def main(args: Array[String]): Unit = {

//        implicit def transform( user : User ): UserExt = {
//            new UserExt()
//        }

        val liudu = "123"


        val user = new User()
        liudu.updateUser()
        user.insertUser()

    }
    // TODO 隐式类
    // scala 2.10版本中增加此功能
    // 构造参数必须存在且只有一个参数，用于转换类型 ：
    // 参数类型（User） => 当前类型(UserExt)
    implicit class UserExt(user : String) {
        def updateUser(): Unit = {
            println("update user...")
        }
    }
    class User {
        def insertUser(): Unit = {
            println("insert user...")
        }
    }
}
