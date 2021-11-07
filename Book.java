
public class Book extends Media{
    private String title;
    private String author;
    private String publisher;

    //Getters:
    protected final String getTitle() {return title;}
    protected final String getAuthor() {return author;}
    protected final String getPublisher() {return publisher;}

    public String getType() {return "Book";}

    //Constructor:
    public Book(Format format, String isbn, String genre, String author, String title, String publisher) {
        super(format, isbn, genre);
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }

    public String toString() {
        return ("Title: " + getTitle() + ", Author: " + getAuthor() + ", " + super.toString());
    }

    public int compareTo(Media mediaObj) {
        //Books before everything (ay, this is true facts)
        //Books are sorted first by Author, then by Title
        //REMEMBER: Negative value means this.Book is first, positive means argument is first, 0 means same spot
        //TODO: I wonder if I actually have to check the object type?

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
