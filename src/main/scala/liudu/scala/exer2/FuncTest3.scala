package liudu.scala.exer2

/**
 * @author Dustin liu
 * @create 2020-05-22-10:14
 */
object FuncTest3 {
  def main(args: Array[String]): Unit = {
    //    def test(f:Int=>Any)={
    //      f(1)
    //    }
    //
    //    println(test("Hello"))
    def test1 = {
      "zhangsan"
    }

    val a:()=>String = test1 _

    println(1.to(5))

//    print(a())
  }


}
