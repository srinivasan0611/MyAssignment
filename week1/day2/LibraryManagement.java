package week1.day2;


	public class LibraryManagement {

	    public static void main(String[] args) {
	        Library library = new Library();

	        String book = library.addBook("Data Structures");
	        System.out.println("Added Book from LibraryManagement: " + book);

	        library.issueBook();
	    }
	}
