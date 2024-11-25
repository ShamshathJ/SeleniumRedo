package HomeAssignmentsWeek2Day1;

public class Library {

	
	
	public String addBook(String bookTitle) {
		System.out.println("Book added Successfully");		
		return (bookTitle);
	}
	public void issueBook() {
		System.out.println("Book Issued Successfully");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		String name = lib.addBook("IKIGAI");	
		System.out.println(name);
		lib.issueBook();

	}

}
