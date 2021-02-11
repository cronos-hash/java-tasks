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