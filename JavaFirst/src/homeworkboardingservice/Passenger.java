package homeworkboardingservice;

class Passenger {
    private boolean hasVisa;
    private boolean hasValidBoardingPass;
    private boolean hasValidPassport;

    public Passenger(boolean hasVisa, boolean hasValidBoardingPass, boolean hasValidPassport) {
        this.hasVisa = hasVisa;
        this.hasValidBoardingPass = hasValidBoardingPass;
        this.hasValidPassport = hasValidPassport;
    }

    public boolean hasVisa() {
        return hasVisa;
    }

    public boolean hasValidBoardingPass() {
        return hasValidBoardingPass;
    }

    public boolean hasValidPassport() {
        return hasValidPassport;
    }
}