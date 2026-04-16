package homeworkshippingcalculator;

public class AirShipping implements ShippingCalculator {

    @Override
    public double calculateCost(double weight, double distance) {
        return distance * 1000 + 5000;
    }
}
