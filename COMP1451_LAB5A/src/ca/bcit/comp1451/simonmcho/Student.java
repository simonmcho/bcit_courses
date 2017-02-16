package ca.bcit.comp1451.simonmcho;

public class Student extends Person{
	
	private String sNumber;
	private String major;
	private double gpa;
	
	public Student(String fName, String lName, int birthYear, boolean isMale, 
				   String sNumber, String major,double gpa) {
		
		super(fName, lName, birthYear, isMale);
		this.sNumber = sNumber;
		this.major = major.substring(0).toLowerCase();
		this.gpa = gpa;
	
	}

	public String getSNumber() {
		return sNumber;
	}

	public void setSNumber(String sNumber) {
		this.sNumber = sNumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void printDetails() {
		System.out.println(this.getFullName() + " is a " + this.getClass().getSimpleName() + 
					 	   " of " + this.getMajor() + " (st# " + this.getSNumber() + 
					 	   "). " + this.getGender() + " was born in " + this.getBirthYear() + ".");
	}
	
}
