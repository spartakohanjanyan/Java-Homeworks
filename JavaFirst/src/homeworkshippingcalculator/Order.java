package homeworkshippingcalculator;

public class Order {

    private ShippingCalculator shippingCalculator;

    public Order(ShippingCalculator shippingCalculator) {
        this.shippingCalculator = shippingCalculator;
    }

    public void finalizeOrder(double weight, double distance) {
        double cost = shippingCalculator.calculateCost(weight, distance);

        if (cost != -1) {
            System.out.println("Shipping cost: " + cost + " AMD");
        } else {
            System.out.println("Order cannot be shipped with this method.");
        }
    }
}
