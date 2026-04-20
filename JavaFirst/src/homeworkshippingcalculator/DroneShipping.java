package homeworkshippingcalculator;

public class DroneShipping implements ShippingCalculator {

    @Override
    public double calculateCost(double weight, double distance) {
        if (weight > 5) {
            System.out.println("Drone cannot carry more than 5kg");
            return -1;
        }
        return 3000;
    }
}
