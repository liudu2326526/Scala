package liudu.scala.exer4

import scala.collection.mutable.ListBuffer

/**
 * @author Dustin liu
 * @create 2020-05-27-20:26
 */
object WordCount {
  def main(args: Array[String]): Unit = {
    val list: List[(String, Int)] = List(
      ("hello", 4),
      ("hello spark", 3),
      ("hello spark scala", 2),
      ("hello spark scala hive", 1)
    )

    //将每一个元素拆成（单词，数量）的键值对
    def func1(str: String, num: Int) = {
      val strings: Array[String] = str.split(" ")
      val lists: ListBuffer[(String, Int)] = ListBuffer.empty[(String, Int)]
      strings.foreach(word => lists.append((word, num)))
      lists
    }

    //    println(func1("hello spark", 3))

    //List((hello,4), (hello,3), (spark,3), (hello,2),
    // (spark,2), (scala,2), (hello,1), (spark,1), (scala,1), (hive,1))
    val list1: List[(String, Int)] = list.flatMap(data => func1(data._1, data._2))

    //合并
    //Map(spark -> List((spark,3), (spark,2), (spark,1)), scala -> List((scala,2), (scala,1)),
    // hive -> List((hive,1)), hello -> List((hello,4), (hello,3), (hello,2), (hello,1)))
    val list2: Map[String, List[(String, Int)]] = list1.groupBy(data => data._1)

    def func2(key : String, data : List[(String, Int)]) = {
      var sum = 0
      data.foreach(kv=>sum = sum + kv._2)
      (key,sum)
    }

    println(list2.map(kv => func2(kv._1, kv._2)).toList.sortBy(kv=>kv._2)(Ordering.Int.reverse).take(3))
  }
}
