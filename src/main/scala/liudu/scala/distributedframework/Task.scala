package liudu.scala.distributedframework

import scala.io.Source

/**
 * @author Dustin liu
 * @create 2020-05-23-21:28
 */
class Task extends Serializable {
  var data1 : Int = 0
  var data2 : Int = 0
  var logic : (Int,Int) => Int = null

  //点击量数据的位置
  var clickData : String = null

  var map:String=>Array[String] = null

  var reduce:Array[String]=>Map[String,Int] = null

  def compute() ={
    logic(data1,data2)
  }

}
