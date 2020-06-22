package liudu.scala.exer4

/**
 * @author Dustin liu
 * @create 2020-05-28-16:53
 */
object WordCount3 {
  def main(args: Array[String]): Unit = {
    val list: List[(String, Int)] = List(
      ("hello", 4),
      ("hello spark", 3),
      ("hello spark scala", 2),
      ("hello spark scala hive", 1)
    )

    println(list.flatMap(x=> x._1.split(" ").map((_,x._2)))
      .groupBy(_._1)
      .mapValues(_.map(_._2).sum)
      .toList
      .sortBy(_._2)(Ordering.Int.reverse)
      .take(3)
      .map(s=>s._1+":"+s._2))
  }
}
