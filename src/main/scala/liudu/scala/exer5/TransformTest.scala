package liudu.scala.exer5

/**
 * @author Dustin liu
 * @create 2020-05-30-15:47
 */
object TransformTest {
  def main(args: Array[String]): Unit = {
    implicit def transform(d:Double)={
      d.toInt*2
    }

    val i:Int = 2.0

    println(i)
  }
}
