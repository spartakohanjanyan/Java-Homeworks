package homeworkmaxhouse;

public class House implements Comparable<House> {

    private String address;
    private double area;

    public House(String address, double area) {
        this.address = address;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(House other) {

        if (this.area > other.area) {
            return 1;
        }

        if (this.area < other.area) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return address + " - " + area + " m2";
    }
}
