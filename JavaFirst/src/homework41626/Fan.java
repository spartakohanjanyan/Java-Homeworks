package homework41626;

public class Fan implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Fan is On");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is Off");
    }
}
