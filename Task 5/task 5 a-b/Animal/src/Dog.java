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