// Base Coffee Class
class Coffee {
    public String getDescription() {
        return "Basic Coffee";
    }

    public double cost() {
        return 2.00; // Base price for coffee
    }
}

// Subclass for Milk Coffee
class MilkCoffee extends Coffee {
    @Override
    public String getDescription() {
        return "Milk Coffee";
    }

    @Override
    public double cost() {
        return 2.50; // Price for milk coffee
    }
}

// Subclass for Sugar Coffee
class SugarCoffee extends Coffee {
    @Override
    public String getDescription() {
        return "Sugar Coffee";
    }

    @Override
    public double cost() {
        return 2.25; // Price for sugar coffee
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Coffee basicCoffee = new Coffee();
        System.out.println(basicCoffee.getDescription() + " costs $" + basicCoffee.cost());

        Coffee milkCoffee = new MilkCoffee();
        System.out.println(milkCoffee.getDescription() + " costs $" + milkCoffee.cost());

        Coffee sugarCoffee = new SugarCoffee();
        System.out.println(sugarCoffee.getDescription() + " costs $" + sugarCoffee.cost());
    }
}
