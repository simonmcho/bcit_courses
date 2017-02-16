package ca.bcit.comp1451.simonmcho;

public class Person {
	private String  firstName;
	private String  lastName;
	private String  fullName;
	private int     birthYear;
	private boolean isMale;
	private String  gender;
	
	public Person(String fName, String lName, int birthYear, boolean isMale) {
		super();
		this.firstName = fName.substring(0, 1).toUpperCase() + 
						 fName.substring(1).toLowerCase();
		this.lastName = lName.substring(0, 1).toUpperCase() + 
						lName.substring(1).toLowerCase();
		this.fullName = firstName + " " + lastName;
		this.birthYear = birthYear;
		this.isMale = isMale;
		
		if(isMale) {
			this.gender = "He";
		} else {
			this.gender = "She";
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void printDetails() {
		System.out.println(fullName + " is a " + this.getClass().getSimpleName() + 
				           ". " + gender + " was born in " + birthYear + ".");
	}
	
}
