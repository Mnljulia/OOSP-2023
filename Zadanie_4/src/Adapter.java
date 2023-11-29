public class Adapter extends SmartPlugs {
    private OldDevices device;

    public Adapter(OldDevices device) {
        this.device = device;
    }

    public void useWithOldDevice() {
        device.operate();
    }
}