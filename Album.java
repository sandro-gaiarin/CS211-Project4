import java.util.ArrayList;
import java.util.List;
/**
 * Subclass of Music.
 * Overrides constructor, getType(), and toString() methods.
 * @version 0.9
 * @author Alessandro Gaiarin
 */

public class Album extends Music{
    /**
     * trackList is a list of strings representing tracks on an album.
     * May refer to an ArrayList or LinkedList.
     */
    private List<String> trackList = new ArrayList<>();

    /**
     * Returns the trackList.
     * @return List of strings
     */
    public final List<String> getTrackList() {return trackList;}

    /**
     * @return String, type of media ("Album")
     */
    public String getType() {
        return ("Album");
    }

    /**
     * Constructor
     * @param format Format enum, sent to super()
     * @param isbn String ISBN, sent to super()
     * @param genre String genre, sent to super()
     * @param artist String artist, sent to super()
     * @param title String title, sent to super()
     * @param year int year, sent to super()
     * @param trackList List of strings, track list, added to trackList
     */
    public Album(Format format, String isbn, String genre, String artist, String title, int year, List<String> trackList) {
        super(format, isbn, genre, artist, title, year);
        this.trackList.addAll(trackList);

    }

    /**
     * Returns a string of information on the album. Makes use of the superclass toString().
     * @return String of information on the album
     * @see Music#toString()
     */
    @Override
    public String toString() {
        return ((super.toString()).concat(", Tracks: " + getTrackList()));
    }

}
