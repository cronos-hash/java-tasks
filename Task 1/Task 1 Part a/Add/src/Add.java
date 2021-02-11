
/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 1 Part (a)           *//
//* Description: Add.java               *//
//* Date:     30th Jan 2020             *//
//*                                     *//
/*****************************************/
//adding the java utilities API so that we can use the Util.Scanner 
//importing everything since it makes the code cleaner for extended usage of these libraries in the future 
import java.util.*;

public class Add {
	//using Scanner from default java library 
	private static Scanner MyInput;
	//Initalising 3 variables as integers
	private static int NumOne = 0;
	private static int NumTwo = 0;
	private static int sum = 0;

	/* main method is used for the execution of the program
	since its public it means that theirs global visibility. The main method here is static which means that it can be accesed straight from the class 
	and doesnt need to instantiate an object to have reference to it 
	The JVM looks for the main method when executing a java program*/
	public static void main(String arg[]) {
		//using scanner method to store users input in MyInput variable
		MyInput = new Scanner(System.in); // Scans users input
		//Asking for users input by using println which prints line in java 
		System.out.println("Please enter your first number:"); // asks for users input
		//Getting the first number entered from the user from memory location
		NumOne = MyInput.nextInt();
		//Debugging used to show the endered number of the user
		System.out.println("You Entered: " + NumOne);
		//Asking for users input by using println which prints line in java
		System.out.println("Please enter the second number:");
		//Getting the second number from the user from memory location
		NumTwo = MyInput.nextInt();
		//adding both numbers together by using the addition operator and storing it in the sum variable
		sum = NumOne + NumTwo;
		//Printing the results of the addition of NumOne and NumTwo
		System.out.println("The sum of " + NumOne + " and " + NumTwo + " is " + sum); // prints the sum of integers

	}
}
