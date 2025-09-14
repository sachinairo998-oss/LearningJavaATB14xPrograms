package ex_03_Operators;

public class Lab21_Operators {
    public static void main(String[] args) {
        int age = 50;
//        int - data type ; age = Identifier ; Lieral = 50 ; Assignment operator > = RHS to LHS assignment
        int a = 35;
        int b = 25;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*b);
//        Arithmetic Operators % Modulus > Remainder

        int b2 = 10;
        int b1 = -20;
        int result = b2+b1;
//Single operand b or b1 > Variable name
        int c = -1;
        c = c+1;
        System.out.println(c);
//        Unary Operator

        int d = 30;
        int d1 = 40;
        boolean b3 = d < d1;
        System.out.println(b3);
//        Relational Operator <,>,<=,>=,== (equal to but checking),!= (not equal to)
        int age1 = 60;
        int age2 = 65;
        boolean age_result = age2 < age1;
        System.out.println(age_result);


        boolean yes = true;
        System.out.println(!yes);
//not
        boolean wrong = false;
        System.out.println(!!wrong);
//not of not
        boolean or = true || false;
        System.out.println(or);
//or
        boolean and = true && false;
        System.out.println(and);
//        and
//Logical Operators

    }
}
