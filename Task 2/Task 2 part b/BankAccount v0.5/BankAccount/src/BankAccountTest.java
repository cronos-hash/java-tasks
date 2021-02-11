
/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 2 Part (b)           *//
//* Description: BankAccountTest.java   *//
//* Date:     10th Feb 2020             *//
//*            Version 0.5              *//
/*****************************************/ 
// Cyber Security, Object Oriented Programming (2019 MOD004881 TRI2 F01CHE)
//importing javax swing API used for GUI creation 
import javax.swing.*;
//java.utils no longer needed since Scanner or any other libraries are not used
//import java.util.*;

public class BankAccountTest {
	//creating String data type variables used for storage of customer names from user
	public static String custNameOne, custNameTwo;
	//creating String data type variables for customers balance
	public static String custBalanceOne, custBalanceTwo;
	//creating double data type variables for storing the customers amount when
	//converted to either a string or double
	public static double custOneTransaction, custTwoTransaction, TransactionTwoComplete, TransactionOneComplete;

	//main method used for the execution of the java program
	public static void main(String[] args) {
		//creating three Jframe objects from the javax swing API
		JFrame frameOne = new JFrame("Customer 1: Name");
		JFrame frameTwo = new JFrame("Customer 1: Balance");
		JFrame frameThree = new JFrame("Customer 2: name");
		//using Joption frame to get input for the customers name and storing this in variable custNameOne
		custNameOne = JOptionPane.showInputDialog(frameOne, "Customer 1, Whats your name?");

		//using Jframe to get input for first customers balance and storing this in variable custBalanceOne
		custBalanceOne = JOptionPane.showInputDialog(frameTwo, "What is " + custNameOne + "'s current balance?");

		//using the same process to get the second customers name via Jframe input dialog
		custNameTwo = JOptionPane.showInputDialog(frameOne, "Customer 2, Whats your name?");
		
		//using the same process to get the balance of customer 2
		custBalanceTwo = JOptionPane.showInputDialog(frameTwo, "What is " + custNameTwo + "'s current balance?");

		// creating 2 customer BankAccount objects, parsing the balance amount in constructor as a double, and the customers name
		BankAccount customerOne = new BankAccount(Double.parseDouble(custBalanceOne), custNameOne);
		BankAccount customerTwo = new BankAccount(Double.parseDouble(custBalanceOne), custNameTwo);
		//creating a forth Jframe to ask customers how much they want to pay in
		JFrame frameFour = new JFrame("Hello" + customerTwo.getName());
		
		// getting customers 1 transaction amount and storing in parsedTransaction
		String parsedTransactionOne = String.valueOf(custOneTransaction);
		
		
		parsedTransactionOne = JOptionPane.showInputDialog(frameThree,
				"how much would you like to pay in to your account?, " + customerOne.getName());
		
		// parse transaction to be read by payin() method
		TransactionOneComplete = Double.parseDouble(parsedTransactionOne);

		// get customer 2 transaction amount
		String parsedTransactionTwo = String.valueOf(custTwoTransaction);
		
		
		parsedTransactionTwo = JOptionPane.showInputDialog(frameFour,
				"how much would you like to pay in to your account?, " + customerTwo.getName());
		TransactionTwoComplete = Double.parseDouble(parsedTransactionTwo);

		// pay transactions into bank accounts
		customerOne.payin(TransactionOneComplete);
		customerTwo.payin(TransactionTwoComplete);

		// display total bank balance of each customer
		JOptionPane.showMessageDialog(null, customerOne.getName() + "'s balance total is " + customerOne.getBalance()
				+ " and " + customerTwo.getName() + "'s balance is " + customerTwo.getBalance());
	}
}
