import java.lang.reflect.Array;

public class LibraryCatalog {

    private String[] book;

    public LibraryCatalog() {
        this.book = new String[]{"Book 1", "Book 2", "Book 3"};
    }

    public String searchBook(int index) {
        String bookTitle = null;
        try {
            bookTitle = book[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Book index not found.");
        }
        return bookTitle;
    }


}
