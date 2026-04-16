package homework4426;

public class FoldingRectangleTable extends RectangleTable {

    private double extraArea;

    public FoldingRectangleTable(int legsCount, String legsMaterial, String topMaterial,
                                 double length, double width, double extraArea) {
        super(legsCount, legsMaterial, topMaterial, length, width);
        this.extraArea = extraArea;
    }

    public double getExtraArea() {
        return extraArea;
    }

    public double getExtendedArea() {
        return calculateArea() + extraArea;
    }
}