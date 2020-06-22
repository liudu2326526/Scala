package liudu.scala.exer5

/**
 * @author Dustin liu
 * @create 2020-05-31-10:53
 */
object MatchTest3 {
  def main(args: Array[String]): Unit = {
    def describe(x: Any) = x match {
      case i: Int => "Int"
      case s: String => "String hello"
      case m: List[Int] => "List"
      case c: Array[Int] => "Array[Int]"
      case someThing => "something else " + someThing
    }

    println(describe(Array("1", "2")))
  }
}
