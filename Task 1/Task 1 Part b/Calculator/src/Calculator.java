
/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 1 Part (b)           *//
//* Description: Calculator.java        *//
//* Date:     23th Jan 2020             *//
//*                                     *//
/*****************************************/
// Cyber Security, Object Oriented Programming (2019 MOD004881 TRI2 F01CHE) 
//Importing the java.util API package which contains a collection of frameworks, classes and facilities
import java.util.*;

/*Public class is like a blueprint in java which can be used to create objects
Additionally this class is public so it can be accesed by, other classess, packages and subclassess*/
public class Calculator { //class has same name as .java file 
	//Initalising variables used for additions and average
	private static Scanner myInput;
	//Integers can store 4 bytes
	private static int numOne = 0;
	//Since these data types have been declared as private they can only be access by this class 
	private static int numTwo = 0;
	private static int numThree = 0;
	private static int sum = 0;
	//double data types can store a float number up to 8 bytes
	private static double average = 0;
	//multiple variables can be created on the same line if they have the same data type
	static int first = 0, second = 0, last = 0;

	/* the main method consists of "String[]" and "args".
	the args part of the main method contains supplied command-line arguments 
	Since theres String array in the main method. it can be used to print different arguments or add additional information need for java to function correctly 
	for example, in the main method you might want to put 
	String one =args[0]; which would make the first argument stored in String one */
	public static void main(String[] args) {
		//Using scanner class to get user input and store this in Myinput
		myInput = new Scanner(System.in);
		//Asking user for the first number needed for the addition
		System.out.println("Please enter the first number!");
		//getting the first number from memory location stored in myInput
		numOne = myInput.nextInt(); // get num1
		// Debugging statements
		System.out.println("Entered number is " + numOne);
		//Asking for second number from the user by using println (prints in the console)
		System.out.println("Please enter the second number!");
		//getting the second number from memory location stored in myInput and storing this in numTwo
		numTwo = myInput.nextInt(); // get num2
		//Asking user to enter the third number
		System.out.print("Please enter the third number!");
		//Getting the third number memory location in myInput and storing this in numThree
		numThree = myInput.nextInt(); // get num3
		//Debugging statement showing whats stored in numThree
		System.out.println("Entered number is " + numThree);
		//using the addition operator to add these numbers together and store them in the variable sum
		sum = numOne + numTwo + numThree;
		//Debugging statement showing whats stored in sum
		System.out.println("The sum is: " + sum);
		/*Using the less than and more than relational operators to figure out which number out of all the integers is the number which should go in the first slot,
		second slot or third slot when printed
		using if else statements to determine which number is the largest and smallest out of all three numbers entered by the user*/
		if (numOne < numTwo && numOne < numThree) { // less than
			first = numOne;
		} else {
			if (numOne > numTwo && numOne > numThree) { // more than
				last = numOne;
			} else {
				second = numOne;
			}
		}
		/*determining if numTwo will be printed in the first, second or third location */
		if (numTwo < numOne && numTwo < numThree) { // less than
			first = numTwo;
		} else {
			if (numTwo > numThree && numTwo > numOne) {// more than
				last = numTwo;
			} else {
				second = numTwo;
			}
		}
		/*determining if numThree will be printed in the first, second or third location */
		if (numThree < numTwo && numThree < numOne)// less than
		{
			first = numThree;
		} else {
			if (numThree > numOne && numThree > numTwo) {
				last = numThree;
			} else {
				second = numThree;
			}
		}
		//once the if else statements have determined which order the numbers are in these numbers are then printed in the correct order
		System.out.println("Numbers in order: " + first + ", " + second + ", " + last);
		//Since there are three numbers the average is gotten by using the division operator
		average = sum / 3;
		//The average is then printed 
		System.out.println("Average is " + average);
	}// end method
}// end class
