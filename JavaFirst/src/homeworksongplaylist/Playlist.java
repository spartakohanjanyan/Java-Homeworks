package homeworksongplaylist;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;
    private Song currentSong;

    public Playlist(List<Song> songs) {
        this.songs = songs;
        this.currentSong = null;
    }

    public ArrayList<Song> findSongsByTitle(String title) {
        ArrayList<Song> foundSongs = new ArrayList<>();

        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                foundSongs.add(song);
            }
        }

        return foundSongs;
    }

    public void play(Song song) {
        if (songs.contains(song)) {
            currentSong = song;
            System.out.println("Playing: " + song);
        } else {
            throw new NoSongInPlaylistException("Song is not in playlist");
        }
    }

    public Song getCurrentSong() {
        return currentSong;
    }

    public void pause() {
        if (currentSong != null) {
            System.out.println("Paused: " + currentSong);
            currentSong = null;
        }
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);

        if (currentSong != null && currentSong.equals(song)) {
            currentSong = null;
        }
    }

    public void addSongs(List<Song> newSongs) {
        songs.addAll(newSongs);
    }

    public List<Song> getSongs() {
        return songs;
    }
}
