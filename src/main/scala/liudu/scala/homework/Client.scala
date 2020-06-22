package liudu.scala.homework

import java.io.{FileOutputStream, ObjectOutputStream}
import java.net.Socket

/**
 * @author Dustin liu
 * @create 2020-05-22-17:28
 */
object Client {
  def main(args: Array[String]): Unit = {

    def sum (x:Int,y:Int)= x + y

    val client = new Socket("localhost",9000)

    //获取输出流
    val os = client.getOutputStream
    val oos = new ObjectOutputStream(os)

    //输出函数
    oos.writeObject(sum _)
    oos.write(5)
    oos.write(6)
    oos.flush()

    //获取输入流,得到结果并打印
    val is = client.getInputStream
    val result = is.read()
    print(result)

    //关闭流资源
    oos.close()
    os.close()
    is.close()
    client.close()
  }
}
