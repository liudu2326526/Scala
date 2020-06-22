package liudu.scala.exer3

/**
 * @author Dustin liu
 * @create 2020-05-26-10:23
 */
object AbstractTest {
  def main(args: Array[String]): Unit = {
    val chlid = new AbstractChlid1
    println(chlid.name)
    println(chlid.age)
  }

}

abstract class Abstract1 {
  var name : String
  val age : Int = 20
}

class AbstractChlid1 extends Abstract1 {

  var name : String = "抽象"

//  override val age : Int = 10
}
