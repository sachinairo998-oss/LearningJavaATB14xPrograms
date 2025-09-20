package ex_03_Operators;

public class Lab27_All_Operators {
    public static void main(String[] args) {
        int a = 10, b = 30;
        System.out.println(a+b); //Int
//        Boolean T / F
        //        Arithmetic Operators = +,-,*,/,%
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
//      Compound Operators
        int age = 20;
        age += 30; // age = age + 30
        age -= 30; // age = age - 30
        age *= 30; // age = age * 30
        age /= 30; // age = age / 30
        System.out.println(age);
/*        Other Bitwise Operators
                ~ - Bitwise Not
            >> - Right shift
            << - Left shift
            ^ - XOR*/
    }
}
