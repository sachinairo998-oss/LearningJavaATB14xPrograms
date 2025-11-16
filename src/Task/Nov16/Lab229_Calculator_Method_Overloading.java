package Task.Nov16;

class Calculator {

    // add two integers
    int add(int a, int b) {
        return a + b;
    }

    // add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Lab229_Calculator_Method_Overloading {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Integer addition: " + c.add(5, 3));
        System.out.println("Double addition: " + c.add(2.5, 3.7));
        System.out.println("Three integers addition: " + c.add(1, 2, 3));
    }
}
