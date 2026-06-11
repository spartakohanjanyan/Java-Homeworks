package homeworkonlineshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class OrderService {
    private ArrayList<Order> orders;

    public OrderService(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public HashMap<Customer, Integer> getOrderCountByCustomer() {
        HashMap<Customer, Integer> result = new HashMap<>();

        for (Order order : orders) {
            Customer customer = order.getCustomer();

            if (result.containsKey(customer)) {
                int oldCount = result.get(customer);
                result.put(customer, oldCount + 1);
            } else {
                result.put(customer, 1);
            }
        }
        return result;
    }

    public TreeMap<String, Integer> getOrderCountByCustomerNameSorted() {
        TreeMap<String, Integer> result = new TreeMap<>();

        for (Order order : orders) {
            String customerName = order.getCustomer().getName();

            if (result.containsKey(customerName)) {
                int oldCount = result.get(customerName);
                result.put(customerName, oldCount + 1);
            } else {
                result.put(customerName, 1);
            }
        }
        return result;
    }
}
