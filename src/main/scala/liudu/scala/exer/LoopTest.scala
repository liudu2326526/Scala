package liudu.scala.exer

/**
 * @author Dustin liu
 * @create 2020-05-20-9:06
 */
object LoopTest {
  def main(args: Array[String]): Unit = {
    //    for ( i <- Range(1,5) if i != 3  ) {
    //      println("i = " + i )
    //    }

    var result = for (i <- Range(0, 10)) yield {
      i
    }

    println(result)
  }
}
