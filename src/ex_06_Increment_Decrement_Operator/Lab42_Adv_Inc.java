package ex_06_Increment_Decrement_Operator;

public class Lab42_Adv_Inc {
    public static void main(String[] args) {
        int a = 40;
        System.out.println(a++ + a);
                /*      a++ - PostIncrement = Print and then Add 1 > a = a + 1
        Expression and Result Table
                Line No. / a / Result
                  5 / 40 / NA
                   6 / 41 / 81*/

        int b = 50;
        System.out.println(b++ + ++b);
/*        Expression and Result Table
        Line No. / b / Result
        13 / 50 / NA
        14 / 51 / 51 + 1 + 50 = 102*/

        int c = 10;
        System.out.println(c-- - --c);
        /*        Expression and Result Table
        Line No. / c / Result
        20 / 10 / NA
        21 / 9 / 9 - 1 - 10 = 2 */




    }
}
