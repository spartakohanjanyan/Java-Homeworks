package homework4326;

public class DummyAppProMax extends DummyAppPro {

    public boolean isScreenSharing;

    public DummyAppProMax(String[] members) {
        super(members);
        this.isScreenSharing = false;
    }

    public void switchScreenSharing() {
        if (!isActive) {
            System.out.println("Call is not active ");
            return;
        }

        isScreenSharing = !isScreenSharing;
        System.out.println("Screen sharing " + (isScreenSharing ? "ON" : "OFF"));
    }
}