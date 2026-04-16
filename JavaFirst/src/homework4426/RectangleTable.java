package homework4426;

class RectangleTable extends Table {
    protected double length;
    protected double width;

    public RectangleTable(int legCount, String legMaterial, String topMaterial, double length, double width) {
        super(legCount, legMaterial, topMaterial);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
