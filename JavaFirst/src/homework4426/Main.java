package homework4426;

public class Main {
    public static void main(String[] args) {
        SquareTable square = new SquareTable(4, "Wood", "MDF", 1.5);
        square.getInfo();
        System.out.println("Area " + square.calculateArea());

        CircleTable circle = new CircleTable(3, "Metal", "Plastic", 0.9);
        circle.getInfo();
        System.out.println("Area " + circle.calculateArea());

        RectangleTable rectangle = new RectangleTable(4, "Plastic", "Plastic", 2.0, 1.2);
        rectangle.getInfo();
        System.out.println("Area " + rectangle.calculateArea());

        FoldingRectangleTable foldingRectangleTable = new FoldingRectangleTable(4, "DSP", "Glass", 2.0, 1.0, 0.7);
        foldingRectangleTable.getInfo();
        System.out.println("Area " + foldingRectangleTable.calculateArea());
        System.out.println("Extra Area " + foldingRectangleTable.getExtraArea());
        System.out.println("Extended Area " + foldingRectangleTable.getExtendedArea());
    }
}
