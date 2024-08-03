// Without Using the Builder Design Pattern
// In this approach, we create the House object directly using a constructor, which can become unwieldy if there are many parameters.


// House Class
public class House {
    private String walls;
    private String roof;
    private boolean garden;

    public House(String walls, String roof, boolean garden) {
        this.walls = walls;
        this.roof = roof;
        this.garden = garden;
    }

    // Getters
    public String getWalls() {
        return walls;
    }

    public String getRoof() {
        return roof;
    }

    public boolean hasGarden() {
        return garden;
    }
}

// Client Code without Builder Pattern
public class WithoutBuilderPatternDemo {
    public static void main(String[] args) {
        // Creating a House object
        House house = new House("Brick", "Tile", true);

        // Using the House object
        System.out.println("House with walls: " + house.getWalls());
        System.out.println("House with roof: " + house.getRoof());
        System.out.println("House with garden: " + house.hasGarden());
    }
}
