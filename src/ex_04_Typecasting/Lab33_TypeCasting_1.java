package ex_04_Typecasting;

public class Lab33_TypeCasting_1 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; //  Valid Syntax Implicit Casting - Widening

     int a1 = 300;
    /* 0 0 0 0 0 0 0 0 0 0 1 0 1 0 1 0 1 0 1 0 1*/
        /*1 0 1 0 1 0 1 0 1 - 8 bytes considered*/
     int b1 = (int) a1; //Explicit Casting - Widening
        byte b2 = (byte) a1; //Narrowing - Explicit Casting

        long phno = 9876543l;
        short s = (short) phno; //Narrowing - Explicit Casting
        System.out.println(s);
    }
}
