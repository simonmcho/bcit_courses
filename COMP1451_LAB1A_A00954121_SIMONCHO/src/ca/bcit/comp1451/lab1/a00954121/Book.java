package ca.bcit.comp1451.lab1.a00954121;

public class Book {
	
	private String title;
	private Date   datePublished;
	
	//Constructor to create objects for this class
	public Book(String title, Date datePublished) {
		if(title == "") {
			System.out.println("No title entered, default title of 'No Name Book' will be named.");
			this.title = "No Name Book";
		} else {
			this.title = title;
		}
		
		if(datePublished == null) {
			System.out.println("No Date Object entered, setting default date of "
					   		   + "1337-01-01.");
			this.datePublished = new Date(1337, 1, 1);
		} else if(!(datePublished instanceof Date)) {
			System.out.println("The value entered is not an instance of Date Object! "
					           + "Setting default date of 1337-01-01.");
			this.datePublished = new Date(1337, 1, 1);
		} else {
			this.datePublished = datePublished;
		}
	}
	
	/*
	 * 2nd Constructor to create objects for this class with parameters for Date class
	 * Using 2nd constructor to "use" 1st constructor to instantiate an object of the class Book
	 */
	public Book(String title, int year, int month, int day) {
		this(title, new Date(year, month, day));
	}
	
	//getter for String title
	public String getTitle() {
		return title;
	}

	//setter for String title
	public void setTitle(String title) {
		if(title == "") {
			System.out.println("No title entered for the setter method 'setTitle(String title)', " 
							  + "default title of 'No Name Book' will be named.");
			this.title = "No Name Book";
		} else {
			this.title = title;
		}
	}

	//getter for Date datePublished
	public String getDatePublished() {
		return datePublished.getDate();
	}

	//setter for Date datePublished
	public void setDatePublished(Date datePublished) {
		if(datePublished == null) {
			System.out.println("No Date Object entered for the setter method 'setDatePublished(Date datePublished), " 
							   + "setting default date of 1337-01-01.");
			this.datePublished = new Date(1337, 1, 1);
		} else if(!(datePublished instanceof Date)) {
			System.out.println("The value entered is not an instance of Date Object! "
					           + "Setting default date of 1337-01-01.");
			this.datePublished = new Date(1337, 1, 1);
		} else {
			this.datePublished = datePublished;
		}
	}
}
