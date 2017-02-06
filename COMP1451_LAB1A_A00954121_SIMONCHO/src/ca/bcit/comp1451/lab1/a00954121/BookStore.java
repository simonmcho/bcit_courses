package ca.bcit.comp1451.lab1.a00954121;

import java.util.ArrayList;
import java.util.Iterator;

public class BookStore {
	private ArrayList<Book> books;
	private Book[] shelfOfBooks;
	
	//Constructor to create an object of this class
	public BookStore(Book book1, Book book2, Book book3, Book book4, Book book5) {
		
		books = new ArrayList<>();
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		shelfOfBooks = new Book[books.size()];
		
		for(int i = 0; i < shelfOfBooks.length; i++) {
			shelfOfBooks[i] = books.get(i);
		}
		
	}
	
	//display String title and getDate() data
	public void displayBooks() {
		Iterator<Book> it = books.iterator();
		
		System.out.println("All the books in the ArrayList:");
		while(it.hasNext()) {
			Book b = it.next();
 			
			System.out.println("Title: " + b.getTitle() 
							  + ". Published: " 
							  + b.getDatePublished() + ".");
		} 
		
		System.out.printf("\n");
		System.out.println("All the books in the array:");
		for(Book book : shelfOfBooks) {
			System.out.println("Title: " + book.getTitle()
							  + ". Published: "
							  + book.getDatePublished() + ".");
		}
	}
}
