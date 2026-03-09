package homework3626;

public class ProductClass {
    public static void main(String[] args){

        Product product1 = new Product(1, "Laptop", 500000, 5);
        Product product2 = new Product(2, "PC", 800000, 10, 5);

        Product.setDiscountRate(10);

        product1.printInfo();
        product2.printInfo();

        Product.setDiscountRate(15);

        System.out.println(product1.calculateFinalPrice());
        System.out.println(product2.calculateFinalPrice());
    }
}