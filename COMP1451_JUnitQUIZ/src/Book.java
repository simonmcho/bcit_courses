
public class Book {
	
	private int    year;
	private String title;
	private String firstName;
	private String lastName;
	private static final String DRACULA_DETAILS = "DRACULA WAS PUBLISHED BY BRAM STOKER IN 1986!";
	private static final String PERSUASION_DETAILS = "PERSUASION WAS PUBLISHED BY JANE AUSTEN IN 2003!";
	public static final String FIRST_BOOK_PUBLISHED_YEAR = "1455";
	
	public Book(int year, String title, String firstName, String lastName) {
		this.year = year;
		this.title = title.substring(0, 1).toUpperCase() + title.substring(1).toLowerCase();
		this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
	}
	
	public static String getActivity() {
		return "Reading";
	}
	
	public String getAuthorInitials() {
		String initials;
		initials = firstName.charAt(0) + "." + lastName.charAt(0) + ".";
		return initials;
	}
	
	public String getAuthorFirstName() {
		return firstName;
	}
	
	public String getAuthorLastName() {
		String lName;
		lName = lastName.substring(0, lastName.length() - 1).toLowerCase() + 
				lastName.substring(lastName.length() -1 ).toUpperCase();
		System.out.println(lName);
		return lName;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getYearPublished() {
		return year;
	}
	
	public String getDetails() {
		if(title.equalsIgnoreCase("dracula")) {
			return DRACULA_DETAILS;
		} else {
			return PERSUASION_DETAILS;
		}
	}
	
}
