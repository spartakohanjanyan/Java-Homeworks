package homework4326;

public class Main {
    public static void main(String[] args) {

        String[] people = {"Ani Bdeyan", "Babken Harutyunyan", "Kamo Sahakyan"};

        DummyAppProMax app = new DummyAppProMax(people);

        app.answerCall();

        app.switchCamera();

        app.switchScreenSharing();

        app.endCall(64);

        app.getLastCallDuration();

        app.switchScreenSharing();

        app.destroy();
    }
}
