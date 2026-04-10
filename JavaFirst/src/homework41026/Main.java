package homework41026;

public class Main {
    public static void main(String[] args) {
        House house = new House(4, 120.5);
        Apartment apartment = new Apartment(2, 55.0, 3);

        house.updateRoomCount(5);
        house.updateRoomCount(3);
        house.updateRoomCount(6);

        house.setCeilingHeight(3.2);
        house.setCeilingHeight(3.5);
        house.openGates();
        house.setHasBalcony(true);
        house.setHasBalcony(true);

        ResidentialBuilding[] buildings = {house, apartment};

        for (ResidentialBuilding building : buildings) {
            building.switchLights(false);
        }
    }
}
