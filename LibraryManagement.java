package HomeAssignmentsWeek2Day1;

public class LibraryManagement {

	public static void main(String[] args) {
		Library obj = new Library();
		String name1 =obj.addBook("Gravity");
		System.out.println(name1);
		obj.issueBook();
		
	}

}
