import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Subclass of Music.
 * Overrides constructor, getType(), and toString() methods.
 * @version 0.1
 * @author Alessandro Gaiarin
 */

//TODO:
// trackList; learn how lists work in java
// compareTo() in Music needs to be finished before Album will function properly

public class Album extends Music{
    /**
     * trackList is a list of strings representing tracks on an album.
     * May refer to an ArrayList or LinkedList, but getter should
     * be interface type List with the appropriate type specifier.
     */
    List<String> trackList;

    protected final List<String> getTrackList() { //TODO: Check this, especially with stuff like ArrayLists or LinkedLists
        return trackList;
    }

    public String getType() {
        return ("Album");
    }

    public Album(Format format, String isbn, String genre, String artist, String title, int year, List trackList) {
        super(format, isbn, genre, artist, title, year);
        this.trackList = trackList; //this probably won't work; see below:
        //should be added to the private data member using addAll(...)

    }

    @Override
    public String toString() {
        return ((super.toString()).concat(", Tracks: " + trackList));
    }

}
