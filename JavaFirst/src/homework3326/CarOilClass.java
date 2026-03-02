package homework3326;

public class CarOilClass {
    public static void main(String[] args){

        Car car1 = new Car("BMW", 5000, 40000);
        Car car2 = new Car("Toyota", 7000, 60000);

        car1.drive();
        car1.drive();
        car1.printStatus();

        car1.changeEngineOil();
        car1.printStatus();

        car2.drive();
        car2.printStatus();
    }
}
