package ex_15_StringBuffer_Builder_String_Function;

public class Lab107_String_Builder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Sachin");
        stringBuilder.append(123); // int add is also possible
        System.out.println(stringBuilder); // Sachin123
    }
}
