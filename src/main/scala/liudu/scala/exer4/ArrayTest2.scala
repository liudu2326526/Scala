package liudu.scala.exer4

import scala.collection.mutable

/**
 * @author Dustin liu
 * @create 2020-05-28-11:16
 */
object ArrayTest2 {
  def main(args: Array[String]): Unit = {
//    val list: List[Int] = List(1, 2, 3, 4, 5, 6)
//    val list2: List[Int] = List(1, 2, 3, 4, 5, 6)

    val map1 = mutable.Map("a"-> 2,"f" -> 2,"c"->5)
    val map2 = mutable.Map("a"-> 2,"d" -> 2,"c"->5)

//    list.fold(list2)(_+_)
    println(map1.foldLeft(map2)(
      (map, kv) => {
        map.update(kv._1, map.getOrElse(kv._1, 0) + kv._2)
        map
      }
    ))

//    println(list.reverse.reduce(_ - _))
  }
}
