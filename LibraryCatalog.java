import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private ArrayList<String> books;

    public LibraryCatalog() {
        this.books = new ArrayList<>();
        this.books.addAll(List.of(
                "Book 1",
                "Book 2",
                "Book 3",
                "Book 4"
        ));

    }

    public String searchBook(int index) throws IndexOutOfBoundsException {
        return books.get(index);
    }
}
