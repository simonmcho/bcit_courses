package ca.bcit.comp1451.chosimon;

public class Main {

	public static void main(String[] args) {
		//instantiate an object of the Game class with 3 parameters:
		//int number of rounds, int number of dice, int number of sides of dice
		Game game1 = new Game(5, 2, 6);
		game1.startGame();
	}

}
