package homework31626;

public class MainEmployee {
    public static void main(String[] args) {

        Developer developer = new Developer("David", 1500, "Java");
        Manager manager = new Manager("Alik", 2500, 5);

        developer.work();
        manager.work();
        developer.printInformation();
        manager.printInformation();
    }
}
