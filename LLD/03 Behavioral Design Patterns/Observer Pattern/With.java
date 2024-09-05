// Observer interface
interface Observer {
    void update(String message);
}

// Subject class
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    // Method to attach (subscribe) observers
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to detach (unsubscribe) observers
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Method to notify all observers of a change
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    // Method to change the state and notify observers
    public void setState(String newState) {
        this.state = newState;
        notifyObservers();
    }
}

// Concrete observer class
class ConcreteObserver implements Observer {
    private String name;

    // Constructor for observer
    public ConcreteObserver(String name) {
        this.name = name;
    }

    // Update method called when the subject changes
    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}

// Main class to test the Observer Pattern
public class Main {
    public static void main(String[] args) {
        // Create the subject
        Subject subject = new Subject();

        // Create and attach observers
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Change the state of the subject
        subject.setState("State has changed!");

        // You can also remove an observer
        subject.removeObserver(observer1);

        // Change state again
        subject.setState("Another state change!");
    }
}
