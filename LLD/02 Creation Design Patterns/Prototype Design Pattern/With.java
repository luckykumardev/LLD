interface Prototype {
    Prototype clone();
}

class ConcretePrototype1 implements Prototype {
    private String attribute;

    public ConcretePrototype1(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(attribute);
    }
}

public class PrototypeDemo {
    public static void main(String[] args) {
        ConcretePrototype1 prototype = new ConcretePrototype1("Original Value");
        ConcretePrototype1 clone = (ConcretePrototype1) prototype.clone();

        System.out.println("Prototype Attribute: " + prototype.getAttribute());
        System.out.println("Clone Attribute: " + clone.getAttribute());
    }
}