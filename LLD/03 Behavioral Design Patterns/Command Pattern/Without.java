// Simple Light and Fan Classes
class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

class Fan {
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}

// Remote Control Class without Command Pattern
class RemoteControl {
    private Light light;
    private Fan fan;

    public RemoteControl(Light light, Fan fan) {
        this.light = light;
        this.fan = fan;
    }

    public void pressLightOnButton() {
        light.turnOn();
    }

    public void pressLightOffButton() {
        light.turnOff();
    }

    public void pressFanOnButton() {
        fan.turnOn();
    }

    public void pressFanOffButton() {
        fan.turnOff();
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();
        RemoteControl remote = new RemoteControl(light, fan);

        remote.pressLightOnButton();
        remote.pressFanOnButton();
        remote.pressLightOffButton();
        remote.pressFanOffButton();
    }
}
