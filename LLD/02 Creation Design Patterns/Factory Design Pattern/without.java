// Define the Shape Interface
public interface Shape {
    void draw();
}

// Concrete Classes for Shapes
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Client Code without Factory Pattern
public class WithoutFactoryPatternDemo {
    public static void main(String[] args) {
        // Create a Circle and draw it
        Shape circle = new Circle();
        circle.draw();

        // Create a Rectangle and draw it
        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}
