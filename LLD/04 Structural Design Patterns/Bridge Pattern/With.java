// Device Interface (Implementation)
interface Device {
    void turnOn();
    void turnOff();
}

// Concrete Implementations
class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is OFF");
    }
}

// RemoteControl Class (Abstraction)
abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void pressPowerButton();
}

// Concrete RemoteControl Class
class BasicRemoteControl extends RemoteControl {

    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void pressPowerButton() {
        System.out.println("Power button pressed.");
        device.turnOn();
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl tvRemote = new BasicRemoteControl(tv);
        tvRemote.pressPowerButton(); // Turns the TV on

        RemoteControl radioRemote = new BasicRemoteControl(radio);
        radioRemote.pressPowerButton(); // Turns the Radio on
    }
}