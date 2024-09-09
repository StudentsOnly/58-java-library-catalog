## Exercise: Handling ArrayIndexOutOfBoundsException in a Library Catalog System

#### Description:

- Create a Java program that simulates a Library Catalog System.
- The program allows users to search for books by entering an index, but there are potential issues related to array indices and ArrayIndexOutOfBoundsException that need to be addressed.

- Your task is to implement the program by following the provided instructions, including creating classes, methods, and handling potential ArrayIndexOutOfBoundsExceptions gracefully.

#### Instructions:

1.	Create a Java class named LibraryCatalog with the following attributes:
      -	An array of book titles to store the titles of books in the library.
2.	In the LibraryCatalog class, add a constructor that initializes the bookTitles array with some book titles of your choice (e.g., "Book 1", "Book 2", "Book 3").
3.	Create a method named searchBook(int index) in the LibraryCatalog class. This method should accept an index and return the title of the book at that index. However, handle potential ArrayIndexOutOfBoundsException gracefully in this method.
4.	Create a Java program that demonstrates the functionality of the Library Catalog System. Allow users to search for books by entering an index.
5.	Ensure that the program handles ArrayIndexOutOfBoundsException gracefully by displaying an error message when an invalid index is entered.
