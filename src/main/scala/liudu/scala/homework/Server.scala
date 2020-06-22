package liudu.scala.homework

import java.io.ObjectInputStream
import java.net.ServerSocket

/**
 * @author Dustin liu
 * @create 2020-05-22-17:26
 */
object Server {
  def main(args: Array[String]): Unit = {
    val server = new ServerSocket(9000)

    val socket = server.accept()

    //获取输入流
    val is = socket.getInputStream
    val ois = new ObjectInputStream(is)

    //获取函数
    val func = ois.readObject().asInstanceOf[(Int,Int)=>Int]
    val x = ois.read()
    val y = ois.read()
    val result = func(x,y)

    //获取输出流，输出结果
    val op = socket.getOutputStream
    op.write(result)

    //关闭流
    op.close()
    is.close()
    ois.close()
    socket.close()
    server.close()
  }
}
