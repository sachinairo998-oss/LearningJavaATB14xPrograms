package ex_17_OOPs_Inheritance.Single_Inheritance;

public class Lab135_Single_Inheritance extends Lab133_Father { // A Father -> B Son
    // extends keyword for Inheriting
    public static void main(String[] args) {
        Lab134_Son Sachin = new Lab134_Son();
        System.out.println(Sachin.gold_f);
        Sachin.bhk2();
        Sachin.bhk3();

        Lab133_Father f1 = new Lab133_Father();
        System.out.println(f1.gold_f);
        f1.bhk2();
        // f1.bhk3(); Son to Father inheritance NA



    }
}
