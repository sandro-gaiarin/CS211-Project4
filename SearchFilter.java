/**
 * Implements the MediaFilter interface.
 * Search-style of filter. Matches labeled media items with the searchTerm.
 * @version 1.0
 * @author Alessandro Gaiarin
 */
public class SearchFilter implements MediaFilter{
    private String searchTerm;

    /**
     * Constructor
     * @param searchTerm String, becomes field searchTerm. Term being used to search.
     */
    public SearchFilter(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    /**
     * Returns true if the label contains the searchTerm,
     * or if the searchTerm is in the string returned by the
     * toString method of the media item.
     * @param label Label<String, Media> item that's being checked
     * @return True if the searchTerm is contained in the Labeled Media item somewhere, otherwise false.
     */
    public boolean matches(Label<String, Media> label) {
        //remember, getKey() for the label's string,
        // getValue() for the label's Media object
        if ((label.getKey().indexOf(searchTerm, 0) != -1) || (
                label.getValue().toString().indexOf(searchTerm, 0) != -1)) {
            return true;
        }
        return false;
    }
}
