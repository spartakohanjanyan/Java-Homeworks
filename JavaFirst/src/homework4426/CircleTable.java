package homework4426;

class CircleTable extends Table {
    private double radius;

    public CircleTable(int legCount, String legMaterial, String topMaterial, double radius) {
        super(legCount, legMaterial, topMaterial);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}
