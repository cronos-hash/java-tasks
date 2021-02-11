/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 2 Part (a)           *//
//* Description: BankAccount.java       *//
//* Date:     1st Feb  2020             *//
//*                                     *//
/*****************************************/
// Cyber Security, Object Oriented Programming (2019 MOD004881 TRI2 F01CHE)
/* this class has no main method since its ran from BankAccountTest. This 
is because its repsonsible for storing methods for an object which can be 
initalised in the class which uses the main method when creating objects. */
public class BankAccount {
	//public data types string and double (public so they can be accessed by the other classes)
	public double balance;
	public String name;
	//if these were private then these wouldnt be modified when say the balance is
	//changed in the BankAccountTest
	// public get name method useable by other classes, used to return the String name
	public String getName() {
		// returns the set name of the object
		return name;
	}
	// public void doesnt return anything, but can be accessed by other classes
	public void setName(String name) {
		//used to set the name of the String name
		//this.name is the String name, while "name" is the name within this method
		//assigning the classes name to name String in this method
		this.name = name;
	}
	// public BankAccount constructor, used to construct the object when created in
	//other classess
	//this class is constructored with a balance data type double, so that the object
	//can be intialised with a amount when created 
	public BankAccount(double balance) {
		//balance intialised with becomes the classess "public double balance" useable by other methods within this class
		this.balance = balance;
	}
	// public void method payin, doesnt return a vaule. adds an amount to the balance
	public void payin(double amount) {
		// adds on the amount paid in to the balance
		balance = balance + amount;
	}
	// public double method, returns a double and gets the balance of this class
	public double getBalance() {
		// returns balance when method used
		return balance;
	}
}
