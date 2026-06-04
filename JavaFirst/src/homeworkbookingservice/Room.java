package homeworkbookingservice;

class Room {
    private int roomNumber;
    private boolean isAvailable;

    public Room(int roomNumber, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}