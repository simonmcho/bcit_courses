package ca.bcit.comp1451.simonmcho;

public class BCITStudent extends Student{
	
	private String bcitNumber = "A";
	private String campus;
	
	public BCITStudent(String fName, String lName, int birthYear, boolean isMale, String sNumber, 
					   String major, double gpa, String campus) {
		
		super(fName, lName, birthYear, isMale, sNumber, major, gpa);
		this.bcitNumber = this.bcitNumber + sNumber;
		this.campus = campus.substring(0, 1).toUpperCase() + 
					  campus.substring(1).toLowerCase();
	}
	
	public String getBcitNumber() {
		return bcitNumber;
	}

	public void setBcitNumber(String bcitNumber) {
		this.bcitNumber = bcitNumber;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public void printDetails() {
		System.out.println(this.getFullName() + " is a " + this.getClass().getSimpleName() + 
						   " of " + this.getMajor() + " (st# " + this.getBcitNumber() + 
						   ") at the " + this.campus + " campus. " + this.getGender() + 
						   " was born in " + this.getBirthYear() + ".");
	}
	
}
