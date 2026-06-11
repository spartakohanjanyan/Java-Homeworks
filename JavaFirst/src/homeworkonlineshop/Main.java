package homeworkonlineshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Aram", "091111111", "aram@gmail.com");
        Customer customer2 = new Customer("Karen", "093222222", "karen@gmail.com");
        Customer customer3 = new Customer("Anna", "094333333", "anna@gmail.com");
        Customer customer4 = new Customer("Aram", "091111111", "aram@gmail.com");

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(1, "Iphone", customer1));
        orders.add(new Order(2, "Samsung", customer2));
        orders.add(new Order(3, "PS5", customer1));
        orders.add(new Order(4, "Keyboard", customer3));
        orders.add(new Order(5, "BT Speaker", customer4));
        orders.add(new Order(6, "Headphones", customer2));

        OrderService orderService = new OrderService(orders);

        HashMap<Customer, Integer> customerOrderCounts =
                orderService.getOrderCountByCustomer();

        for (Map.Entry<Customer, Integer> entry : customerOrderCounts.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        System.out.println();

        TreeMap<String, Integer> sortedCustomerOrderCounts =
                orderService.getOrderCountByCustomerNameSorted();

        for (Map.Entry<String, Integer> entry : sortedCustomerOrderCounts.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
