public class LibraryCatalog {

    private String[] bookTitles;

    public LibraryCatalog(String[] bookTittles){
        this.bookTitles = bookTittles;
    }
    public String[] getBookTitles(){
        return bookTitles;
    }

    public String searchBook(int index){
        if(index < 0 || index >= bookTitles.length){
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        return bookTitles[index];
    }
}
