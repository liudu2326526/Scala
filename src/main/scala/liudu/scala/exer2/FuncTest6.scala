package liudu.scala.exer2

/**
 * @author Dustin liu
 * @create 2020-05-22-16:38
 */
object FuncTest6 {

  val gender = "man"

  def main(args: Array[String]): Unit = {
    def test1(i:Int,result:Int):Int={
      if (i<1){
        result
      } else {
        test1(i-1,i+result)
      }
    }

    println(test1(1000000,9))
  }
}
