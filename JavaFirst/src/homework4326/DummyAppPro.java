package homework4326;

public class DummyAppPro extends DummyApp {

    public boolean isCameraOn;

    public DummyAppPro(String[] members) {
        super(members);

        if (members.length <= 10) {
            this.members = members;
            this.isActive = true;
        } else {
            System.out.println("Max 10 members ");
            this.isActive = false;
        }
        this.isCameraOn = false;
    }

    public void switchCamera() {
        if (isActive) {
            isCameraOn = !isCameraOn;
            System.out.println("Camera " + (isCameraOn ? "ON" : "OFF"));
        }
    }
}