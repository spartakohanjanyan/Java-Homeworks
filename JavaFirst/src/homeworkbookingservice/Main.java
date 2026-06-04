package homeworkbookingservice;

public class Main {
    public static void main(String[] args) {

        Room[] rooms = {
                new Room(1, true),
                new Room(2, false),
                new Room(3, true)
        };

        Guest guest = new Guest(19);
        BookingService bookingService = new BookingService(rooms);

        try {
            bookingService.bookRoom(guest, rooms[0]);
        } catch (UnderAgeException e) {
            System.out.println("Error " + e.getMessage());
        } catch (RoomUnavailableException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}