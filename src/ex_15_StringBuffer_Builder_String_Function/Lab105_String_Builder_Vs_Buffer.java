package ex_15_StringBuffer_Builder_String_Function;

public class Lab105_String_Builder_Vs_Buffer {

    public static void main(String[] args) {
        // 90% Usage
        String s0 = "Sachin";
        String s1 = new String("Sachin");

        // 10% Usage
        StringBuffer stringBuffer = new StringBuffer("Sachin");
        StringBuilder stringBuilder = new StringBuilder("Sachin");

        System.out.println(stringBuffer); // Sachin
        System.out.println(stringBuilder); // Sachin
        System.out.println(stringBuffer.reverse()); // nihcaS
        System.out.println(stringBuilder.reverse()); // nihcaS
    }
}
