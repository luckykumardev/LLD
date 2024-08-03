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

// Factory Class
public class ShapeFactory {
    // Factory method to create shapes
    public Shape createShape(String shapeType) {
        if (shapeType == null || shapeType.isEmpty()) {
            return null;
        }
        if ("Circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("Rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        }
        return null;
    }
}

// Client Code with Factory Pattern
public class WithFactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create a Circle and draw it
        Shape circle = shapeFactory.createShape("Circle");
        circle.draw();

        // Create a Rectangle and draw it
        Shape rectangle = shapeFactory.createShape("Rectangle");
        rectangle.draw();
    }
}
