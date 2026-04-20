package homeworkrobot;

public class Android implements Walker, Talker, Cleaner {

    @Override
    public void walk() {
        System.out.println("Android is walking");
    }

    @Override
    public void speak() {
        System.out.println("Android is speaking");
    }

    @Override
    public void clean() {
        System.out.println("Android is cleaning");
    }
}
