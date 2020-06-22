package liudu.scala.exer5

/**
 * @author Dustin liu
 * @create 2020-05-30-15:47
 */
object TransformTest2 {
  def main(args: Array[String]): Unit = {
    implicit def transform(u:User)={
      new Parent
    }
    implicit def transform1(u:User,i:Int)={
      new Parent
    }

    val user = new User

    user.updataUser()
    user.insertUser()
  }

  class Parent{
    def updataUser()={
      println("更新")
    }
  }

  class User{
    def insertUser(): Unit ={
      println("上传")
    }
  }
}
