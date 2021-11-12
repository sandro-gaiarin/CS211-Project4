/**
 * Abstract class, subclass of Media. Represents different types of music.
 * Overrides constructor and toString() methods, and provides implementation for compareTo().
 * @version 0.9
 * @author Alessandro Gaiarin
 */

public abstract class Music extends Media{

    private String artist;
    private String title;
    private int year;


    /**
     * Constructor.
     * @param format sent to superclass
     * @param isbn sent to superclass
     * @param genre sent to superclass
     * @param artist String, represents musical artist
     * @param title String, represents title of album or single
     * @param year Int, represents year music was released
     */
    public Music(Format format, String isbn, String genre, String artist, String title, int year) {
        super(format, isbn, genre);
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    //Getters:
    public final String getArtist() {return artist;}
    public final String getTitle() {return title;}
    public final int getYear() {return year;}

    /**
     * Returns string of information on the music. Makes use of the superclass's toString() method.
     * @return String of information on the music, including the artist, year, and title
     * @see Media#toString()
     */
    public String toString() {
        String returnString = ("Artist: " + getArtist() + ", Year: " + getYear() + ", Title: " + getTitle() + ", ");
        returnString = returnString.concat(super.toString());
        return returnString;
    }

    /**
     * In short, sorts this object with arg Media object. See comments within code.
     * @param mediaObj object that this.Music is being sorted against
     * @return an int value, representing whether this.Music goes first, second, or matches the comparator.
     */
    public int compareTo(Media mediaObj) {
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
        if (compareVal != 0) {
            return compareVal;
        }
        //Compare the titles, using the String version of compareTo() again.
        compareVal = getTitle().compareTo(((Music) mediaObj).getTitle());
        return compareVal; //we just return at the end, because title is the last thing to sort by
    }

}
