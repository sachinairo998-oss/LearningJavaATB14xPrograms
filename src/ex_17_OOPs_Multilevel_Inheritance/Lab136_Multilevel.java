package ex_17_OOPs_Multilevel_Inheritance;

public class Lab136_Multilevel { // A Grandfather -> B Father -> C Son
    // extends keyword for Inheriting
    public static void main(String[] args) {
        Son Sachin = new Son();
        Sachin.home();
        Sachin.extra();
        Sachin.gf();
        Sachin.bhk3();

        Father f = new Father();
        f.extra();
        f.home();
        f.gf();

        Grandfather gf = new Grandfather();
        gf.gf();
        gf.home();

        // Dynamic Dispatch
        Grandfather g1 = new Son();
        Father f2 = new Son();
      //  Son s1 = new Grandfather(); NA
         // Father f3 = new Grandfather(); NA


    }
}
