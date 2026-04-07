package homework4326;

public class DummyApp {

    public String[] members;
    public int duration;
    public boolean isActive;

    public DummyApp(String[] members) {
        if (members.length <= 2) {
            this.members = members;
            this.isActive = true;
        } else {
            System.out.println("Max 2 members ");
            this.isActive = false;
        }
    }

    public void answerCall() {
        if (isActive) {
            System.out.println("Call answered ");
        }
    }

    public void endCall(int duration) {
        if (isActive) {
            this.duration = duration;
            this.isActive = false;
            System.out.println("Call ended ");
        }
    }

    public void getLastCallDuration() {
        System.out.println("Duration: " + duration);
    }

    public void destroy() {
        members = null;
        isActive = false;
        System.out.println("Call destroyed ");
    }
}