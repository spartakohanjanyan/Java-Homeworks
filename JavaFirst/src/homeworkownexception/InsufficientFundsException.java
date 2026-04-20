package homeworkownexception;

public class InsufficientFundsException extends Exception {

    private double shortage;

    public InsufficientFundsException(double shortage) {
        super("insufficient funds։ are missing " + shortage);
        this.shortage = shortage;
    }

    public double getShortage() {
        return shortage;
    }
}
