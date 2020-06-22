package liudu.scala.exer5

/**
 * @author Dustin liu
 * @create 2020-05-30-15:47
 */
object TransformTest3 {
  def main(args: Array[String]): Unit = {

    val ints = List(1, 3, 5, 2, 6)

    implicit val ord: Ordering[Int] = Ordering.Int.reverse

    println(ints.sortBy(x=>x))
  }


}
