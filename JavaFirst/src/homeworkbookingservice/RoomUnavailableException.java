package homeworkbookingservice;

class RoomUnavailableException extends Exception {
    public RoomUnavailableException(String message) {
        super(message);
    }
}