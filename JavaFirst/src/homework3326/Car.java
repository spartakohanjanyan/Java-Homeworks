package homework3326;
import java.util.Random;

public class Car {

    private String brand;
    private int maxEngineOilKm;
    private int maxGearboxOilKm;
    private int currentEngineOilKm;
    private int currentGearboxOilKm;

    private Random random = new Random();

    public Car(String brand, int maxEngineOilKm, int maxGearboxOilKm) {
        this.brand = brand;
        this.maxEngineOilKm = maxEngineOilKm;
        this.maxGearboxOilKm = maxGearboxOilKm;
        this.currentEngineOilKm = 0;
        this.currentGearboxOilKm = 0;
    }

    public void drive() {

        if (!canDrive()) {
            System.out.println("Cannot drive! Oil change required");
            return;
        }

        int generatedKm = random.nextInt(500) ;

        currentEngineOilKm += generatedKm;
        currentGearboxOilKm += generatedKm;

        System.out.println(brand + " drove " + generatedKm + " km");
    }

    public void changeEngineOil() {
        currentEngineOilKm = 0;
        System.out.println("Engine oil changed:");
    }

    public void changeGearboxOil() {
        currentGearboxOilKm = 0;
        System.out.println("Gearbox oil changed:");
    }

    public boolean canDrive() {
        return currentEngineOilKm < maxEngineOilKm &&
                currentGearboxOilKm < maxGearboxOilKm;
    }

    public void printStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Engine oil km: " + currentEngineOilKm + "/" + maxEngineOilKm);
        System.out.println("Gearbox oil km: " + currentGearboxOilKm + "/" + maxGearboxOilKm);
        System.out.println("Can drive: " + canDrive());
    }
}
