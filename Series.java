import java.util.ArrayList;
import java.util.List;

/**
 * Child class of Media. Represents TV series.
 * @version 0.9
 * @author Alessandro Gaiarin
 */
public class Series extends Media{
    private String title;
    /**
     * List of cast members
     */
    private List<String> cast = new ArrayList<>();
    /**
     * List of episodes
     */
    private List<String> episodes = new ArrayList<>();

    //Getters:
    protected final String getTitle() {return title;}
    protected final List<String> getCast() {return cast;} //TODO Check list getter
    protected final List<String> getEpisodes() {return episodes;} //TODO Check list getter

    /**
     * Type of media
     * @return String, "Series"
     */
    public String getType() {return "Series";}

    /**
     * Constructor.
     * @param format sent to superclass
     * @param isbn sent to superclass
     * @param genre sent to superclass
     * @param title Title of the TV series
     * @param cast List of Strings, cast of the series
     * @param episodes List of strings, episodes of the series
     */
    public Series(Format format, String isbn, String genre, String title, List<String> cast, List<String> episodes) {
        super(format, isbn, genre);
        this.title = title;
        this.cast.addAll(cast);
        this.episodes.addAll(episodes);
    }

    /**
     * Returns a string with information about the media
     * @return returns Title, along with other information.
     * @see Media#toString()
     */
    public String toString() {
        return ("Title: " + getTitle() + ", " + super.toString());
    }

    /**
     * @see Music#compareTo(Media)
     * @param mediaObj a media object to be compared to.
     * @return
     */
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
