// State Interface
interface TrafficLightState {
    void change(TrafficLight context);
}

// Red State Class
class RedState implements TrafficLightState {
    @Override
    public void change(TrafficLight context) {
        System.out.println("Traffic Light is now: Red");
        context.setState(new GreenState());
    }
}

// Green State Class
class GreenState implements TrafficLightState {
    @Override
    public void change(TrafficLight context) {
        System.out.println("Traffic Light is now: Green");
        context.setState(new YellowState());
    }
}

// Yellow State Class
class YellowState implements TrafficLightState {
    @Override
    public void change(TrafficLight context) {
        System.out.println("Traffic Light is now: Yellow");
        context.setState(new RedState());
    }
}

// Context Class
class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        state = new RedState(); // Initial state
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.change(this); // Delegate the change to the current state
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // Change the traffic light state
        trafficLight.change(); // Red -> Green
        trafficLight.change(); // Green -> Yellow
        trafficLight.change(); // Yellow -> Red
        trafficLight.change(); // Red -> Green
    }
}
