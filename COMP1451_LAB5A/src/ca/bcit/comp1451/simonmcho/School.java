package ca.bcit.comp1451.simonmcho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class School {

	private Person  				 president;
	private ArrayList<Student>       listOfStudents;
	private HashMap<String, Student> students;
	
	public School(ArrayList<Student> studentArray) {
		
		this.president      = new Person("kathy", "kinloch", 1960, false);
		this.listOfStudents = studentArray;
		this.students       = new HashMap<>();
		
		//System.out.println("size of hashmap before putting: " + students.size());
		
		for(Student s : listOfStudents) {
			
			if(s.getClass().getSimpleName().equals("BCITStudent")) {
				BCITStudent b = (BCITStudent)s;
				students.put(b.getBcitNumber(), s);
			} else {
				students.put(s.getSNumber(), s);
			}
	
		}
		
		//System.out.println("size of hashmap after putting: " + students.size());
		//System.out.printf("\n");
		
		Set<String> keys = students.keySet();
		Iterator<String> it = keys.iterator();
		
		System.out.printf("The president of this school: ");
		this.president.printDetails();
		System.out.printf("\n");
		
		while(it.hasNext()) {
			String   key = it.next();
			Student stud = students.get(key);
			
			stud.printDetails();
		}
		
	}
	
	public void printDetails() {
		System.out.printf("\n");
		System.out.println("Tricky part in this lab with the casting issue with the student numbers.");
	}
}
