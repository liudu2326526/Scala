package liudu.scala.exer3

import liudu.scala.exer2.FuncTest6

import scala.beans.BeanProperty

/**
 * @author Dustin liu
 * @create 2020-05-25-9:15
 */
object FieldTest1 {
  def main(args: Array[String]): Unit = {

    val a = FuncTest6

    println(a.gender)

    val user = new User

    user.name = "zhangsan"

    user.name_$eq("wangwu")

  }

  class User{
    val age = 18
    var name = "lisi"
    private val sex = "man"

  }

}


