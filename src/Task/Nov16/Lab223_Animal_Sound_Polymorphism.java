package Task.Nov16;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

public class Lab223_Animal_Sound_Polymorphism {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        c.makeSound();
    }
}
