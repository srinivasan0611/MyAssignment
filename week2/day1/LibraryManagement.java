package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
//Create an object for the Library class in the main method of LibraryManagement
 
	Library check = new Library();

//Call both methods of the Library class from LibraryManagement and execute.
    check.addBook("Testleaf from LibraryManagement") ;
	check.issueBook();
	}

}
