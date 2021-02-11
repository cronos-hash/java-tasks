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