package Task.Nov16;

class Outer {
    int x = 10;

    class Inner {
        void show() {
            System.out.println("Inner class accessing outer variable: " + x);
        }
    }
}

public class Lab231_Outer_and_Inner_Class_Implementation {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("Outer class variable x: " + outer.x);

        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}
