package ca.bcit.comp1451.chosimon;

import java.util.Random;

public class Die {
	private int    numOfValues;
	private int    rollValue;
	private Random value = new Random();
	
	public Die(int numOfValues) {
		this.numOfValues = numOfValues;
		//System.out.println("die method sysout: die created");
	}

	//getter for numOfValues
	public int getNumOfValues() {
		return numOfValues;
	}

	//setter for numOfValues
	public void setNumOfValues(int numOfValues) {
		this.numOfValues = numOfValues;
	}

	//rolls dice based on numOfValues
	public int roll() {
		this.rollValue = value.nextInt(numOfValues) + 1;
		return rollValue;
	}
}
