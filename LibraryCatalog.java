class LibraryCatalog {
    private Book[] books;


    public LibraryCatalog() {
        // Initializing the books array with titles and authors
        books = new Book[] {
                new Book("The Discworld", "Terry Pratchett"),
                new Book("Myth Adventures", "Robert Lynn Asprin"),
                new Book("The Chronicles of Amber", "Roger Zelazny"),
                new Book("Astrobiologists", "Olga Gromyko"),
                new Book("Roadside Picnic", "Arkady Strugatsky")
        };
    }

        public String searchBook(int index) {
        try {
            Book book = books[index];
            return "Title: " + book.getTitle() + ", Author: " + book.getAuthor();
        } catch (ArrayIndexOutOfBoundsException e) {
             return "Error: Invalid index. Please enter a valid index between 0 and " + (books.length - 1) + ".";
        }
    }

        // Method to display the entire catalog of book
            //
    public void displayCatalog() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.length; i++) {

          System.out.println(i+1 + ": " + books[i].getTitle() + " by " + books[i].getAuthor());
        }
        System.out.println();
    }


}