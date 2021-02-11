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