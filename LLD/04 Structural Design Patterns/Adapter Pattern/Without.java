// Existing MediaPlayer interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Existing concrete class that implements MediaPlayer
class Mp3Player implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}

// New media player with a different interface
class VlcPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new Mp3Player();
        player.play("mp3", "song.mp3");

        // You can't use VlcPlayer with MediaPlayer directly
        VlcPlayer vlcPlayer = new VlcPlayer();
        vlcPlayer.playVlc("movie.vlc"); // Direct call, no integration with MediaPlayer interface
    }
}
