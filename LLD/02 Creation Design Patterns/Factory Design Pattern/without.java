// The Factory Design Pattern is a creational design pattern that provides an interface for creating objects 
// in a superclass but allows subclasses to alter the type of objects that will be created.

class Car {
    void drive() {
        System.out.println("Driving a car");
    }
}

class Truck {
    void drive() {
        System.out.println("Driving a truck");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        
        Truck truck = new Truck();
        truck.drive();
    }
}
