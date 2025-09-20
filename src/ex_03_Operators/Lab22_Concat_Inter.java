package ex_03_Operators;

public class Lab22_Concat_Inter {
    public static void main(String[] args) {
        int a = 10 , b = 20;
//        + - arithmetic operator
        System.out.println(a+b);
        /*+ - behaves differently with diff data type
        operator overloading*/
        String First_Name = "Sachin";
        String Last_Name = "M";
        System.out.println(First_Name + Last_Name);
/*        System.out.println(First_Name - Last_Name);
        System.out.println(First_Name * Last_Name);
        System.out.println(First_Name / Last_Name);*/
 /*        String Concatenation

  */
        System.out.println(First_Name + Last_Name + a + b);
//        String
        System.out.println(a + b + First_Name + Last_Name);
//        Addition + String
        System.out.println(First_Name + Last_Name + (a + b));
//        BODMAS Rule so String + Addition > Bracket of Div, Mul, Add, Sub





    }




}
