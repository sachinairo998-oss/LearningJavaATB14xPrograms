package ex_19_OOPs_Polymorphism.methodoverloading;

public class Lab150_Math_Operations {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r1 = m1.add(3,5);
        int r2 = m1.add(3,6,9);
        double r3 = m1.add(3.14, 3.15);
        long r4 = m1.add(10000, 20000);
        String r5 = m1.add("Sachin", "M");
    }

}
 class MathOperations{
    // Same name Methods with different Arguments and Return type - Method Overloading

    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
    double add(double a, double b){
        return a + b;
    }
    long add (long a , long b){
        return a + b;
    }
    String add (String a, String b){
        return a + b;
    }
 }
