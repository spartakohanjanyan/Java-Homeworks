package homeworkcustomer;

public class Main {
    public static void main(String[] args) {

        ApplianceStore store = new ApplianceStore();

        Appliance tv = new Appliance("TV", "Samsung", "QLED55", 450000);
        Appliance vacuumCleaner = new Appliance("Vacuum Cleaner", "LG", "VC123", 120000);
        Appliance fridge = new Appliance("Fridge", "Bosch", "KGN39", 380000);
        Appliance screwdriver = new Appliance("Screwdriver", "Makita", " DF488DWAESKU", 86000);

        Customer customer1 = new Customer("Karen", "Hakobyan", "10.05.2026", "Yerevan");
        Customer customer2 = new Customer("Aram", "Sargsyan", "12.05.2026", "Goris");
        Customer customer3 = new Customer("Ani", "Stepanyan", "15.05.2026", "Sisian");
        Customer customer4 = new Customer("Gor", "Martirosyan", "20.05.2026", "Yerevan");
        Customer customer5 = new Customer("Hayk", "Petrosyan", "21.05,2026","Kapan");

        store.addCustomer(tv, customer1);
        store.addCustomer(tv, customer2);
        store.addCustomer(vacuumCleaner, customer3);
        store.addCustomer(fridge, customer4);
        store.addCustomer(screwdriver, customer5);

        store.printAll();
        System.out.println(tv);
    }
}
