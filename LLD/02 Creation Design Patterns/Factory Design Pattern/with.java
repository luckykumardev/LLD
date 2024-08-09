// Vehicle Interface
interface Vehicle {
    void drive();
}

// Concrete Vehicle Classes
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a truck");
    }
}

// VehicleFactory Class
class VehicleFactory {
    // Factory Method to create vehicles
    public static Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        }
        return null;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.createVehicle("car");
        vehicle1.drive();
        
        Vehicle vehicle2 = VehicleFactory.createVehicle("truck");
        vehicle2.drive();
    }
}
