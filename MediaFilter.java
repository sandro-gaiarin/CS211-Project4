/**
 * Interface, creates the "matches" method.
 * @version 1.0
 * @author Alessandro Gaiarin
 */
public interface MediaFilter {
    boolean matches(Label<String, Media> label);
}
