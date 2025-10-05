package ex_15_StringBuffer_Builder_String_Function;

public class Lab106_String_Buffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Sachin");
        stringBuffer.append("MS"); // Mutable means content change possible
        // append Add
        System.out.println(stringBuffer); // SachinMS

        String s1 = "SAchin";
        s1 = s1 + "SAchinMS"; // no string replacement
        System.out.println(s1); // SAchinSAchinMS

    }
}
