package Facade;

public class AudioController {
    int volumeLevel;

    public AudioController() {
        volumeLevel = 50;
    }

    public void turnVolumeUp(int inc) {
        volumeLevel += inc;
    }

    public void turnVolumeDown(int inc) {
        volumeLevel -= inc;
    }
}