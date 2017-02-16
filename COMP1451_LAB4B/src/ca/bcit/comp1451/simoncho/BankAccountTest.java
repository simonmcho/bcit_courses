package ca.bcit.comp1451.simoncho;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	
	private BankAccount bank;
	private BankAccount sBank;
	private double currentMoney;
	
	@Before
	public void setUp() {
		System.out.println("setting up.");
		this.bank = new BankAccount("siMON", "CHO", 5000);
		this.sBank = new BankAccount("saNDRA", "yOO", 5500);
	}
	
	@After
	public void tearDown() {
		System.out.println("tearing down.");
	}
	
	@Test
	public void testSum1() {
		int sum1 = bank.sum(-5, -15);
		assertEquals(-20, sum1, 0.1);
	}
	
	@Test
	public void testSum2() {
		int sum2 = bank.sum(15000, 5);
		assertEquals(15005, sum2, 0.1);
	}
	
	@Test
	public void testName1() {
		assertEquals("Simon Cho", bank.getName());
	}
	
	public void testName2() {
		assertEquals("sanDRa", "yoO", sBank.getName());
	}
	
	@Test
	public void accountNumberIsLong1() {
		boolean veryLong = bank.getAccountNumber().length() > 15;
		assertTrue(veryLong);
	}

	@Test
	public void accountNumberIsLong2() {
		boolean veryLong = sBank.getAccountNumber().length() > 15;
		assertTrue(veryLong);
	}

	@Test
	public void testDeposit1() {
		currentMoney = bank.getTotalMoney() + 1600;
		double depo =  bank.deposit(1600);
		assertEquals(currentMoney, depo, 0.1);
	}
	
	@Test
	public void testDeposit2() {
		currentMoney = sBank.getTotalMoney() + 0.75;
		double depo =  sBank.deposit(0.75);
		assertEquals(currentMoney, depo, 0.1);
	}
	
	@Test 
	public void testWithdraw() {
		currentMoney = bank.getTotalMoney() - 500;
		double wd = bank.withdraw(500);
		assertEquals(currentMoney, wd, 0.1);
	}
	
	@Test
	public void testConvertToUsd1() {
		currentMoney = bank.getTotalMoney() * 0.77;
		double c     = bank.convertToUSD();
		assertEquals(currentMoney, c, 0.1);
	}
	
	@Test
	public void testConvertToUsd2() {
		currentMoney = sBank.getTotalMoney() * 0.77;
		double c     = sBank.convertToUSD();
		assertEquals(currentMoney, c, 0.1);
	}
	
	@Test
	public void testForSavingsTransfer1() {
		double savings = bank.getSavings();
		savings += 300;
		double s = bank.moveToSavings(300);
		assertEquals(savings, s, 0.1);
	}
	
	@Test
	public void testForSavingsTransfer2() {
		currentMoney = sBank.getTotalMoney();
		System.out.println(currentMoney);
		double s = sBank.moveToSavings(-300);
		assertEquals(currentMoney, s, 0.1);
	}
	
	@Test
	public void failForMortgageQualification1() {
		double allMoney = bank.getTotalMoney();
		bank.withdraw(allMoney);
		boolean no  = bank.qualifyForMortgage();
		assertFalse(no);
	}
	
	@Test
	public void failForMortgageQualification2() {
		double allMoney = sBank.getTotalMoney();
		bank.withdraw(allMoney);
		boolean no  = sBank.qualifyForMortgage();
		assertFalse(no);
	}
	
	@Test
	public void passForMortgageQualification() {
		bank.deposit(10001);
		boolean yes  = bank.qualifyForMortgage();
		assertTrue(yes);
	}
	
	@Test
	public void rob1() {
		currentMoney  = bank.getTotalMoney() - 3500;
		System.out.println("Before robbery, total money: " + bank.getTotalMoney());
		System.out.println("After robbery, total money: " + currentMoney);
		double robber = bank.getRobbed(3500);
		assertEquals(currentMoney, robber, 0.1);
	}
	
	@Test
	public void rob2() {
		currentMoney  = bank.getTotalMoney() - 15000;
		System.out.println("Before robbery, total money: " + bank.getTotalMoney());
		System.out.println("After robbery, total money: " + currentMoney);
		double robber = bank.getRobbed(15000);
		assertEquals(currentMoney, robber, 0.1);
	}
	
	@Test
	public void win() {
		currentMoney   = bank.getTotalMoney() + 150000;
		double lottery = bank.winLottery();
		assertEquals(currentMoney, lottery, 0.1);
	}
	
	@Test
	public void borrow1() {
		double l = bank.borrowLoans(30000);
		assertEquals(31950, l, 0.1);
		
	}
	
	@Test 
	public void borrow2() {
		double l = sBank.borrowLoans(150000);
		assertEquals(168000.0, l, 0.1);
	}
}
