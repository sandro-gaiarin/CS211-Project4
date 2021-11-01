/**
 * Abstract class, represents different kinds of media.
 * All of the media in the media library will be subclasses of this class.
 * Should implement Comparable interface, and specify generic type for that interface so that Media
 * can be compared to other Media. The details of the compareTo() method should be
 * left to the subclasses.
 * @version 0.1
 * @author Alessandro Gaiarin
 */

public abstract class Media implements Comparable {
    private String isbn; //shout have a getter (final), but no setter
    private String genre; //should have a getter (final), but no setter
    private Format format; //instance of the Format enum

    abstract String getType(); //method that will return a string representing the type of media; leave it to subclasses

    public Media (Format format, String isbn, String genre) { //Constructor. Didn't make this abstract, maybe I should? idk
        this.format = format;
        this.isbn = isbn;
        this.genre = genre;
    }

    public boolean equals (Object obj) {
        //Overrides parent class version to return true if the given
        // object is also a media item, and their ISBNs match.
        // Otherwise, return false.
        //
        // I'm really not sure how to do this one right now.
        // **I think this is where the Comparable interface comes into play!**
    }

    protected final String getIsbn() { //getter
        return isbn;
    }

    protected final String getGenre() { //getter
        return genre;
    }

    protected final Format format() { //getter
        return format;
    }

    /**
     * String representation of media.
     * @return "Type: type, ISBN: isbn, Genre: genre, Format: format". Use getType() for Type.
     */
    abstract String toString(); //



}