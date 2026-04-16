package homework4426;

class SquareTable extends Table {
    private double side;

    public SquareTable(int legCount, String legMaterial, String topMaterial, double side) {
        super(legCount, legMaterial, topMaterial);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
