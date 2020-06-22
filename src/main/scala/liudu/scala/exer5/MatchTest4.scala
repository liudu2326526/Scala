package liudu.scala.exer5

/**
 * @author Dustin liu
 * @create 2020-05-31-10:53
 */
object MatchTest4 {
  def main(args: Array[String]): Unit = {
    val People(name,age)= new People("liudu",20)
  }

  class People(var name:String,age:Int){

  }
  
  object People{
    def unapply(people: People): Option[(Any, Any)] = ???

  }
}
