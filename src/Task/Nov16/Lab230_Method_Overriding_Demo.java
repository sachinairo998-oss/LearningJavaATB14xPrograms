package Task.Nov16;

class Parent {
    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class display method");
    }
}


public class Lab230_Method_Overriding_Demo {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        p.display();
        c.display();
    }
}
