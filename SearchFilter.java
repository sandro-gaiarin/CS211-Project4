public class SearchFilter implements MediaFilter{
    private String searchTerm;

    public SearchFilter(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    /**
     * Returns true if the label contains the searchTerm,
     * or if the searchTerm is in the string returned by the
     * toString method of the media item.
     * You may find the string method indexOf useful for this.
     * @param label
     * @return
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
