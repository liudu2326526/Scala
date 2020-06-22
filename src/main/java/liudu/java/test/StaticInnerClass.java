package liudu.java.test;

/**
 * @author Dustin liu
 * @create 2020-05-31-11:25
 */
public class StaticInnerClass {

    public static void main(String[] args) {
        User liudu1 = new User("liudu", 18);
        User liudu2 = new User("liudu", 18);
        System.out.println(liudu1==liudu2);
    }

    public static class User {
        private final String name;
        private final int age;

        public String name() {
            return this.name;
        }

        public int age() {
            return this.age;
        }

        public User(final String name, final int age) {
            this.name = name;
            this.age = age;
        }
    }
}
