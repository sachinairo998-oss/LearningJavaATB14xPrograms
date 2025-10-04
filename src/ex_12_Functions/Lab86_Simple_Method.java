package ex_12_Functions;

public class Lab86_Simple_Method {
    public static void main(String[] args) {
        // Calling
        no_return_function();
        return_function();
    }
    // Declare / Definition
    static void no_return_function () {
        System.out.println("Hi No Return Function");
    }
    // Return type which returns int, string, char, boolean, float data types
    static String return_function () {
        System.out.println("Hi Return Function");
        return "Sachin";
    }
    static boolean return_boolean () {
        return true;
    }
    static float return_float () {
        return 3.14f;
    }
    static byte return_byte () {
        return 100;
    }
    static long return_long () {
        return 9876l;
    }
}
