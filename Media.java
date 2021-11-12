/**
 * Abstract class, represents different kinds of media.
 * All media in the media library will be subclasses of this class.
 * Should implement Comparable interface, and specify generic type for that interface so that Media
 * can be compared to other Media. The details of the compareTo() method should be
 * left to the subclasses.
 * @version 1.0
 * @author Alessandro Gaiarin
 */

public abstract class Media implements Comparable<Media> {
    /**
     * isbn: String, represents ISBN of this media item.
     */
    private String isbn; //shout have a getter (final), but no setter
    /**
     * genre: String, represents genre of this media item
     */
    private String genre; //should have a getter (final), but no setter
    /**
     * format: the format of this media item.
     * @see Format
     */
    private Format format; //instance of the Format enum


    /**
     * Abstract; Method that'll return a string representing the type of media.
     * @return string, type of media
     */
    abstract String getType(); //method that will return a string representing the type of media; leave it to subclasses


    /**
     * Constructor
     * @param format Format enum, format of this media item
     * @param isbn ISBN of this media item
     * @param genre Genre of this media item
     */
    public Media (Format format, String isbn, String genre) { //Constructor. Didn't make this abstract, maybe I should? idk
        this.format = format;
        this.isbn = isbn;
        this.genre = genre;
    }


    /**
     * Checks if given object is a media object, and if said object's ISBN
     * matches this one
     * @param obj Object, being checked against this current class
     * @return Boolean value, true if the objects are both instances of Media and have matching ISBNs.
     */
    public boolean equals (Object obj) { //TODO: Make sure the use of "Object" here is correct.
        //check if given object is a Media object, and then checks if the object has a matching ISBN
        if ((obj instanceof Media) && ((Media) obj).getIsbn().equals(isbn)) {
            //might want to split the above if statement into two different if statements
            return true;
        }
        return false;
    }

    /**
     * Getters for fields:
     */
    public final String getIsbn() {return isbn;}
    public final String getGenre() {return genre;}
    public final Format getFormat() {return format;}

    /**
     * String representation of media. Overrides Object method.
     * @return "Type: type, ISBN: isbn, Genre: genre, Format: format". Use getType() for Type.
     */
    public String toString() {
        return ("Type: " + getType() + ", ISBN: " + getIsbn() + ", Genre: " + getGenre() + ", Format: " + getFormat());
    }
}