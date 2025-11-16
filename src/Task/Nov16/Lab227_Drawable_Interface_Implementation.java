package Task.Nov16;

interface Shapes {
    void draw(); // abstract method
}

class Circles implements Shapes {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangles implements Shapes {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Lab227_Drawable_Interface_Implementation {
    public static void main(String[] args) {
        Shapes c = new Circles();
        Shapes r = new Rectangles();

        c.draw();
        r.draw();
    }

    }

