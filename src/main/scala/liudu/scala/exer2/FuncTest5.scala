package liudu.scala.exer2

/**
 * @author Dustin liu
 * @create 2020-05-22-14:41
 */
object FuncTest5 {
  def main(args: Array[String]): Unit = {
    def test1(i:Int):Int={
      if (i<1){
        1
      } else {
        test1(i-1) +i
      }
    }

    println(test1(100))
  }
}
