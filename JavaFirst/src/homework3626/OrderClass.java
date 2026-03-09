package homework3626;

public class OrderClass {
    public static void main(String[] args){

        Order order1 = new Order(1, "Aram", 6500);
        Order order2 = new Order(2, "Ani", 8700, 60);

        order1.printInfo();
        order2.printInfo();

        System.out.println("Total orders: " + Order.getTotalOrders());

        Order.setDeliveryPrice(1500);

        System.out.println("New price for order1: " + order1.calculateTotalPrice());
        System.out.println("New price for order2: " + order2.calculateTotalPrice());
    }
}