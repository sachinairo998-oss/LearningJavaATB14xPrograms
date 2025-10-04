package ex_13_Strings;

public class Lab94_String_Func {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c); // A

        String s1 = "ABCD";
        System.out.println(s1); // ABCD
        System.out.println(s1.length()); // 4
        System.out.println(s1.toLowerCase()); // abcd
        System.out.println(s1.toUpperCase()); // ABCD
        System.out.println(s1.concat("E")); // ABCDE
    }
}
