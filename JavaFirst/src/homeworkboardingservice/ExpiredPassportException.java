package homeworkboardingservice;

class ExpiredPassportException extends Exception {
    public ExpiredPassportException(String message) {
        super(message);
    }
}