import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
    private String title;
    private String director;
    private int year;
    private List<String> cast = new ArrayList<>();

    //Getters:
    protected final String getTitle() {return title;}
    protected final String getDirector() {return director;}
    protected final int getYear() {return year;}
    protected final List<String> getCast() {return cast;} //TODO: Check this one

    public String getType() {return "Movie";}

    public Movie(Format format, String isbn, String genre, String title, String director, int year, List<String> cast) {
        super(format, isbn, genre);
        this.title = title;
        this.director = director;
        this.year = year;
        this.cast.addAll(cast); //TODO: Test this
    }

    public String toString() {
        return ("Title: " + getTitle() + ", Year: " + getYear() + ", " + super.toString());
    }

    public int compareTo(Media mediaObj) {
        //Books before Movies, Movies before everything else
        //Movies are sorted by title, then by year
        //REMEMBER: Negative value means this.Movie is first, positive means argument is first, 0 means they go in the same spot
        int compareVal = 0;

        //Check object type
        if (!(mediaObj instanceof Movie)) {
            if (mediaObj instanceof Book) { //TODO: Book doesn't exist yet
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
        //TODO: Not sure if the answer here will work, check later
        return compareVal;

    }

}
