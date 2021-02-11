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