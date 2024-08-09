// Traffic Light without State Pattern
class TrafficLight {
    private String state;

    public TrafficLight() {
        this.state = "Red"; // Initial state
    }

    public void change() {
        switch (state) {
            case "Red":
                state = "Green";
                break;
            case "Green":
                state = "Yellow";
                break;
            case "Yellow":
                state = "Red";
                break;
        }
        System.out.println("Traffic Light is now: " + state);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // Change the traffic light state
        trafficLight.change(); // Green
        trafficLight.change(); // Yellow
        trafficLight.change(); // Red
        trafficLight.change(); // Green
    }
}
