package Facade;

public class LightsController {
    boolean isLightsOn;

    public void turnLightsOn() {
        this.isLightsOn = true;
    }

    public void turnLightsOff() {
        this.isLightsOn = false;
    }

    public LightsController() {
        isLightsOn = true;
    }

    public boolean getIsLightsOn() {
        return isLightsOn;
    }
}