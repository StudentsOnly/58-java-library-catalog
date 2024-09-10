import java.util.Scanner;

public class LibraryCatalogSystem {
    public static void main(String[] args) {

        LibraryCatalog catalog = new LibraryCatalog();

        catalog.displayCatalog();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter the book index to search (1-5): or 0 to exit: ");

            int index = scanner.nextInt();

            if (index == 0) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            index--;

            String result = catalog.searchBook(index);

            System.out.println(result);
        }
        scanner.close();
    }
}
