/**
 * Abstract class, subclass of Media. Represents different types of music.
 * Overrides constructor and toString() methods, and provides implementation for compareTo().
 */
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

    

}
