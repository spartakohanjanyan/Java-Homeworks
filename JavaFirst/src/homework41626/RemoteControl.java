package homework41626;

public class RemoteControl {
    private Switchable device;

    public RemoteControl(Switchable device) {
        this.device = device;
    }

    public void turnOnDevice() {
        device.turnOn();
    }

    public void turnOffDevice() {
        device.turnOff();
    }
}
