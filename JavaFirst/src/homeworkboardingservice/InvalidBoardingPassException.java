package homeworkboardingservice;

class InvalidBoardingPassException extends Exception {
    public InvalidBoardingPassException(String message) {
        super(message);
    }
}