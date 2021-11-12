/**
 * Exception. For when two or more labeled media items with the same
 * ISBN are added to the media library.
 * @version 0.1
 * @author Alessandro Gaiarin
 */

public class MediaAlreadyInLibrary extends Exception{
    private String name;
    private Media media; //reference to duplicate media item

    //Getters:
    public String getName() {return name;}
    public Media getMedia() {return media;}

    //Constructor:
    public MediaAlreadyInLibrary(String name, Media media) {
        super("Media already in libary.");
        this.name = name;
        this.media = media;
    }

}
