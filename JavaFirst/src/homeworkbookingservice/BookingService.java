package homeworkbookingservice;

class BookingService {

    private Room[] rooms;

    public BookingService(Room[] rooms) {
        this.rooms = rooms;
    }

    public void bookRoom(Guest g, Room r)
            throws RoomUnavailableException, UnderAgeException {

        if (g.getAge() < 18) {
            throw new UnderAgeException("Guest is under 18");
        }

        if (r.isAvailable()) {
            r.setAvailable(false);
            System.out.println("Room " + r.getRoomNumber() + " booked");
            return;
        }

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isAvailable()) {
                rooms[i].setAvailable(false);
                System.out.println("Requested room unavailable");
                System.out.println("Another room " + rooms[i].getRoomNumber() + " booked");
                return;
            }
        }

        throw new RoomUnavailableException("No rooms available!");
    }
}