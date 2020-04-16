package majewski.mateusz;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    String albumName;
    SongList songList = new SongList();

    public Album(String name) {
        this.albumName = name;
    }

    public void addNewSong(String title, double duration) {
        songList.addNewSong(title, duration);
    }

    public String getAlbumName() {
        return albumName;
    }

    public static Album createAlbum(String albumName) {
        return new Album(albumName);
    }

    public boolean addToPlaylist(LinkedList<Song> playlist, String songTitle){
        Song checkedSong = songList.findSong(songTitle);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("Song " + songTitle + " is not in the album");
        return false;
    }

    private class SongList {
        private ArrayList<Song> songList;

        public SongList() {
            songList = new ArrayList<Song>();
        }

        public boolean addNewSong(String song, double duration) {
            if(findSong(song) == null) {
                songList.add(new Song(song, duration));
                System.out.println(song + " was added to the list");
                return true;
            }
            System.out.println("Adding " + song + " failed.");
            return false;
        }

        private Song findSong(String song) {
            for (int i = 0; i < songList.size(); i++) {
                Song existingSong = songList.get(i);
                if (existingSong.getTitle().equals(song)) {
                    return existingSong;
                }
            }
            return null;
        }

    }
}
