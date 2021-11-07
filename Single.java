/**
 * Subclass of Music. Overrides constructor and getType().
 * @version 0.1
 * @author Alessandro Gaiarin
 */

//TODO:
// Commenting, I guess. There isn't much to do for this one.

public class Single extends Music{

    public String getType() {
        return ("Single");
    }

    public Single(Format format, String isbn, String genre, String artist, String title, int year) {
        super(format, isbn, genre, artist, title, year);
    }
}
