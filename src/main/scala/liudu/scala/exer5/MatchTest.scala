package liudu.scala.exer5

/**
 * @author Dustin liu
 * @create 2020-05-30-10:21
 */
object MatchTest {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1)

    list match {
      case first :: second :: rest => println(first + "-" + second + "-" + rest)
      case _ => println("something else")
    }

  }
}
