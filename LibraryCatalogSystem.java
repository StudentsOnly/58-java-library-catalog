import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryCatalogSystem {
    public static void main(String[] args) {

        LibraryCatalog catalog = new LibraryCatalog();
        catalog.displayCatalog();

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                try {
                    System.out.print("Please enter the book index to search (1-5) or 0 to exit: ");

                    int index = scanner.nextInt();

                    if (index == 0) {
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    }

                    if (index < 1 || index > 5) {
                        System.out.println("Invalid index. Please enter a number between 1 and 5.");
                        continue;
                    }

                    index--;

                    String result = catalog.searchBook(index);
                    System.out.println(result);

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.nextLine();
                } catch (Exception e) {
                    // Catch any other unexpected exceptions
                    System.out.println("An unexpected error occurred: " + e.getMessage());
                }
            }
        }
    }
}
