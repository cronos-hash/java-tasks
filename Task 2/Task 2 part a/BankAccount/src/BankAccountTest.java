/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 2 Part (a)           *//
//* Description: BankAccountTest.java   *//
//* Date:     1st Feb 2020              *//
//*                                     *//
/*****************************************/
// Cyber Security, Object Oriented Programming (2019 MOD004881 TRI2 F01CHE)
//Importing API java classsess and libraries 
import java.util.*;

public class BankAccountTest {
	//main method used for execution of java program
	public static void main(String[] args) {
		/*creating object customerOne from BankAccount.java blueprint
		and initalising it with a set balance from constructor*/ 
		BankAccount customerOne = new BankAccount(2700.00);
		//using the payin method from BankAccount.java on object customerOne to take away
		//120.00
		customerOne.payin(-120.00);
		//setting default name of Customer 1, uses setter from BankAccount object
		customerOne.setName("Customer 1");
		/* creating new object for customer 2 with set balance in BankAccount constructor*/
		BankAccount customerTwo = new BankAccount(2700.00);
		//using payin method from BankAccount.class to take away 120.00 from current balance
		customerTwo.payin(-120.00);
		//setting default name of Customer 2 using setName method from BankAccount
		customerTwo.setName("Customer 2");
		// using the getName method to get name of customer 1 and then asking for user input
		System.out.print(customerOne.getName() + ", What is your name? ");
		// getting user input using the Scanner class
		Scanner input = new Scanner(System.in);
		// setting name of customer 1 as the next memory location in input variable
		customerOne.setName(input.nextLine());
		//prints customers name and gets their balance
		System.out.print(customerOne.getName() + " has the balance of ");
		//using the getBalance method in BankAccount.class to return balance of customer 1
		System.out.println(customerOne.getBalance());
		// Getting name of customer 2
		System.out.print(customerTwo.getName() + ", What is your name? ");
		// gets users input for name. the next memory location in input variable
		// sets name of customer 2 using setName method. Setting name of next memory location
		customerTwo.setName(input.nextLine());
		// closes scanner
		input.close();
		//prints customers name and gets their balance 
		System.out.print(customerTwo.getName() + " has the balance of ");
		System.out.println(customerTwo.getBalance());

	}
}
