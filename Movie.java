import java.util.ArrayList;
import java.util.List;

/**
 * A child class of Media.
 * Represents movies.
 * @version 1.0
 * @author Alessandro Gaiarin
 */

public class Movie extends Media{
    private String title;
    private String director;
    private int year;
    /**
     * cast field is a list of strings, representing the cast of a film.
     */
    private List<String> cast = new ArrayList<>();

    //Getters:
    protected final String getTitle() {return title;}
    protected final String getDirector() {return director;}
    protected final int getYear() {return year;}
    protected final List<String> getCast() {return cast;}

    /**
     * Returns the type of media.
     * @return String, "Movie"
     */
    public String getType() {return "Movie";}

    /**
     * Constructor
     * @param format sent to superclass
     * @param isbn sent to superclass
     * @param genre sent to superclass
     * @param title String, Title of the movie
     * @param director String, Director of the movie
     * @param year Int, year the movie was released
     * @param cast List of strings, cast of the movie
     */
    public Movie(Format format, String isbn, String genre, String title, String director, int year, List<String> cast) {
        super(format, isbn, genre);
        this.title = title;
        this.director = director;
        this.year = year;
        this.cast.addAll(cast);
    }

    /**
     * Returns a string containing information about the movie.
     * @return String value, containing title, Year, and other information
     * @see Media#toString() called here
     */
    public String toString() {
        return ("Title: " + getTitle() + ", Year: " + getYear() + ", " + super.toString());
    }

    /**
     * @see Music#compareTo(Media) same basic concept used here
     * @param mediaObj
     * @return
     */
    public int compareTo(Media mediaObj) {
        //Books before Movies, Movies before everything else
        //Movies are sorted by title, then by year
        //REMEMBER: Negative value means this.Movie is first, positive means argument is first, 0 means they go in the same spot
        int compareVal = 0;

        //Check object type
        if (!(mediaObj instanceof Movie)) {
            if (mediaObj instanceof Book) {
                return 1;
            }
            else {
                return -1;
            }
        }

        //Check if the objects are identical
        if (equals(mediaObj)) {
            return compareVal;
        }

        //Check title
        compareVal = getTitle().compareTo(((Movie) mediaObj).getTitle());
        if (compareVal != 0) {
            return compareVal;
        }

        //Check year
        compareVal = ((Movie) mediaObj).getYear() - getYear();
        return compareVal;
    }

}
