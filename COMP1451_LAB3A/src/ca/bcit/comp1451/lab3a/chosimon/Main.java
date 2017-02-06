package ca.bcit.comp1451.lab3a.chosimon;

public class Main {

	public static void main(String[] args) {
		Country countries = new Country();
		
		countries.createHashMap();
		countries.showAllMappings();
		System.out.printf("\n");
		countries.showAllMappings2();
		
	}

}
