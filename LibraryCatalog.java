public class LibraryCatalog {

    private String[] bookTitles;

    public LibraryCatalog(String[] bookTittles){
        this.bookTitles = bookTittles;
    }
    public String[] getBookTitles(){
        return bookTitles;
    }

    public String searchBook(int index){
        try {
            return bookTitles[index];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
            return null;
        }
    }
}
