package ex_19_OOPs_Polymorphism.methodoverloading;

public class Lab148_Calculator {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.add(3,5); // int values
        c1.add(3.14,3.14); // double values
    } // Same Method with different parameters or Arguments > Compile Time Polymorphism
}

class Calc {
    int add (int a, int b) {
        return a+b; // o/p - 8
    }
    double add (double a, double b){
        return a+b; // o/p - 6.28
    }
    String add (String a, String b){
        return a+b;
    }

}
