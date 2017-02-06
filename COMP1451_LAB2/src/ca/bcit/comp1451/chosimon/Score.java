package ca.bcit.comp1451.chosimon;

public class Score {
	private int roundScore;
	private int totalScore;
	
	//constructor
	public Score() {
		//System.out.println("newly created score using score constructor");
		this.roundScore = 0;
		this.totalScore = 0;
	}
	
	//increment roundScore
	public void incrementRoundScore(int roundPoints) {
		roundScore += roundPoints;
	}
	
	//increment totalScore
	public void incrementTotalScore(int totalPoints) {
		totalScore += roundScore;
	}
	
	//initialize roundScore to zero, if user hits at least a one 
	public void setRoundScoreToZero() {
		roundScore = 0;
	}
	
	//initialize totalScore to zero if user hits all ones on all dice
	public void setTotalScoreToZero() {
		totalScore = 0;
	}
	
	//getter for roundScore
	public int getRoundScore() {
		return roundScore;
	}

	//setter for roundScore
	public void setRoundScore(int roundScore) {
		this.roundScore = roundScore;
	}

	//getter for totalScore
	public int getTotalScore() {
		//System.out.println("totalScore method");
		return totalScore;
	}

	//setter for totalScore...not needed except for educational purposes
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

}
