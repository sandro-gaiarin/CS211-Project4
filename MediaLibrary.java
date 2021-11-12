import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Library of media items.
 * @version 1.0
 * @author Alessandro Gaiarin
 */
public class MediaLibrary {
    /**
     * List of Label<String,Media> objects, representing contents of the media library.
     */
    List<Label<String, Media>> library;

    /**
     * Default Constructor. Initializes the library.
     */
    public MediaLibrary() {
        this.library = new ArrayList<>();
    }


    /**
     * Adds new media to the library list by creating a new Label object, then adding it to the list.
     * If matching media is already in the library, the MediaAlreadyInLibrary exception is thrown.
     * @param name Name of the media, String
     * @param media The actual media object
     * @throws MediaAlreadyInLibrary
     * @see Label
     */
    public void add(String name, Media media) throws MediaAlreadyInLibrary {
        Label<String, Media> newLabel = new Label<>(name, media);
        
        for (int i = 0; i < library.size(); ++i) {
            if (newLabel.equals(library.get(i))) {
                throw new MediaAlreadyInLibrary(name, media);
            }
        }
        library.add(newLabel);
    }

    /**
     * Creates and returns a new list of labeled media items, based on what's being searched for.
     * @param mediaFilter MediaFilter object. Should be something other than MediaFilter itself, as MF is an inteface. Also provides the search term in creation.
     * @return A list of media objects that match the search term given in mediaFilter.
     * @see SearchFilter#matches(Label)
     */
    public List<Label<String, Media>> filter(MediaFilter mediaFilter) {
        List<Label<String, Media>> returnList = new ArrayList<>();

        for (int i = 0; i < library.size(); ++i) {
            if (mediaFilter.matches(library.get(i))) {
                returnList.add(library.get(i));
            }
        }
        return returnList;
    }


    public void sort() {
        Collections.sort(library);
    }

} //sorry my commenting wasn't as good this project as it has been in the past. I'll do better next time.
