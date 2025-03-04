package week1.day2;

public class Library {

  
    public String addBook(String bookTitle) {
        System.out.println("Book added successfully");
        return bookTitle; // Returning the book title
    }


    public void issueBook() {
        System.out.println("Book issued successfully");
    }

    public static void main(String[] args) {

        Library library = new Library();
        String book = library.addBook("Java Programming");
        System.out.println("Added Book: " + book);

        library.issueBook();
    }
}
