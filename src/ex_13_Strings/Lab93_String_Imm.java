package ex_13_Strings;

public class Lab93_String_Imm {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1 = s1.concat("World"); // concat will combine
        System.out.println(s1); // HelloWorld
    }
}
