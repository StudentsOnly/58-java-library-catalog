import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LibraryCatalog library = new LibraryCatalog();

        while (true) {
            int index;
            System.out.println("Enter book's index");
            try {
                index = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Can't cast to number: " + e.getMessage());
                continue;
            }
            try {
                System.out.println(library.searchBook(index));
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
