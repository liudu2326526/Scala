package liudu.scala.exer3

/**
 * @author Dustin liu
 * @create 2020-05-25-21:26
 */
class Dog {
  val id = 1
  private var name = "zhangsan"
  def printNam() : Unit = {
    // 在Dog类中可以方法Dog对象的私有属性
    println(Dog.CONSTANT + "\t" + name)
  }
}

/**
 * 伴生对象
 */
object  Dog {
  // 伴生对象中的私有属性
  private  val  CONSTANT = "Hello"
  def main(args: Array[String]): Unit = {
    val d = new Dog
    // 访问Dog类的私有字段
    d.name = "lisi"
    d.printNam()
  }
}

