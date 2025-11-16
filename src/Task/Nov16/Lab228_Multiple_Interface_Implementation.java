package Task.Nov16;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck is flying in the sky!");
    }

    public void swim() {
        System.out.println("Duck is swimming in the water!");
    }
}

public class Lab228_Multiple_Interface_Implementation {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
