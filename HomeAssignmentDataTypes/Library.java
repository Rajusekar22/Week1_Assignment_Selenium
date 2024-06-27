package week1.HomeAssignmentDataTypes;

public class Library {

	public String addBook(String bookName) {
				System.out.println(bookName+" is added successfully");
	return bookName;
	}
	public void issueBook() {
		System.out.println("Book is issued successfully");
	}
public static void main(String[] args) {
	Library bookDetails=new Library();
	bookDetails.addBook("HarryPotter");
	bookDetails.issueBook();
}
}

