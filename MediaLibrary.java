import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaLibrary {

    List<Label<String, Media>> library;

    //Constructor, default. Initializes the library.
    public MediaLibrary() {
        this.library = new ArrayList<>();
    }

    //Supposed to add new media into the library list.
    // My error throwing here is probably way off, but it's
    // supposed to throw an error if there's already
    // matching media within the library. Check it later.
    public void add(String name, Media media) throws MediaAlreadyInLibrary {
        Label<String, Media> newLabel = new Label<>(name, media);
        
        for (int i = 0; i < library.size(); ++i) {
            if (newLabel.equals(library.get(i))) {
                throw new MediaAlreadyInLibrary(name, media);
            }
        }
        library.add(newLabel);
    }

    //Creates and returns a new list of labeled media items.
    // New list should contain all labeled media items from library
    // which MediaFilter's matches method returns true.
    public List<Label<String, Media>> filter(MediaFilter mediaFilter) { //TODO: Not sure if this arg is correct
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

}
