// Before applying DIP
class LightBulb {
    public void turnOn() {
        // turn on the light bulb
    }

    public void turnOff() {
        // turn off the light bulb
    }
}

class Switch {
    private LightBulb lightBulb;

    public Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void operate() {
        lightBulb.turnOn();
    }
}

// After applying DIP
interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        // turn on the light bulb
    }

    @Override
    public void turnOff() {
        // turn off the light bulb
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}
