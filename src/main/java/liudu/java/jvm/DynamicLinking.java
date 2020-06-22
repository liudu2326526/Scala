package liudu.java.jvm;

/**
 * @author Dustin liu
 * @create 2020-06-02-7:57
 */
public class DynamicLinking {
    public static void main(String[] args) {
        Parent child = new Child();

        System.out.println(child);
    }
}

class Child extends  Parent{

}

class Parent {

}
