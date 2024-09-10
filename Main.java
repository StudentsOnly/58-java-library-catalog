import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LibraryCatalog catalog = new LibraryCatalog();

        while (true) {
            displayMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> catalog.displayBooks();
                case "2" -> handleBookSearch(scanner, catalog);
                case "3" -> {
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("\t________MENU________");
        System.out.println("\t1. Display Books");
        System.out.println("\t2. Search Book");
        System.out.println("\t3. Exit.");
    }

    public static void handleBookSearch(Scanner scanner, LibraryCatalog catalog) {

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Insert an index: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                catalog.searchBook(index);
                validInput = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

}