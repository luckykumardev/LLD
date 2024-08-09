// Command Interface
interface Command {
    void execute();
    void undo();
}

// Light Command Class
class LightCommand implements Command {
    private Light light;
    private boolean lastState; // To track the last state for undo

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        lastState = true; // Assume last state was ON
        light.turnOn();
    }

    @Override
    public void undo() {
        lastState = false; // Assume last state was OFF
        light.turnOff();
    }
}

// Fan Command Class
class FanCommand implements Command {
    private Fan fan;
    private boolean lastState; // To track the last state for undo

    public FanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        lastState = true; // Assume last state was ON
        fan.turnOn();
    }

    @Override
    public void undo() {
        lastState = false; // Assume last state was OFF
        fan.turnOff();
    }
}

// Remote Control Class with Command Pattern
class RemoteControl {
    private Command lightCommand;
    private Command fanCommand;

    public RemoteControl(Command lightCommand, Command fanCommand) {
        this.lightCommand = lightCommand;
        this.fanCommand = fanCommand;
    }

    public void pressLightButton() {
        lightCommand.execute();
    }

    public void pressFanButton() {
        fanCommand.execute();
    }

    public void undoLightButton() {
        lightCommand.undo();
    }

    public void undoFanButton() {
        fanCommand.undo();
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();
        
        Command lightCommand = new LightCommand(light);
        Command fanCommand = new FanCommand(fan);
        
        RemoteControl remote = new RemoteControl(lightCommand, fanCommand);

        // Execute commands
        remote.pressLightButton();
        remote.pressFanButton();

        // Undo commands
        remote.undoLightButton();
        remote.undoFanButton();
    }
}
