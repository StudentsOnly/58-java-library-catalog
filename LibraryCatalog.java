import java.util.ArrayList;

public class LibraryCatalog {

    ArrayList<Book> bookTitles;

    public LibraryCatalog() {
        this.bookTitles = new ArrayList<>();
        bookTitles.add(new Book("Book 1"));
        bookTitles.add(new Book("Book 2"));
        bookTitles.add(new Book("Book 3"));

    }

    public void displayBooks() {
        System.out.println("==== Library Catalog ====");
        for (int i = 0; i < bookTitles.size(); i++) {
            System.out.println((i + 1) + ": " + bookTitles.get(i).getTitle());
        }
    }

    public void searchBook(int index) throws ArrayIndexOutOfBoundsException {
        index--;
        if (index < 0 || index >= bookTitles.size()) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: No such book in the catalog.");
        }

        Book book = bookTitles.get(index);
        System.out.println("Book found: " + book.getTitle());
    }
}

