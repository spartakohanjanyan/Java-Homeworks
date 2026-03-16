package homework3326;

public class HouseClass {
    public static void main(String[] args){
        House house1 = new House(3, true, 1,
                     2, 95.8, "Yerevan, Tumanyan 18");

        House house2 = new House(house1);

        house2.setRoomsCount(5);
        house2.setLivingArea(140.0);

        house1.setRoomsCount(4);
        house2.getAddress();
        house1.printInfo();
        house2.printInfo();
    }
}
