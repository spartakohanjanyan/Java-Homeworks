package homework41026;

class House extends ResidentialBuilding {
    public House(int roomCount, double area) {
        super(roomCount, area);
    }

    public void openGates() {
        System.out.println("The gates of the house opened");
    }
}
