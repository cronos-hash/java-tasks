/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 2 Part (b)           *//
//* Description: BankAccount.java       *//
//* Date:     10th Feb 2020             *//
//*              Version 1.0            *//
/*****************************************/ 
// Cyber Security, Object Oriented Programming (2019 MOD004881 TRI2 F01CHE)
public class BankAccount {
	//data types double and string which can be modified by the getters and setters
	public double balance;
	public String name;

	// get name method
	public String getName() {
		// returns the name , object
		return name;
	}

	// set name method of the public vairable string name from the vairable string from method
	public void setName(String name) {
		this.name = name;
	}

	// constructor used to create BankAccount object set with name and balance
	//variables in string format for use of JoptionPane (input) 
	//once the string is gotten using the Jframes its then converted to a double
	public BankAccount(String name, String balance) {
		//creation of the bank account initialised everytime the constructor is used.
		
		this.balance = Double.parseDouble(balance);
		this.name = name;
	}

	//Same process used for conversion of string to double when getting inputs using Jframe
	//public void doesnt return a vaule
	public void payin(String amount) {
		// adds on the amount paid in to the balance
		balance = balance + Double.parseDouble(amount);

	}
	// Gets the balance of the variable double balance above and returns it
	public double getBalance() {
		// returns balance when method used
		return balance;
	}
}
