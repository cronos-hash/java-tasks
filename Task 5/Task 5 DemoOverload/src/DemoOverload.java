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