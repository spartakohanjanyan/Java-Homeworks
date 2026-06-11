package homeworkonlineshop;

public class Order {
    private final int id;
    private final String productName;
    private final Customer customer;

    public Order(int id, String productName, Customer customer) {
        this.id = id;
        this.productName = productName;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Order id: " + id + " product: " + productName + " customer: " + customer;
    }
}
