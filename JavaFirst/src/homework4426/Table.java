package homework4426;

abstract class Table {
    protected int legCount;
    protected String legMaterial;
    protected String topMaterial;

    public Table(int legCount, String legMaterial, String topMaterial) {
        this.legCount = legCount;
        this.legMaterial = legMaterial;
        this.topMaterial = topMaterial;
    }

    public abstract double calculateArea();

    public void getInfo() {
        System.out.println("Legs: " + legCount + ", Leg Material: " + legMaterial + ", Top Material: " + topMaterial);
    }
}
