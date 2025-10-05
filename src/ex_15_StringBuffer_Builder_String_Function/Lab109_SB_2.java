package ex_15_StringBuffer_Builder_String_Function;

public class Lab109_SB_2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        sb1.append(" Programming");
        sb1.replace(0,4,"C++");
        System.out.println(sb1); // C++ Programming
    }
}
