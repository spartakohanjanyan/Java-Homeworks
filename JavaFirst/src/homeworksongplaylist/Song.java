package homeworksongplaylist;

public class Song {
    private String artist;
    private String title;
    private String releaseDate; // dd:mm:yyyy

    public Song(String artist, String title, String releaseDate) {
        this.artist = artist;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Song song = (Song) obj;

        return title.equals(song.title) && artist.equals(song.artist);
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
