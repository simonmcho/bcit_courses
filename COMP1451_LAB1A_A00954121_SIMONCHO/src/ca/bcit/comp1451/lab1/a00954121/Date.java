package ca.bcit.comp1451.lab1.a00954121;

public class Date {
	
	private int year;
	private int month;
	private int day;
	
	//Constructor to create objects from this class
	public Date(int year, int month, int day) {
		if(year <= 0) {
			System.out.println("Year can't be less than 1! Setting year to 1337.");
			this.year = 1337;
		} else if(month < 1 || month > 12) {
			System.out.println("Month has to be between a value of 1 and 12! "
					          + "Setting month to January.");
			this.month = 1;
		} else if(day < 1 || day > 31) {
			System.out.println("Month has to be between 1 and 31! Setting day to 1,");
			this.day = 1;
		} else {
			this.year  = year;
			this.month = month;
			this.day   = day;
		}
	}
	
	//getter for int year
	public int getYear() {
		return year;
	}
	
	//setter for int year
	public void setYear(int year) {
		if(year <= 0) {
			System.out.println("Year can't be less than 1! Setting year to 1337");
			this.year = 1337;
		} else {
			this.year = year;
		}
	}
	
	//getter for int month
	public int getMonth() {
		return month;
	}
	
	//setter for int month
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("Month has to be between a value of 1 and 12! "
					          + "Setting month to January.");
			this.month = 1;
		} else {
			this.month = month;
		}
	}
	
	//getter for int day
	public int getDay() {
		return day;
	}
	
	//setter for int day
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("Month has to be between 1 and 31! Setting day to 1,");
			this.day = 1;
		} else {
			this.day = day;
		}
	}
	
	//returns date in a String format
	public String getDate() {
		String formatYear;
		String formatMonth;
		String formatDay;
		
		formatYear  = String.format("%04d", year);
		formatMonth = String.format("%02d", month);
		formatDay   = String.format("%02d", day);
		
		return formatYear + "-" + formatMonth + "-" + formatDay;
	}
}
