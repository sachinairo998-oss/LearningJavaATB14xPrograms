package ex_06_Increment_Decrement_Operator;

public class Lab41_PreInc_PostInc {
    public static void main(String[] args) {
        int a = 20;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
/*      ++a - PreIncrement = Add 1 and then Print > a = a + 1
        Expression and Result Table
                Line No. / a / Result b
                  7 / 20 / NA
                   8 / 21 / 21
                   9 / 21
                   10 / 21    */
        int c = 30;
        int d = c++;
        System.out.println(c);
        System.out.println(d);
        /*      c++ - PostIncrement = Print and then Add 1 > c = c + 1
        Expression and Result Table
                Line No. / c / Result d
                  18 / 30 / NA
                   19 / 31 / 30
                   20 / 31
                   21 / 31 / 30    */

    }
}
