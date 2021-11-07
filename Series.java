import java.util.ArrayList;
import java.util.List;

public class Series extends Media{
    private String title;
    private List<String> cast = new ArrayList<>();
    private List<String> episodes = new ArrayList<>();

    //Getters:
    protected final String getTitle() {return title;}
    protected final List<String> getCast() {return cast;} //TODO Check list getter
    protected final List<String> getEpisodes() {return episodes;} //TODO Check list getter

    public String getType() {return "Series";}

    //Constructor
    public Series(Format format, String isbn, String genre, String title, List<String> cast, List<String> episodes) {
        super(format, isbn, genre);
        this.title = title;
        this.cast.addAll(cast);
        this.episodes.addAll(episodes);
    }

    public String toString() {
        return ("Title: " + getTitle() + ", " + super.toString());
    }

    public int compareTo(Media mediaObj) {
        //Books and Movies before Series
        //Series are only sorted by title
        //REMEMBER: Negative value means this.Series is first, positive means argument is first, 0 means same spot
        int compareVal = 0;

        //Check object type
        if (!(mediaObj instanceof Series)) {
            if ((mediaObj instanceof Book) || (mediaObj instanceof Movie)) {
                return 1;
            }
            else {
                return -1;
            }
        }

        //Check if objects are identical
        if (equals(mediaObj)) {
            return compareVal;
        }

        //Check title
        compareVal = getTitle().compareTo(((Series) mediaObj).getTitle());
        return compareVal;
    }

}
