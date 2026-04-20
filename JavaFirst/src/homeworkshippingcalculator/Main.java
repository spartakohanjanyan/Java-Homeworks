package homeworkshippingcalculator;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(new GroundShipping());
        order1.finalizeOrder(10, 50);

        Order order2 = new Order(new AirShipping());
        order2.finalizeOrder(2, 50);

        Order order3 = new Order(new DroneShipping());
        order3.finalizeOrder(6, 10);
    }
}
