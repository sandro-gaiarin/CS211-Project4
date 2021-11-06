public class Single extends Music{

    public String getType() {
        return ("Single");
    }

    public Single(Format format, String isbn, String genre, String artist, String title, int year) {
        super(format, isbn, genre, artist, title, year);
    }
}
