// Facade Class
class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Speakers speakers;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Speakers speakers) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.speakers = speakers;
    }

    public void watchMovie(String movie) {
        System.out.println("Getting ready to watch a movie...");
        dvdPlayer.on();
        projector.on();
        projector.setInput("DVD");
        speakers.on();
        speakers.setVolume(5);
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down home theater...");
        dvdPlayer.off();
        projector.off();
        speakers.off();
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Using the Facade
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Speakers speakers = new Speakers();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, speakers);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
