
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
