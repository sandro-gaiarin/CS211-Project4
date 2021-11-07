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

public class Album extends Music{
    /**
     * trackList is a list of strings representing tracks on an album.
     * May refer to an ArrayList or LinkedList, but getter should
     * be interface type List with the appropriate type specifier.
     */
    private List<String> trackList;

    protected final List<String> getTrackList() { //TODO: Check this, especially with stuff like ArrayLists or LinkedLists
        return trackList;
    }

    public String getType() {
        return ("Album");
    }

    public Album(Format format, String isbn, String genre, String artist, String title, int year, List<String> trackList) {
        super(format, isbn, genre, artist, title, year);
        //this.trackList = trackList; //this probably won't work; see below:
        this.trackList.addAll(trackList); //TODO Test this

    }

    @Override
    public String toString() {
        return ((super.toString()).concat(", Tracks: " + getTrackList()));
    }

}
