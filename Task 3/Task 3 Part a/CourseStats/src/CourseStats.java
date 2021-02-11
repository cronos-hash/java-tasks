
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
