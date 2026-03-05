package homework3626;

public class Product {

    private int id;
    private String name;
    private int price;
    private int amount;
    private int extraDiscount;

    private static int discountRate = 0;

    public Product(int id, String name, int price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.extraDiscount = 0;
    }

    public Product(int id, String name, int price, int amount, int extraDiscount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.extraDiscount = extraDiscount;
    }

    public static void setDiscountRate(int rate) {
        discountRate = rate;
    }

    public int calculateFinalPrice() {
        int priceAfterStoreDiscount = price - (price * discountRate / 100);
        int finalPrice = priceAfterStoreDiscount - (priceAfterStoreDiscount * extraDiscount / 100);
        return finalPrice;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Amount: " + amount);
        System.out.println("Final price: " + calculateFinalPrice());
    }
}