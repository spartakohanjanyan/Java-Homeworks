package homeworkshippingcalculator;

public class GroundShipping implements ShippingCalculator {

    @Override
    public double calculateCost(double weight, double distance) {
        return distance * 200 + 1000;
    }
}
