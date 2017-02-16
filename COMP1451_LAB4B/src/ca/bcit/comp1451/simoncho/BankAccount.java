package ca.bcit.comp1451.simoncho;

import java.util.UUID;

public class BankAccount {
	private String firstName;
	private String lastName;
	private String accountNumber;
	private double totalMoney = 0;
	private double savings    = 0;
	private double interest   = 0;
	private double loans      = 0;
	private double debt       = 0;
	private static final double LOTTERY_WINNINGS = 150000;
	
	public BankAccount(String fName, String lName, double initialDeposit) {
		
		UUID an   = UUID.randomUUID();
		
		this.firstName = fName.substring(0, 1).toUpperCase() + fName.substring(1).toLowerCase();
		this.lastName  = lName.substring(0, 1).toUpperCase() + lName.substring(1).toLowerCase();
		this.accountNumber = an.toString();
		totalMoney = initialDeposit;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getTotalMoney() {
		return totalMoney;
	}
	
	public double getSavings() {
		return savings;
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public double deposit(double d) {
		totalMoney += d;
		return totalMoney;
	}
	
	public double withdraw(double w) {
		totalMoney -= w;
		return totalMoney;
	}
	
	public double convertToUSD() {
		totalMoney *= 0.77;
		return totalMoney;
	}
	
	public boolean qualifyForMortgage() {
		if (totalMoney > 10000) {
			return true;
		} else {
			return false;
		}
	}
	
	public double moveToSavings(double amt) {
		if(amt > 0) {
			savings += amt;
			totalMoney -= amt;
			return savings;
		} else {
			System.out.println("You can only add $0.01 or more, not less.");
			return totalMoney;
		}
	}
	
	public double getRobbed(double robbery) {
		totalMoney -= robbery;
		return totalMoney;
	}
	
	public double winLottery() {
		totalMoney += LOTTERY_WINNINGS;
		return totalMoney;
	}
	
	public double borrowLoans(double amt) {
		this.loans = amt;
	
		if(amt > 50000) {
			interest = 0.12;
		} else if(amt > 25000) {
			interest = 0.065;
		} else {
			interest = 0.037;
		}
		
		debt += loans + (loans *= interest);
		System.out.println("debt from class: " + debt);
		
		return debt;
	}
	
	public double getDebt() {
		return debt;
	}

}
