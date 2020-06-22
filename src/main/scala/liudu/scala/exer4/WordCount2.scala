package liudu.scala.exer4

/**
 * @author Dustin liu
 * @create 2020-05-27-21:18
 */
object WordCount2 {
  def main(args: Array[String]): Unit = {
    val list: List[(String, Int)] = List(
      ("hello", 4),
      ("hello spark", 3),
      ("hello spark scala", 2),
      ("hello spark scala hive", 1)
    )

    val str : StringBuilder = StringBuilder.newBuilder

    //全部拼接成一个字符串，消耗内存较大，不推荐
    list.foreach(data=>{
      str.append((data._1 + " ")*data._2)
    })
    // 处理字符串
    val strings: Array[String] = str.toString.split(" ")

    println(strings.toList.groupBy(str=>str).
      map(kv=>(kv._1,kv._2.length)).toList.sortBy(kv=>kv._2)(Ordering.Int.reverse).take(3))
  }
}
