package week2.day1;

// Created class naming Library
public class Library {
//Define a method addBook(String bookTitle) with one input argument.
	String addBook (String bookTitle) 
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
//Define a method issueBook()
	void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {

//Create an object for the Library class in the main method:
	Library check = new Library();
	
//Call both methods using the object. Run the code to confirm the methods are executed
    check.addBook("Testleaf from Library") ;
	check.issueBook();
	
	}

}
