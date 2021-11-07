import java.util.Collections;

/**
 * Abstract class, subclass of Media. Represents different types of music.
 * Overrides constructor and toString() methods, and provides implementation for compareTo().
 * @version 0.1
 * @author Alessandro Gaiarin
 */

//TODO:
// Comments
// compareTo()
public abstract class Music extends Media{
    String artist;
    String title;
    int year;

    public Music(Format format, String isbn, String genre, String artist, String title, int year) {
        super(format, isbn, genre);
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    protected final String getArtist() {
        return artist;
    }
    protected final String getTitle() {
        return title;
    }
    protected final int getYear() {
        return year;
    }

    public String toString() {
        String returnString = ("Artist: " + getArtist() + ", Year: " + getYear() + ", Title: " + getTitle() + ", ");
        returnString = returnString.concat(super.toString());
        return returnString;
    }

    public int compareTo(Media mediaObj) { //TODO: Figure this out, nothing will work until you do
        //Music is sorted by artist, year, then title
        int compareVal = 0;

        //Checks if the object is an instance of Music. If it's not, then (this.Music) is ordered last automatically.
        if (!(mediaObj instanceof Music)) {
            return 1; //Positive return means (this.Music) is ordered last
        }

        //if the musicObject, passed through equals(), returns true, then it's identical with this.Music
        if (equals(mediaObj)) {
            return compareVal;
        }
        //Compare the artists, using the String version of compareTo()
        compareVal = getArtist().compareTo(((Music) mediaObj).getArtist());
        if (compareVal != 0) {
            return compareVal;
        }
        //Compare the years the music was released
        compareVal = ((Music) mediaObj).getYear() - getYear();
        //TODO: negative value means this.Music is ordered first. Not sure if the above is correct.
        if (compareVal != 0) {
            return compareVal;
        }
        //Compare the titles, using the String version of compareTo() again.
        compareVal = getTitle().compareTo(((Music) mediaObj).getTitle());
        return compareVal; //we just return at the end, because title is the last thing to sort by






    }

}
