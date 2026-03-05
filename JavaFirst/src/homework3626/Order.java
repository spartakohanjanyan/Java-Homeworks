package homework3626;

public class Order {

    private int id;
    private String customerName;
    private int orderPrice;
    private int deliveryTime;

    private static int totalOrders = 0;
    private static int deliveryPrice = 1300;

    public Order(int id, String customerName, int orderPrice) {
        this.id = id;
        this.customerName = customerName;
        this.orderPrice = orderPrice;
        this.deliveryTime = 30;
        totalOrders++;
    }

    public Order(int id, String customerName, int orderPrice, int deliveryTime) {
        this.id = id;
        this.customerName = customerName;
        this.orderPrice = orderPrice;
        this.deliveryTime = deliveryTime;
        totalOrders++;
    }

    public int calculateTotalPrice() {
        return orderPrice + deliveryPrice;
    }

    public static void setDeliveryPrice(int price) {
        deliveryPrice = price;
    }

    public static int getTotalOrders() {
        return totalOrders;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Customer: " + customerName);
        System.out.println("Order price: " + orderPrice);
        System.out.println("Delivery time: " + deliveryTime);
        System.out.println("Total price: " + calculateTotalPrice());
    }
}