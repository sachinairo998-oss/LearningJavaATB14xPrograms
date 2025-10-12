package ex_17_OOPs_Hierarchical_Inheritance;

public class Lab137_Hierarchical { // // A Father -> B Son -> C & D Daughters
    // extends keyword for Inheriting
    public static void main(String[] args) {
        Sachin_Son S = new Sachin_Son();
        S.home2();
        S.home();

        Priya P1 = new Priya();
        P1.l2();
        P1.home();

        Sanju S2 = new Sanju();
        S2.s2();
        S2.home();

    }
}
