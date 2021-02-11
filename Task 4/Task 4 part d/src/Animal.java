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