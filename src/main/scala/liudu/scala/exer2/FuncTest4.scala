package liudu.scala.exer2

/**
 * @author Dustin liu
 * @create 2020-05-22-11:38
 */
object FuncTest4 {
  def main(args: Array[String]): Unit = {
    def test()={
      def sum(j:Int)={
        j
      }

      sum _
    }

    println(test()(20))
  }
}
