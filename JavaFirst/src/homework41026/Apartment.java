package homework41026;


class Apartment extends ResidentialBuilding {
    private int floor;

    public Apartment(int roomCount, double area, int floor) {
        super(roomCount, area);
        if (floor > 5 || floor < 1) {
            System.out.println("The building consists of 5 floors");
        }
        this.floor = floor;
    }
}