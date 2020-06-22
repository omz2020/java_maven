import org.junit.Test;

public class Hello {

    public static String hello() {
        return "hello";
    }

    public static String helloAge(int age) {
        if (age <= 0) {
            throw new IllegalAccessException();

            return String.format("hello, %d!", age);
        }
    }
}