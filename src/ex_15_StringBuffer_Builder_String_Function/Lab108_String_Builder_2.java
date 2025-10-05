package ex_15_StringBuffer_Builder_String_Function;

public class Lab108_String_Builder_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Hello World
        sb.reverse();
        System.out.println(sb); // dlroW olleH

        sb.replace(0,3,"C++");
        System.out.println(sb); // C++oW olleH
    }
}
