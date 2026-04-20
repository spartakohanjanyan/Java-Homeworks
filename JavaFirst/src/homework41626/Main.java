package homework41626;

public class Main {
    public static void main(String[] args) {

        Switchable light = new LightBulb();
        Switchable fan = new Fan();
        Switchable tv = new Television();

        RemoteControl remote1 = new RemoteControl(light);
        remote1.turnOnDevice();
        remote1.turnOffDevice();

        RemoteControl remote2 = new RemoteControl(fan);
        remote2.turnOnDevice();

        RemoteControl remote3 = new RemoteControl(tv);
        remote3.turnOnDevice();
    }
}
