package homeworkboardingservice;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(true, false, true);
        BoardingService boardingService = new BoardingService();

        try {
            boardingService.boardPassenger(passenger);
        } catch (ExpiredPassportException e) {
            System.out.println("Error " + e.getMessage());
        } catch (NoVisaException e) {
            System.out.println("Error " + e.getMessage());
        } catch (InvalidBoardingPassException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}