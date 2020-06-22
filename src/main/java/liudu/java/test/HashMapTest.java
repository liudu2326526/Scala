package liudu.java.test;

import java.util.HashMap;

/**
 * @author Dustin liu
 * @create 2020-05-19-15:08
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<User,User> test1 = new HashMap<User,User>();

        for (int i = 0; i < 20; i++) {
            test1.put(new User(),new User());
            System.out.println(i);
        }
    }
}

class User{
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
