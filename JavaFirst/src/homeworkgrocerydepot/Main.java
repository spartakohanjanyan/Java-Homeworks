package homeworkgrocerydepot;

public class Main {
    public static void main(String[] args) {
        Depot depot = new Depot(100);

        Grocery sugar = new Grocery(
                "Sugar", "01:05:2026", "01:05:2027", 0.5,
                "SweetFood"
        );

        Grocery rice = new Grocery(
                "Rice", "10:04:2026", "10:04:2027", 0.8,
                "AraratFood"
        );

        depot.addGrocery(sugar, 28);
        depot.printInfo();

        System.out.println();

        depot.addGrocery(rice, 57);
        depot.printInfo();

        System.out.println();

        depot.removeGrocery(sugar,35);
        depot.printInfo();

        System.out.println(rice);
        System.out.println(sugar);
    }
}
