package homeworksongplaylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // -------------------- Song objects creating --------------------
        Song song1 = new Song("Eminem", "Mockingbird", "25:04:2004");
        Song song2 = new Song("Eminem", "Lose Yourself", "28:10:2002");
        Song song3 = new Song("2Pac", "Changes", "13:10:1998");
        Song song4 = new Song("Imagine Dragons", "Believer", "01:02:2017");
        Song song5 = new Song("Another Artist", "Mockingbird", "10:05:2020");


        // -------------------- Playlist creating with ArrayList--------------------
        ArrayList<Song> arrayListSongs = new ArrayList<>();
        arrayListSongs.add(song1);
        arrayListSongs.add(song2);
        arrayListSongs.add(song3);

        Playlist playlist = new Playlist(arrayListSongs);

        System.out.println("Initial playlist:");
        System.out.println(playlist.getSongs());


        // -------------------- Song searching with title --------------------
        ArrayList<Song> foundSongs = playlist.findSongsByTitle("Mockingbird");

        System.out.println("Found songs by title 'Mockingbird':");
        System.out.println(foundSongs);


        // -------------------- play  --------------------
        System.out.println("Play song:");
        playlist.play(song1);

        System.out.println("Current song:");
        System.out.println(playlist.getCurrentSong());


        // -------------------- pause  --------------------
        System.out.println("Pause song:");
        playlist.pause();

        System.out.println("Current song after pause:");
        System.out.println(playlist.getCurrentSong());


        // -------------------- Add one song --------------------
        System.out.println("Add one song:");
        playlist.addSong(song4);

        System.out.println(playlist.getSongs());


        // -------------------- Remove one song --------------------
        System.out.println("Remove one song:");
        playlist.removeSong(song2);

        System.out.println(playlist.getSongs());


        // -------------------- Add an another song list ArrayList --------------------
        ArrayList<Song> anotherArrayList = new ArrayList<>();
        anotherArrayList.add(song5);
        anotherArrayList.add(new Song("50 Cent", "In Da Club", "07:01:2003"));

        System.out.println("Add another song list, ArrayList:");
        playlist.addSongs(anotherArrayList);

        System.out.println(playlist.getSongs());


        // --------------------  Add an another song list LinkedList --------------------
        LinkedList<Song> linkedListSongs = new LinkedList<>();
        linkedListSongs.add(new Song("Snoop Dogg", "Beautiful", "21:01:2003"));
        linkedListSongs.add(new Song("Dr. Dre", "Still D.R.E.", "13:10:1999"));

        System.out.println("Add another song list, LinkedList:");
        playlist.addSongs(linkedListSongs);

        System.out.println(playlist.getSongs());


        // -------------------- Playlist creating with LinkedList --------------------
        LinkedList<Song> secondList = new LinkedList<>();
        secondList.add(song1);
        secondList.add(song3);

        Playlist linkedPlaylist = new Playlist(secondList);

        System.out.println("Second playlist created with LinkedList:");
        System.out.println(linkedPlaylist.getSongs());


        // -------------------- play--------------------
        System.out.println("Try to play song which is not in playlist:");

        Song unknownSong = new Song("Unknown", "Unknown Song", "01:01:2000");

        try {
            playlist.play(unknownSong);
        } catch (NoSongInPlaylistException e) {
            System.out.println(e.getMessage());
        }
    }
}
