// TV Class
class TV {
    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

// RemoteControl Class
class RemoteControl {
    private TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public void pressPowerButton() {
        // Power button directly controls the TV
        tv.turnOn();
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl remote = new RemoteControl(tv);
        remote.pressPowerButton(); // Turns the TV on
    }
}
