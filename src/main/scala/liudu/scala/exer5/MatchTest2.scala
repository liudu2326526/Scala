package liudu.scala.exer5

/**
 * @author Dustin liu
 * @create 2020-05-30-10:21
 */
object MatchTest2 {
  def main(args: Array[String]): Unit = {
    val (id,name,age) = (1,"liudu",24)

    println(name)

    val map = Map("liudu"->(1,1),"lisi"->(2,2))

    map.foreach {
      case (_, (_, count)) => {
        println(count)
      }
    }
  }
}
