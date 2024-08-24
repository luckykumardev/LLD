// Subsystem Classes
class DVDPlayer {
    void on() {
        System.out.println("DVD Player is On");
    }

    void play(String movie) {
        System.out.println("Playing " + movie);
    }

    void off() {
        System.out.println("DVD Player is Off");
    }
}

class Projector {
    void on() {
        System.out.println("Projector is On");
    }

    void setInput(String input) {
        System.out.println("Projector input set to " + input);
    }

    void off() {
        System.out.println("Projector is Off");
    }
}

class Speakers {
    void on() {
        System.out.println("Speakers are On");
    }

    void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }

    void off() {
        System.out.println("Speakers are Off");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Using subsystem classes directly
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Speakers speakers = new Speakers();

        dvdPlayer.on();
        projector.on();
        projector.setInput("DVD");
        speakers.on();
        speakers.setVolume(5);
        dvdPlayer.play("Inception");
    }
}
