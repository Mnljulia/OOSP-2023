//Создайте систему управления устройствами в доме (например, умными розетками), чтобы они могли быть управляемыми через старые устройства с помощью адаптеров.
public class Main {
    public static void main(String[] args) {
        SmartPlugs smartSocket = new SmartPlugs();

        OldDevices oldDevices = new OldDevices();

        Adapter adapter = new Adapter(oldDevices);

        adapter.useWithOldDevice();

       smartSocket.turnOn();
    }
}