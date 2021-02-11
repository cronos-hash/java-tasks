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