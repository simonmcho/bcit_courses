package ca.bcit.comp1451.lab1.a00954121;

public class Main {

	public static void main(String[] args) {
			
		//tester for study purposes
		if(args.length == 0) {
			System.out.println("No argument entered by the user. PSVM Test complete.");
		} else {
			System.out.println("PSVM Test commencing using a for-each loop.");
			for(String str : args) {
				System.out.println(str);
			}
			System.out.println("PVSM Test complete.");
		}
		System.out.printf("\n");
		
		//Construcing an instance of Date class to use first constructor of the Date Class
		Date date1 = new Date(2010, 8, 6);
		
		//Constructing 5 new instances of the Book class
		Book book1 = new Book("Book1", 999, 3, 6);
		Book book2 = new Book("Book2", 1989, 1, 6);
		Book book3 = new Book("Book3", 1999, 5, 6);
		Book book4 = new Book("Book4", 2003, 11, 4);
		Book book5 = new Book("Book5", date1);		
		
		//Constructing a new instance of the Book class
		BookStore store1 = new BookStore(book1, book2, book3, book4, book5);
		//Displaying the books that are in the instance "store1" of Book Object
		store1.displayBooks();
	}
}
