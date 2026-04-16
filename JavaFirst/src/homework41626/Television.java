package homework41626;

public class Television implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Television is On");
    }

    @Override
    public void turnOff() {
        System.out.println("Television is Off");
    }
}
