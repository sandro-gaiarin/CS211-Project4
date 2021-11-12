/**
 * Child class of Media. Represents books.
 * @version 1.0
 * @author Alessandro Gaiarin
 */
public class Book extends Media{
    private String title;
    private String author;
    private String publisher;

    //Getters:
    protected final String getTitle() {return title;}
    protected final String getAuthor() {return author;}
    protected final String getPublisher() {return publisher;}

    /**
     * Returns type of media
     * @return String, "Book"
     */
    public String getType() {return "Book";}

    /**
     * Constructor.
     * @param format sent to superclass
     * @param isbn sent to superclass
     * @param genre sent to superclass
     * @param author  Author of the book (field)
     * @param title Title of the book (field)
     * @param publisher Publisher of the book (field)
     */
    public Book(Format format, String isbn, String genre, String author, String title, String publisher) {
        super(format, isbn, genre);
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }

    /**
     * Returns string containing information on this piece of media.
     * @return Title, Author, and other pertinent information.
     * @see Media#toString()
     */
    public String toString() {
        return ("Title: " + getTitle() + ", Author: " + getAuthor() + ", " + super.toString());
    }

    /**
     * @see Music#compareTo(Media)
     * @param mediaObj
     * @return
     */
    public int compareTo(Media mediaObj) {
        //Books before everything (ay, this is true facts)
        //Books are sorted first by Author, then by Title
        //REMEMBER: Negative value means this.Book is first, positive means argument is first, 0 means same spot
        int compareVal = 0;

        //Check object type
        if (!(mediaObj instanceof Book)) {
            return -1;
        }

        //Check if objects are identical
        if (equals(mediaObj)) {
            return compareVal;
        }

        //Check author
        compareVal = getAuthor().compareTo(((Book) mediaObj).getAuthor());
        if (compareVal != 0) {
            return compareVal;
        }

        //Check title
        compareVal = getTitle().compareTo(((Book) mediaObj).getTitle());
        return compareVal;
    }
}
