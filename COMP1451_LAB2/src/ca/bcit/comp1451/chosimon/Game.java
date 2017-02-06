package ca.bcit.comp1451.chosimon;

import java.util.Scanner;

public class Game {
	private String  userResponse;
	private boolean currentRound;
	private boolean userHitZero;
	private int 	numOfRounds;
	private int 	numOfDice;
	private int 	numOfSides;
	private int 	rollTotal;
	private Die[] 	dieArray;
	private int[] 	rollResults;
	private Score 	userScore;
	private Scanner userChoice;
	
	//constructor requiring 3 int arguments
	public Game(int numOfRounds, int numOfDice, int numOfSides) {
		this.numOfRounds = numOfRounds;
		this.numOfDice   = numOfDice;
		this.numOfSides  = numOfSides;
		this.dieArray    = new Die[numOfDice];
		this.rollResults = new int[dieArray.length];
	}
	
	//Starting game
	public void startGame() {
		this.createDice();
		this.userScore = new Score();
		
		while(numOfRounds > 0) {
			userScore.setRoundScoreToZero();
			this.resetRollTotal();
			currentRound = true;
			System.out.println("New round! Number of rounds left: " + numOfRounds);
			System.out.printf("\n");
			
			while(currentRound) {	
				this.startRoll(); //roll dice
				this.calculateResults(); //calculate results
				this.promptUser(); //prompt user
			}
			
			numOfRounds--;
		}
	
		this.endOfGame(userScore.getTotalScore());
	}
	
	//roll the die/dice, add the results to roundTotal
	private void startRoll() {	
		System.out.println("Roll results: ");
		
		for(int i = 0; i < dieArray.length; i++) {
			rollResults[i] = dieArray[i].roll();
			
			if(i < dieArray.length - 1) {
				System.out.print(rollResults[i] + ", ");
			} else {
				System.out.print(rollResults[i] + ".");
			}
			
			rollTotal += rollResults[i];
		}
		
		System.out.printf("\n");
	}
	
	//calculate and show the results of rolled dice
	private void calculateResults() {
		
		for(int i = 0; i < rollResults.length; i++) {
			if(rollTotal == rollResults.length) {
				userScore.setTotalScoreToZero();
				userHitZero = true;
				System.out.println("You got all zeros! Your current Game Total is now at zero pts.");
			}
			else if(rollResults[i] == 1) {
				userScore.setRoundScoreToZero();
				i = rollResults.length;
				userHitZero = true;
				//System.out.println("one of the rolls was a one");
			} else {
				userScore.incrementRoundScore(rollResults[i]);
				userHitZero = false;
				//System.out.println("no rolls was a one");
			}
		}
		
		System.out.println("Showing Roll Total: " + rollTotal);
		System.out.println("Round Total so far: " + userScore.getRoundScore());
		System.out.println("Game Total so far: " + userScore.getTotalScore());
	}
	
	//Prompts user, depending on whether user hit a one or not.
	private void promptUser() {
		this.userChoice = new Scanner(System.in);
		
		if(userHitZero) {
			System.out.printf("\n");
			System.out.println("Round ends because you hit a one!");
			currentRound = false;
			this.continueRoll(userHitZero);
		} else {
			System.out.println("Do you want to remain standing? " + 
							   "Type 'y' or 'yes' to remain standing, otherwise " + 
							   "type anything else to sit.");
			userResponse = userChoice.next();
			this.userStandOrSit(userResponse);
		}	
	}
	
	//give user choice of stand or sit
	private void userStandOrSit(String response) {
		if(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
			currentRound = true;
			this.continueRoll(userHitZero);
		} else {
			currentRound = false;
			System.out.println("You chose to sit, you are not playing anymore in this round.");
			userScore.incrementTotalScore(userScore.getRoundScore());
			this.continueRoll(true);
		}
	}

	//Different conditions for user depending on whether user stands or hit a zero
	private void continueRoll(boolean roundIsZero) {
		
		if(roundIsZero == true && numOfRounds == 1) {
			System.out.println("You've finished the last round.");
		}
		else if(roundIsZero) {
			System.out.println("Press any key then enter to continue.");
			try 
			{
				System.in.read();
			} 
			catch(Exception e){}
			
			//numOfRounds--;
		}
		else {
			this.resetRollTotal();
			System.out.println("Rolling again!");
			System.out.printf("\n");
		}
	}
	
	//method that prints a statement saying game is over and shows the user total score.
	public void endOfGame(int overallScore) {
		System.out.println("Game over. Your total score is " + overallScore + ".");
	}
	
	//resets rollTotal to zero
	private void resetRollTotal() {
		rollTotal = 0;
	}
	
	//create number of dice depending on user's entry to numOfSides
	public void createDice() {
		for(int i = 0; i < numOfDice; i++) {
			dieArray[i] = new Die(numOfSides);
		}
	}
	
}
