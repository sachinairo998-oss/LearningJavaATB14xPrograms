package ex_26_Wrapper_Class;

import javax.lang.model.type.PrimitiveType;

public class Lab185_Boxing_Unboxing {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;
        // Boxing > Primitive to Wrapper JVM AutoBoxing > JVM will do it
        System.out.println(b.intValue());
        System.out.println(a);

       // Unboxing > Wrapper to PrimitiveType Conversion > JVM will not auto do it
        Integer aa = 43;
        int a1 = aa; // Unboxing
        System.out.println(a1);
    }
}
