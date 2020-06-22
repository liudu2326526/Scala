package com.atguigu.summer.framework

/**
 * @author Dustin liu
 * @create 2020-05-23-21:28
 */
class Task extends Serializable {
  var data1 : Int = 0
  var data2 : Int = 0
  var logic : (Int,Int) => Int = null

  def compute() ={
    logic(data1,data2)
  }
}
