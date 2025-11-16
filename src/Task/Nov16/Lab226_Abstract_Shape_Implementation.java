package Task.Nov16;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}
public class Lab226_Abstract_Shape_Implementation {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        Circle c = new Circle(4);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Circle Area: " + c.area());
    }
    }

