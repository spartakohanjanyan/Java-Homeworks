package homeworkboardingservice;

class BoardingService {

    public void boardPassenger(Passenger passenger)
            throws NoVisaException, InvalidBoardingPassException, ExpiredPassportException {

        if (!passenger.hasValidPassport()) {
            throw new ExpiredPassportException("Invalid passport");
        }

        if (!passenger.hasVisa()) {
            throw new NoVisaException("Invalid visa");
        }

        if (!passenger.hasValidBoardingPass()) {
            throw new InvalidBoardingPassException("Invalid boarding pass");
        }

        System.out.println("Passenger boarded ");
    }
}