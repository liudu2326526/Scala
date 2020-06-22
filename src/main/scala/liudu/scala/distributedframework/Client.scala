package liudu.scala.distributedframework

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.Socket

object Client extends Application{

        def main(args: Array[String]): Unit = {

        var result1:Int = 0
        var result2:Int = 0

        start("socket") {
            val client: Socket = envData.asInstanceOf[Socket]

            val outObject = new ObjectOutputStream(client.getOutputStream)
            // Out -> function -> 对象
            // 函数对象
            // Scala中的类默认都是已经序列化
            val task = new Task()
            task.data1 = 55
            task.data2 = 77
            task.logic = _ + _
            //task.logic = _ * 2
            outObject.writeObject(task)
            outObject.flush()
            // 关闭socket的输出流，但是输入流可用
            client.shutdownOutput()

            // In
            val inObject = new ObjectInputStream(client.getInputStream)
            result1 = inObject.readObject().asInstanceOf[Int]
            println("client1 获取计算结果 ：" + result1)
            //client.shutdownInput()
            inObject.close()

        }

        start("socket2") {
            val client: Socket = envData.asInstanceOf[Socket]

            val outObject = new ObjectOutputStream(client.getOutputStream)
            // Out -> function -> 对象
            // 函数对象
            // Scala中的类默认都是已经序列化
            val task = new Task()
            task.data1 = 77
            task.data2 = 88
            task.logic = _ + _
            //task.logic = _ * 2
            outObject.writeObject(task)
            outObject.flush()
            // 关闭socket的输出流，但是输入流可用
            client.shutdownOutput()

            // In
            val inObject = new ObjectInputStream(client.getInputStream)
            result2 = inObject.readObject().asInstanceOf[Int]
            println("client2 获取计算结果 ：" + result2)
            //client.shutdownInput()
            inObject.close()
        }

        println("总计算结果为" +(result1+result2))

    }

}
