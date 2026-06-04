package homeworkgrocerydepot;

public class Depot {
    private final double maxVolume;
    private double currentVolume;

    public Depot(double maxVolume) {
        this.maxVolume = maxVolume;
        this.currentVolume = 0;
    }

    public void addGrocery(Grocery grocery, double weightKg) {
        double addedVolume = grocery.getVolumePerKg() * weightKg;

        if (currentVolume + addedVolume > maxVolume) {
            System.out.println("Cannot add grocery not enough space in the depot.");
            return;
        }

        currentVolume += addedVolume;
        System.out.println("Grocery was added to the depot.");
    }

    public void removeGrocery(Grocery grocery, double weightKg) {
        double removedVolume = grocery.getVolumePerKg() * weightKg;

        if (currentVolume - removedVolume < 0) {
            System.out.println("Cannot remove grocery depot volume cannot be negative.");
            return;
        }

        currentVolume -= removedVolume;
        System.out.println("Grocery was removed from the depot.");
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public double getFreeVolume() {
        return maxVolume - currentVolume;
    }

    public void printInfo() {
        System.out.println("Max volume: " + maxVolume);
        System.out.println("Current occupied volume: " + currentVolume);
        System.out.println("Free volume: " + getFreeVolume());
    }
}
