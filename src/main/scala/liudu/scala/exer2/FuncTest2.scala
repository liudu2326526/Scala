package liudu.scala.exer2

/**
 * @author Dustin liu
 * @create 2020-05-21-16:47
 */
object FuncTest2 {
  def main(args: Array[String]): Unit = {
    def test1(i:Int) = i*2

    def test2 = test1 _

    def test3(func : Int => Int)= {
      func(2)
    }

//    println(test3(_ * 22))

    def test4(){
      return 1
    }

    println(test4)
  }
}
