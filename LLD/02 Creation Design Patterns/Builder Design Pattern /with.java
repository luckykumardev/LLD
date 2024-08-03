// House Class
public class House {
    private String walls;
    private String roof;
    private boolean garden;

    private House(HouseBuilder builder) {
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.garden = builder.garden;
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

    // Static nested Builder class
    public static class HouseBuilder {
        private String walls;
        private String roof;
        private boolean garden;

        public HouseBuilder setWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setGarden(boolean garden) {
            this.garden = garden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}

// Client Code with Builder Pattern
public class WithBuilderPatternDemo {
    public static void main(String[] args) {
        // Creating a House object using the Builder
        House house = new House.HouseBuilder()
                .setWalls("Brick")
                .setRoof("Tile")
                .setGarden(true)
                .build();

        // Using the House object
        System.out.println("House with walls: " + house.getWalls());
        System.out.println("House with roof: " + house.getRoof());
        System.out.println("House with garden: " + house.hasGarden());
    }
}
