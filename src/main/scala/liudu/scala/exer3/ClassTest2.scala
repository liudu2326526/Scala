package liudu.scala.exer3

/**
 * @author Dustin liu
 * @create 2020-05-26-9:38
 */
object ClassTest2 {
  def main(args: Array[String]): Unit = {
    val single1 = MySingle()
    val single2 = MySingle()

    println(single1 eq single2)
    println(single1)

  }
}

class MySingle private {

}

object MySingle{

  var mySingle : MySingle = _

  def apply(): MySingle = {
    if (mySingle == null) {
      mySingle = new MySingle
    }
    mySingle
  }
}


