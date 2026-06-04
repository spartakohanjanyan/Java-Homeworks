package homeworksongplaylist;

public class NoSongInPlaylistException extends RuntimeException {
    public NoSongInPlaylistException(String message) {
        super(message);
    }
}
