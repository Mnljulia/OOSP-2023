package Facade;

public class HomeControlSystem {
    AudioController audioController;
    TempController tempController;
    LightsController lightsController;

    public HomeControlSystem() {
        audioController = new AudioController();
        tempController = new TempController();
        lightsController = new LightsController();
    }
}