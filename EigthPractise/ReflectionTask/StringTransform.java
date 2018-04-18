package EigthPractise.ReflectionTask;

import java.lang.reflect.Field;

public class StringTransform {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s2 = "Hello"; // It may be anywhere and must not be edited
        System.out.println(s2);
        Field f = String.class.getDeclaredField("value");
        f.setAccessible(true);
        f.set(s2, "olleH".toCharArray());
        System.out.println(s2);
    }
}
