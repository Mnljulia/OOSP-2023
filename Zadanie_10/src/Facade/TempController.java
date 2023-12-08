package Facade;

public class TempController {
    int temp;

    public TempController() {
        temp = 25;
    }

    public int getTemp() {
        return temp;
    }

    public void turnTempUp(int inc) {
        temp += inc;
    }

    public void turnTempDown(int inc) {
        temp -= inc;
    }
}