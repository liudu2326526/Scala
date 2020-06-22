package liudu.scala.exer2

/**
 * @author Dustin liu
 * @create 2020-05-21-15:17
 */
object FuncTest {
  def main(args: Array[String]): Unit = {
    def test1(A: Int) = A * 2

    def test2(A: Int) = {
      if (A == 1)
        1
      else
        "我不是1"
    }

    def test31(A: Int, B: Int, C: (Int, Int) => Int) = C(A, B)

    def test32(C: (Int, Int) => Any) = C(10, 20)

    def test4(str: String) = {
      val strings = str.split(" ")
      val StrOut = new StringBuilder
      val iterator = strings.iterator
      while (iterator.hasNext) {
        val str1 = iterator.next()
        if (str1.startsWith("s")) {
          StrOut.append(str1)
          if (iterator.hasNext)
            StrOut.append(", ")
        }
      }
      StrOut.toString
    }

    def filter(str:String,f:String=>String)={
      f(str)
    }

    val f1 = test4 _

    //    def test5(str: String) ={
    //      val strings = str.split(" ")
    //      val StrOut = new StringBuilder
    //      strings.foreach((word)=>{
    //        if (word.charAt(0).equals('s')){
    //          StrOut.append(word)
    //          StrOut.append(", ")
    //        }
    //      })
    //      StrOut.toString
    //    }

    println(test4("hello world scala spark"))

  }
}
