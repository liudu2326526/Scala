package liudu.scala.exer3

/**
 * @author Dustin liu
 * @create 2020-05-24-21:31
 */
object MyTest{
  def main(args: Array[String]): Unit = {
    val child = new Child("123")
  }
}

class ClassTest(name : String ) {
  val a = "123"
  var b = "456"

}

class Child(name : String) extends  ClassTest(name) {
  print(name)
}
