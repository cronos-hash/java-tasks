# Object Oriented Programming Code

## Task 1 part A

### Add.java

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

## Task 1 part B

### Calculator.java

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

## Task 2 part A

### BankAccount.java

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

### BankAccountTest.java

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

## Task 2 part B (version 0.5)

### BankAccount.java

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

### BankAccountTest.java

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

## Task 2 part B (version 1.0)

### BankAccount.java

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

### BankAccountTest.java

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

## Task 3 part A

### CourseStats.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 3 Part (a)           *//
    //* Description: Course Statistics      *//
    //* Date:   4th February 2020           *//
    //*                                     *//
    /*****************************************/
    
    import java.util.Scanner;
    
    public class CourseStats {
    	// declaring data type integer for student passes
    	public static int passes = 0;
    	// declaring data type integer for students fails
    	public static int failures = 0;
    	// declaring student grade
    	public static int studentGrade;
    
    	// private static Scanner scan;
    	private static Scanner scan;
    
    	public static void main(String[] args) {
    		// declaring student counter for while loop
    		int studentCounter = 1;
    		// scan object get System.in (user input)
    		scan = new Scanner(System.in);
    		// loop until student counter is less than 21
    		while (studentCounter < 21) {
    			// Asking for students grade per student
    			System.out.println("Enter Student " + studentCounter + "'s " + "Grade");
    			// getting user input, integer
    			studentGrade = scan.nextInt();
    			// if the students grade is equal to 1 then add 1 to passes counter
    			if (studentGrade == 1) {
    				// adding 1 to passes
    				passes++;
    				// if student grade is equal to 2 then add 1 to fails
    			} else if (studentGrade == 2) {
    				// adding 1 to fails
    				failures++;
    			}
    			// add to counter studentCounter, to loop again
    			studentCounter++;
    
    		}
    		scan.close();
    		// Output: number of passes
    		System.out.println("The number of passess was " + passes);
    		// Output: number of fails
    		System.out.println("The number of fails were " + failures);
    		// If passes are greater than 16 then
    		if (passes > 16) {
    			// Output: special message
    			System.out.println("Congratulations to the Tutors");
    		} /*
    			 * else { //Output: for debugging purposes
    			 * System.out.println("Less then 16 Students passed"); }
    			 */
    
    	}
    }

## Task 3 part B

### CourseStats.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 3 Part (b)           *//
    //* Description: Course Statistics      *//
    //* Date:   4th February 2020           *//
    //*                                     *//
    /*****************************************/
    
    //Importing Java swing API 
    import javax.swing.JFrame;
    import javax.swing.JOptionPane;
    
    //public class 
    public class CourseStats {
    	// declaring data types that belong to this class
    	// data type integer for amount of students passed
    	public static int passes = 0;
    	// data type integer for amount of students failed
    	public static int failures = 0;
    	// data type integer for storing student grades
    	public static int studentGrade;
    	// data type string for varied specialMessage, initialised as nothing
    	public static String specialMessage = " ";
    
    	// Main method
    	public static void main(String[] args) {
    		// data type int for student counter for while loop
    		int studentCounter = 1;
    
    		// creating jframe object from javax API
    		JFrame frame = new JFrame("Course Statistics Program");
    
    		while (studentCounter < 21) {
    			// while the student counter is less than 21 parse string from user input into
    			// student grade
    			studentGrade = Integer
    					.parseInt(JOptionPane.showInputDialog(frame, "Enter Student " + studentCounter + "'s " + "Grade"));
    			// if this student grade is 1 then add to pass count
    			if (studentGrade == 1) {
    				// adding amount to passes
    				passes++;
    				// otherwise if this student grade is 2 then add to fail count
    			} else if (studentGrade == 2) {
    				// adding amount to fails
    				failures++;
    			}
    			// add to student counter for every student
    			studentCounter++;
    		}
    		// if their are more than 16 students that have passed change the special
    		// message
    		if (passes > 16) {
    			specialMessage = "Congratulations to the Tutors";
    		}
    		// use JoptionPane to show amount of passes, failures and the special message
    		JOptionPane.showMessageDialog(frame, "The number of passess was " + passes + "\n" + "The number of fails were "
    				+ failures + "\n" + specialMessage);
    	}
    }

## Task 4 part B

### Animal.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 4 Part (b)           *//
    //* Description: Animal.java            *//
    //* Date:     12th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    public class Animal {
    
        // boolean data type stores true or false, useful for
        // conditional statements, detecting if inherited to other class
        public boolean isAPet = true;
        // String data type owner stores name of animals owner
        public String owner = "john";
    
        // public void method , doesnt return a vaule, prints Sleeping
        // when sleep method is used
        public void sleep() {
            System.out.println("Sleeping");
        }
    
        // eat method returns nothing, prints eating when used
        public void eat() {
            System.out.println("Eating");
    
        }
    }

### AnimalTest.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 4 Part (b)           *//
    //* Description: AnimalTest.java        *//
    //* Date:     12th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    public class AnimalTest {
        // declaring objects from classes acat,adog & alion static
        public static Dog aDog = new Dog();
        public static Cat aCat = new Cat();
        public static Lion aLion = new Lion();
    
        // main method used for the execution of the whole program
        public static void main(String[] args) {
            // creating objects from classes cat,dog & lion
            // aDog = new Dog();
            // Cat aCat = new Cat();
            // Lion aLion = new Lion();
            // prints the cat went
            System.out.println("The cat went");
            // inherited method from Cat sub-class prints meow from Animal.class
            aCat.meow();
            // prints then started
            System.out.println("then started");
            // inherited method from Animal class prints Sleeping for a cat
            aCat.sleep();
            // prints The dog went in colse
            System.out.println("The dog went");
            // inherited method from Dog sub-class makes dog bark from animal.class
            aDog.bark();
            // prints then started
            System.out.println("then started");
            // inherited method from Animal class makes dog sleep
            aDog.sleep();
            // prints the lion went
            System.out.println("The lion went");
            // inherited method from Lion sub-class makes lion roar inherited from
            // Lion.class
            aLion.roar();
            // prints then started in console
            System.out.println("then started");
            // inherited method from Animal class, prints eating inherited from Animal.class
            aLion.eat();
    
        }
    
    }

### Cat.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 4 Part (b)           *//
    //* Description: Cat.java               *//
    //* Date:     12th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    public class Cat extends Animal {
        //Cat sub class of Animal
        //method returns nothing but prints meow when called by Cat object in ANimalTest
        //inherited from Animal.class
        public void meow() {
        	//method prints "meow" when called
            System.out.println("Meow!");
        }
    }

### Dog.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 4 Part (b)           *//
    //* Description: Dog.java               *//
    //* Date:     12th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    public class Dog extends Animal {
    	//Dog sub class of Animal
    	
        //method returns nothing since void is used
        //method prints bark when called by Dog object
        //partly an Animal.class by a Dog.class of type Animal
        public void bark() {
        	//method prints woof when called from Dog object
            System.out.println("Woof!");
        }
    	
    }

### Lion.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 4 Part (b)           *//
    //* Description: Lion.java              *//
    //* Date:     12th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    public class Lion extends Animal {
        //sub class of Animal 
        //mehtod doesnt return a vaule since it uses void
        //prints Roar when used by Lion
        //inherits features from Animal class
        public void roar() {
        	//behaviour of animal, prints Roar if lion object used
            System.out.println("Roar!");
        }
    }

## Task 4 part D

### Animal.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 4 Part (d)           *//
    //* Description: Animal.java            *//
    //* Date:     12th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //Abstraction class Animal restircted class that cannot
    //be used to create objects, to access it you must
    //inherit from this class
    public abstract class Animal {
        // boolean data type public, can be access by other classes
    
        public boolean isAPet = true;
        // setting string data type to john
        public String owner = "john";
    
        // public method, can be accessed by other classes
        // which have inherited properties of this class, prints
        // sleeping when used
        public void sleep() {
            // printing sleeping
            System.out.println("Sleeping");
        }
    
        // abstraction method move, body of this method in
        // other subclasses which are of type animal
        public abstract void move();
    
        // public method , accessible by other classes
        // abstract class, so depends on if they inherit from here
        // void method returns no vaule
        // prints eating
        public void eat() {
            System.out.println("Eating");
    
        }
    }

### AnimalTest.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 4 Part (d)           *//
    //* Description: AnimalTest.java        *//
    //* Date:     12th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    public class AnimalTest{
        public static void main(String[] args){
            //creating objects from classes cat,dog & lion
            //alternative way of declaring objects
            //check part b for other example
            Dog aDog = new Dog();
            Cat aCat = new Cat();
            Lion aLion = new Lion();
            //conditional if statement, checking if Cat exists
            if (aCat.isAPet == true){
                //printing The cat went, on console
            System.out.println("The cat went");
            //inherited method from Cat sub-class
            //using meow method from cat subclass
            //aCat inherited properties from Animal class
            aCat.meow();
            //printing 'then started' on console
            System.out.println("then started");
            //inherited method from Animal class used by aCat object created
            //from Cat class
            aCat.sleep();
            //printing 'The cat then started' in console
            System.out.println("The cat then started");
            //abstract method move used from Cat class,used by aCat object
            aCat.move();
            //printing 'The cat then started'
            System.out.println("The cat then started");
            //inherited method from Animal class used by Cat class (object aCat)
            aCat.eat();
            //printing 'Owner of cat' then the owner of the object
            System.out.println("Owner of cat is: " + aCat.owner);
            }
            //Detecting if the Dog object is a pet using boolean
            //and conditional if statement 
            if (aDog.isAPet == true){
                //Printing 'THe dog went'
            System.out.println("The dog went");
            //inherited method from Dog sub-class used by aDog object
            aDog.bark();
            //printing 'then started'
            System.out.println("then started");
            //inherited method from Animal class used by Dog class (aDog object)
            aDog.sleep();
            //printing the dog then started
            System.out.println("The dog then started:");
            //Printing 'Eating' used by the aDog object from animal class 
            aDog.eat();
            //printing the dog then started
            System.out.println("The dog then started");
            //aDog using move method from Dog class, abstraction class Animal (void)
            aDog.move();
            //printing owner of dog inherited from Animal class
            System.out.println("Owner of dog is:" + aDog.owner);
            }
            //if aLion exists then this code executes. 
            if (aLion.isAPet == true){
                //printing the lion went 
            System.out.println("The lion went");
            //inherited method from Lion sub-class
            aLion.roar();
            //printing then started
            System.out.println("then started");
            //inherited method from Animal class
            aLion.eat();
            //printing the lion then started
            System.out.println("The Lion then started");
            //using move method from Lion class, void in animal class
            aLion.move();
            //printing the owner of the lion 
            System.out.println("Owner of Lion is:" + aLion.owner);
            }
    
            
            
        }
    
    }

### Cat.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 4 Part (d)           *//
    //* Description: Cat.java               *//
    //* Date:     12th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //this class is a sub class of Animal superclass
    public class Cat extends Animal {
        //Cat sub class of Animal
    
        //method used to print Meow! and return no vaule 
        public void meow() {
        	//method prints "meow when called'
            System.out.println("Meow!");
        }
        //method move() used as the body of the abstraction method
        //prints Jumping when inherited
        public void move(){
            System.out.println("Jumping");
        }
    
    }

### Dog.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 4 Part (d)           *//
    //* Description: Dog.java               *//
    //* Date:     12th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //Dog sub class of Animal superclass
    public class Dog extends Animal {
        // Dog sub class of Animal
    
        // method returns no vaule since void
        // method only used by Dog objects
        // method prints Woof!
        public void bark() {
            // method prints woof when called from Dog object
            System.out.println("Woof!");
        }
    
        // public void , doesnt return a vaule
        // accessible by other classes
        // provides the body for the abstraction method move
        // in animal superclass
        // when Dog object used
        // prints Running
        public void move() {
            System.out.println("Running");
        }
    
    }

### Lion.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 4 Part (d)           *//
    //* Description: Lion.java              *//
    //* Date:     12th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //Lion sub class part of Animal superclass
    public class Lion extends Animal {
        // extends functionaility of Lion
        // sub class of Animal
        // method roar prints roar used by Lion object
        public void roar() {
            // behaviour of animal, prints Roar if lion object used
            System.out.println("Roar!");
        }
    
        // provides as body for abstraction method when Lion object used
        // prints Sitting
        public void move() {
            System.out.println("Sitting");
        }
    }

## Task 5 part A-B

### Animal.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 5 Part (a-b)         *//
    //* Description: Animal.java            *//
    //* Date:     17th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //public class animal accessible from other classes
    public class Animal {
    
        // data type boolean can be set either true or false
        public boolean isAPet = true;
    
        // public accessable string owner set to john
        public String owner = "john";
    
        // public void method , doesnt return a vaule
        // ca be inherited by other sub classess
        public void sleep() {
            // prints sleeping when this method is used
            System.out.println("Sleeping");
        }
    
        // public void method, doesnt return a vaule,
        // eat method inherited by other sub classess
        // which extend the animal class
        public void eat() {
            // prints eating when method used
            System.out.println("Eating");
        }
        // public method doesnt return a vaule
        // overwritten by vairous sub classess
        // defaults to this animal makes a sound when used
    
        public void makeSound() {
            // prints this animal makes a sound
            System.out.println("THis animal makes sounds!");
        }
    
    }

### AnimalTest.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 5 Part (a-b)         *//
    //* Description: AnimalTest.java        *//
    //* Date:     17th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //public class accessable by other classess
    public class AnimalTest {
    
        // main method used for execution of the program
        public static void main(String[] args) {
            // creating objects from classes cat,dog & lion
            // these objects can also be created in a different format
            // for ex: public static Dog aDog = new Dog();
            // creating object aDog from Dog class
            Dog aDog = new Dog();
            // creating aCat object from Cat class
            Cat aCat = new Cat();
            // creating aLion object from the Lion class
            Lion aLion = new Lion();
            // using polymorrphism to override methods
            // will print the sound of dog rather than animal since
            // this is a object created from the Dog class
            aDog.makeSound();
            // will print the sound of a cat rather than animal since
            // this is a object created from the cat class
            aCat.makeSound();
            // will print the sound of a Lion rather than animal since
            // this is a object created from the Lion class
            aLion.makeSound();
            // using default functionality of Animal.java
            // using sleep method from animal class
            // since the dog class shares the same functionaility
            aDog.sleep();
            // Lion using eat class from Animal class
            aLion.eat();
            // cat object from cat sub class using Animal class sleep method
            aCat.sleep();
    
        }
    
    }

### Cat.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 5 Part (a-b)         *//
    //* Description: Cat.java               *//
    //* Date:     17th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //Cat sub class of superclass animal
    public class Cat extends Animal {
        // Cat sub class of Animal
        // makesound method overwrites makesound method in superclass
        // when make sound method used by cat object
        public void makeSound() {
            // method prints "meow when called'
            System.out.println("The cat does meow!");
        }
    
    }

### Dog.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 5 Part (a-b)         *//
    //* Description: Dog.java               *//
    //* Date:     17th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //sub class of Animal superclass (Dog)
    public class Dog extends Animal {
        // Dog sub class of Animal
    
        // make sound method which overrides the makesound method in
        // superclass animal
        // public void so doesnt return vaule accessible by other classes
        public void makeSound() {
            // method prints woof when called from Dog object
            System.out.println("The dog goes Woof!");
        }
    
    }

### Lion.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 5 Part (a-b)         *//
    //* Description: Lion.java              *//
    //* Date:     17th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //sub class Lion of animal superclass
    public class Lion extends Animal {
        // sub class of Animal
        // makeSound method overwrites makeSound method in animal class
        // when lion object is used
        public void makeSound() {
            // behaviour of animal, prints Roar if lion object used
            System.out.println("The Lion roars!");
        }
    }

## Task 5 part C

### Animal.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 5 Part (c)           *//
    //* Description: Animal.java            *//
    //* Date:     20th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //public class Animal super class, accessible by other classes
    public class Animal {
        // boolean data type set to true to detect if it is a pet
        public boolean isAPet = true;
    
        // owner default string, changes depending on animal
        public String owner = "john";
    
        // method returns the string owner when called
        public String getOwner() {
            // returns the string owner from here
            return owner;
        }
    
        // method returns nothing, gets the new owner and assigns
        // it to current owner
        public void setOwner(String newOwner) {
            owner = newOwner;
        }
    
        // method returns nothing prints sleeping
        // can be used by other sub classes
        public void sleep() {
            // prints sleeping
            System.out.println("Sleeping");
        }
    
        // method eat prints eating can be used by other sub classes
        public void eat() {
            // prints eating
            System.out.println("Eating");
        }
    
        // method returns nothing prints This animal makes sounds, overwritten
        // by sub classess when they use this method
        public void makeSound() {
            // prints this animal makes sounds
            System.out.println("This animal makes sounds!");
        }
    
    }

### AnimalTest.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 5 Part (c)           *//
    //* Description: AnimalTest.java        *//
    //* Date:     20th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //public class accessible by other classess 
    public class AnimalTest {
        // creating dog , cat and lion objects
        // all objects have inheritance of the animal super class
        public static Dog aDog = new Dog();
        public static Cat aCat = new Cat();
        public static Lion aLion = new Lion();
    
        // main method used for the main execution of the program
        public static void main(String[] args) {
            // creating objects from classes cat,dog & lion
            // Dog aDog = new Dog();
            // Cat aCat = new Cat();
            // Lion aLion = new Lion();
            /*
             * Dog, Lion and Cat Sub-classes override Animal superclass makeSound() when
             * objects are created
             */
            // if conditional statment detecting if the dog section of
            // the code shouldve be executed
            if (aDog.isAPet == true) {
                // since the dog has an owner, the owner is then printed
                System.out.printf(aDog.owner + " pets his dog, ");
                // the dog object then makes a sound from the sub class dog
                aDog.makeSound();
                // the dogs owner changes since the owner is then set to mary
                aDog.setOwner("Mary");
                // even though the dogs owner has chnaged the original owner is still mike
                // still able to print the original owner, however we are able to get the new
                // owner when needed
                System.out.println("\n" + aDog.owner
                        + " left his dog in another country, who was now being looked after by " + aDog.getOwner());
                // then getting the new owner and following the story
                System.out.printf("\n" + aDog.getOwner() + "'s Dog then started ");
                // using the animal class eat method since dog is a sub class and has inherited
                // this method
                aDog.eat();
            }
            // if the cat exists and has a owner then the if statment will run the following
            // code
            if (aCat.isAPet == true) {
                // printing the current owner
                System.out.printf("\n" + aCat.owner + " strokes her cat, ");
                // sound overwrite of makeSound in animal class
                aCat.makeSound();
                // setting the new owner as Andy
                aCat.setOwner("Andy");
                // able to print andy the new owner and the original owner
                System.out.println("\n" + aCat.getOwner() + " brought the cat off " + aCat.owner);
                // using printf for better formatting of story
                System.out.printf("\n" + aCat.getOwner() + "'s Cat started ");
                // using method of animal superclass which has been inherited by cat
                aCat.sleep();
            }
            // if their is a lion and it exists then the if statement will run the following
            // code
            if (aLion.isAPet == true) {
                // prints the original owner before change
                System.out.printf("\n" + aLion.owner + " loves to admire his lion, ");
                // overwrites super class make sound since its the Lion object which was used
                aLion.makeSound();
                // setting the new owner to Chay
                aLion.setOwner("Chay");
                // getting the new owner using the animal super class, also showing that the old
                // owner can be used from sub class
                System.out.println("\n" + aLion.getOwner() + " stole the lion from " + aLion.owner);
                // demonstration that Lion sub class inherits methods from animal super class
                System.out.printf("\n" + aLion.getOwner() + "'s Lion started ");
                aLion.eat();
    
            }
    
        }
    
    }

### Cat.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 5 Part (c)           *//
    //* Description: Cat.java               *//
    //* Date:     20th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //sub class of super class Animal
    public class Cat extends Animal {
        // Cat sub class of Animal
        // make Sound method overrides makeSound method
        public void makeSound() {
            // method prints "meow when called'
            System.out.println("the cat does meow!");
        }
    
        // public owner String returns string when used
        public String owner = "Alice";
    
    }

### Dog.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 5 Part (c)           *//
    //* Description: Dog.java               *//
    //* Date:     20th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //sub class of animal super class Animal
    public class Dog extends Animal {
        // Dog sub class of Animal
        // public void doesnt return a vaule,
        // overrrides makeSound in animal class
        public void makeSound() {
            // method prints woof when called from Dog object
            System.out.println("the dog goes Woof!");
        }
    
        // public owner string contains original owner of object
        public String owner = "Mike";
    
    }

### Lion.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 5 Part (c)           *//
    //* Description: Lion.java              *//
    //* Date:     20th Feb 2020             *//
    //*                                     *//
    /*****************************************/ 
    //sub class of animal super class
    public class Lion extends Animal {
        // sub class of Animal
        // overrides makeSound of animal superclass
        public void makeSound() {
            // behaviour of animal, prints Roar if lion object used
            System.out.println("the lion roars!");
        }
    
        // default owner of object
        public String owner = "Peter";
    }

## Task 5 Method Overloading

### DemoOverload.java

    /****************************************/
    //* Name:   Chay Tyndall SID: 1610314   *//
    //* Task:     Task 5                    *//
    //* Description: Method overloading     *//
    //* Date:   1st March 2020              *//
    //*                                     *//
    /*****************************************/
    public class DemoOverload {
    	// integers used for the integer sum method
    	// private static since they only need to be accessible to this class
    	// both intialised as 50
    	private static Integer IntOne = 50;
    	private static Integer IntTwo = 50;
    	// private static, only accessible to this class
    	// double data types for sum method of doubles
    	private static double DoubleOne = 52.1;
    	private static double DoubleTwo = 23.8;
    	// the denominator for the average method
    	// private static only accessible in this class
    	private static Integer DeNom = 2;
    	// integer data types for formatting of result
    	// and to store result of integer method
    	private static Integer MultiInt = 0;
    	// double data type for formatting of result
    	// and to store result of double method
    	private static Double MultiDouble = 0.0;
    
    	// method returns integer data type of sum of i1 and i2
    	public static Integer Sum(int i1, int i2) {
    		// returns integer number and add them together
    		return (IntOne + IntTwo);
    
    	} // end of method
    //method returns double vaule data type, inputs are d1 and d2 
    	// d1 and d2 are added together
    
    	public static double Sum(double d1, double d2) {
    //returns the sum of double1 and double 2
    		return (DoubleOne + DoubleTwo);
    
    	} // end of method
    //method returns integer, inputs are i1 and i2 
    	// times them together and stores in MultiInt
    	// then returns the integer which is MultiInt divided by Denom
    
    	public static Integer Average(int i1, int i2) {
    //times vaules together
    		MultiInt = IntOne * IntTwo;
    		// returns MultiInt after dividing
    		return (MultiInt / DeNom);
    
    	} // end method
    //method returns double, inputs are d1 and d2
    
    	public static double Average(double d1, double d2) {
    //times them together and stores it as a double vaule in
    		// MultiDouble
    		MultiDouble = DoubleOne * DoubleTwo;
    //divides the denominator before returning 
    		return (MultiDouble / DeNom);
    
    	} // end method
    //method inputs is i1 , returns ineger 
    
    	public static Integer Square(int i1) {
    //returns both vaules times by each other 
    		return (IntOne * IntOne);
    	}// end method
    //method returns double, inputs are double d1
    
    	public static double Square(double d1) {
    //returns Double1 squared 
    
    		return (DoubleOne * DoubleOne);
    
    	}// end method
    //main method repsonsible for the execution of the program 
    
    	public static void main(String[] args) {
    //when the program executes main method will
    		// print the int sum format
    		System.out.println("int sum is " + Sum(0, 0));
    //print the double sum format
    		System.out.println("double sum is " + Sum(0.0, 0.0));
    //print the integer average format
    		System.out.println("int average is " + Average(0, 0));
    //print in double average format
    		System.out.println("double average is" + Average(0.0, 0.0));
    //print in int square format
    		System.out.println("int square is " + Square(0));
    //print in double square format
    		System.out.println("double square is " + Square(0.0));
    
    	}// end main method
    
    }// end class
