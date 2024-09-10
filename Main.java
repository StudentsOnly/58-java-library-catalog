import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] books = {"The Heiress", "Don't Want You Like a Best Friend", "The Atlas Complex", "The Fury", "Come and Get It"};

        String title = null;
        LibraryCatalog catalog = new LibraryCatalog(books);
        // Scanner scan = new Scanner(System.in);
        int input = -1;
        while (input == -1 || title == null) {
            input = inputValidator();
            if(input != -1) {
                try {

                    title = catalog.searchBook(input);
                    System.out.println("Book: '" + title + "'");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Index should be (0 - " + (catalog.getBookTitles().length - 1) + ")!");
                    title = null;
                }
            }
        }
    }
        public static int inputValidator () {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter index to find the book:");
            try {
                int input = Integer.valueOf(scan.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Input should be a number");
                return -1;
            }
        }

    }

