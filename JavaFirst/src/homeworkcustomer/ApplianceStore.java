package homeworkcustomer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ApplianceStore {
    private HashMap<Appliance, ArrayList<Customer>> applianceCustomers;

    public ApplianceStore() {
        applianceCustomers = new HashMap<>();
    }

    public void addCustomer(Appliance appliance, Customer customer) {
        if (!applianceCustomers.containsKey(appliance)) {
            applianceCustomers.put(appliance, new ArrayList<>());
        }

        applianceCustomers.get(appliance).add(customer);
    }

    public void printAll() {
        for (Map.Entry<Appliance, ArrayList<Customer>> entry : applianceCustomers.entrySet()) {
            System.out.println("Appliance: " + entry.getKey());

            System.out.println("Customers:");
            for (Customer customer : entry.getValue()) {
                System.out.println(customer);

                System.out.println("  ");
            }
        }
    }
}
