package homework33126;

class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super("Square", color);
        this.side = side;
    }

    @Override
    public int getPerimeter() {
        return (int)(4 * side);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
