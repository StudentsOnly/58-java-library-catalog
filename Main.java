import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        LibraryCatalog catalog = new LibraryCatalog();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter book index: ");
            String input = scanner.nextLine().trim();

            int index = Integer.parseInt(input);
            String bookTitle = catalog.searchBook(index);
            System.out.println("Book title: " + bookTitle + " at index: " + index);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format for index. " + e.getMessage());
        } catch (IllegalStateException | NoSuchElementException e) {
            System.out.println("Input error. " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}
