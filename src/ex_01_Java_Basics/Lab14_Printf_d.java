package ex_01_Java_Basics;

public class Lab14_Printf_d {
    public static void main(String[] args) {
        int a = 25;
        byte b = 30;
        System.out.println(a);
        System.out.print(b);
        System.out.println();
        System.out.printf("Value of a=%d", a);
//        Value of a will be replaced by %d
        System.out.println();
        System.out.printf("Value of b=%d", b);
/*        printf formats the o/p
//        Value of b will be replaced by %d
        *//*%d = int, byte, long, short - data type
            %s = string
            %f = float, double
                %b = boolean*/

    }
}
