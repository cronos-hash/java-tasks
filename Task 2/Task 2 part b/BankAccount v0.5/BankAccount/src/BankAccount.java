/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 2 Part (b)           *//
//* Description: BankAccount.java       *//
//* Date:     10th Feb 2020             *//
//*          Version 0.5                *//
/*****************************************/ 
// Cyber Security, Object Oriented Programming (2019 MOD004881 TRI2 F01CHE)
public class BankAccount {
	private double balance;
	private String name;

	// get name method
	public String getName() {
		// returns the name , object
		return name;
	}

	// set name method
	public void setName(String name) {
		this.name = name;
	}

	// Set Balance Constructor
	public BankAccount(double balance, String name) {
		//creation of the bank account initialised everytime the constructor is used.
		this.balance = balance;
		this.name = name;
	}

	// Pay in method
	public void payin(double amount) {
		// adds on the amount paid in to the balance
		balance = balance + amount;

	}

	// Get Balance method
	public double getBalance() {
		// returns balance when method used
		return balance;
	}
}
