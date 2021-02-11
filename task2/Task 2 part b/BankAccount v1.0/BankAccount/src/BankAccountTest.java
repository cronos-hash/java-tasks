
/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 2 Part (b)           *//
//* Description: BankAccountTest.java   *//
//* Date:     10th Feb 2020             *//
//*           Version 1.0               *//
/*****************************************/ 
// Cyber Security, Object Oriented Programming (2019 MOD004881 TRI2 F01CHE)
import javax.swing.*;
//import java.util.*;

public class BankAccountTest {

	public static void main(String[] args) {
		//Creating Frame object for user input
		JFrame frame = new JFrame("Bank Account Application");
		/*creating BankAccount object customerOne and then using the constructor 
		of the object to get both the name and balance in string format, the balance is then parsed and
		converted to a double */
		BankAccount customerOne = new BankAccount(JOptionPane.showInputDialog(frame, "Name of Account Member:"),
				JOptionPane.showInputDialog(frame, "Balance of Account Member:"));
		/*getting input of user then using payin() method to parse string into double then adding it
		 * to the current balance for final balance of customer 1
		 */
		customerOne.payin(JOptionPane.showInputDialog(frame,
				"How much do you want to pay into your account " + customerOne.getName()));
		/*creating customer 2 object
		getting input of user for customer 2 object*/
		BankAccount customerTwo = new BankAccount(JOptionPane.showInputDialog(frame, "Name of Account Member 2"),
				JOptionPane.showInputDialog(frame, "Balance of Account Member"));
		/*getting input of user then using payin() method to parse string into double then adding it
		 * to the current balance for final balance of customer 2
		 */
		customerTwo.payin(JOptionPane.showInputDialog(frame,
				"How much do you want to pay into your account " + customerTwo.getName()));
		//Displaying the names and balances of customer 1 and customer 2 in both string and double format (original formats)
		JOptionPane.showMessageDialog(null, customerOne.getName() + "'s balance total is " + customerOne.getBalance()
				+ " and " + customerTwo.getName() + "'s balance is " + customerTwo.getBalance());
	}
}
