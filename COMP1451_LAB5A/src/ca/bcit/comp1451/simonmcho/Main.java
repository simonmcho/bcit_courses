package ca.bcit.comp1451.simonmcho;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Student  markZuckerberg = new Student("marK", "zuckerBERG", 1984, true, "12345678", 
				      	 		  			  "computer science", 4.0);
		Student  michelleObama  = new Student("michelle", "obama", 1964, false, "98765432",
				 							  "LAW", 3.92);	
		Student gloriaMacarenko = new BCITStudent("gloRIA", "macarenko", 1962, false, "88877777",
												  "jOURnaLISM", 3.42, "burnaby");
		Student     markusFrind = new BCITStudent("markus", "frind", 1979, true, "12345678",
												  "COMPUTER SCIENCE", 3.33, "downTOWN");
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(michelleObama);
		list.add(markusFrind);
		list.add(gloriaMacarenko);
		list.add(markZuckerberg);
		
		School school = new School(list);
		school.printDetails();
	}

}
