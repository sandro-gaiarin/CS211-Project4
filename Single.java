/**
 * Subclass of Music. Overrides constructor and getType().
 * @version 1.0
 * @author Alessandro Gaiarin
 */

public class Single extends Music{

    /**
     * Returns the type of Media this is.
     * @return String, returns "Single"
     */
    public String getType() {
        return ("Single");
    }

    /**
     * Constructor. All args in this constructor are simply sent to the superclass.
     * @param format
     * @param isbn
     * @param genre
     * @param artist
     * @param title
     * @param year
     */
    public Single(Format format, String isbn, String genre, String artist, String title, int year) {
        super(format, isbn, genre, artist, title, year);
    }
}
