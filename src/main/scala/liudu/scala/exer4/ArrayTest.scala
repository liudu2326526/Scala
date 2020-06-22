package liudu.scala.exer4

import scala.collection.mutable

/**
 * @author Dustin liu
 * @create 2020-05-26-16:44
 */
object ArrayTest {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4,9,8)

    // 集合映射
    //    println("map => " + list.map(x=>{x*2}))
    //    println("map => " + list.map(x=>x*2))
    //    println("map => " + list.map(_*2))
    // 集合扁平化
    val list1 = List(
      List(1, 2),
      List(3, 4),
      List(1)
    )
//    println("flatten =>" + list1.flatten)
    // 集合扁平映射
//    println("flatMap =>" + list1.flatMap(_.map(_ * 2)))
    // 集合过滤数据
//        println("filter =>" + list.filter(_%2 == 0))
        // 集合分组数据
//        println("groupBy =>" + list.groupBy(_%2))

    //    // 集合排序
        println("sortBy =>" + list.sortBy(num=>num)(Ordering.Int.reverse))
    //    println("sortWith =>" + list.sortWith((left, right) => {left < right}))

  }
}
