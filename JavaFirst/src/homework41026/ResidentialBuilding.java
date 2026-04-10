package homework41026;

abstract class ResidentialBuilding {
    private final double area;
    private int roomCount;
    private final int initialRoomCount;

    private Double ceilingHeight = null;
    private Boolean hasBalcony = null;

    public ResidentialBuilding(int roomCount, double area) {
        this.roomCount = roomCount;
        this.initialRoomCount = roomCount;
        this.area = area;
    }

    public void setCeilingHeight(double height) {
        if (this.ceilingHeight == null) {
            this.ceilingHeight = height;
        } else {
            System.out.println("Error: The ceiling value has already been specified");
        }
    }

    public void setHasBalcony(boolean hasBalcony) {
        if (this.hasBalcony == null) {
            this.hasBalcony = hasBalcony;
        } else {
            System.out.println("Error: Value has already been specified");
        }
    }

    public void updateRoomCount(int newCount) {
        int difference = newCount - initialRoomCount;

        if (difference == 1 || difference == -1 || difference == 0) {
            this.roomCount = newCount;
            System.out.println("Rooms count is " + this.roomCount);
        } else {
            System.out.println("Error: The difference from teh original should be 1 ");
        }
    }

    public void switchLights(boolean turnOn) {
        String state = turnOn ? "is on" : "is off";
        System.out.println("Lights " + state);
    }
}
