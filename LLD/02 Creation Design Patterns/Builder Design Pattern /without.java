// Without Using the Builder Design Pattern
// In this approach, we create the House object directly using a constructor, which can become unwieldy if there are many parameters.


class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String powerSupply;
    private String motherboard;

    // Constructor with all possible parameters
    public Computer(String CPU, String RAM, String storage, String GPU, String powerSupply, String motherboard) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.GPU = GPU;
        this.powerSupply = powerSupply;
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage +
                ", GPU=" + GPU + ", PowerSupply=" + powerSupply + ", Motherboard=" + motherboard + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a computer with all components
        Computer computer = new Computer("Intel i7", "16GB", "1TB SSD", "NVIDIA RTX 3080", "650W", "ASUS ROG");
        System.out.println(computer);
    }
}