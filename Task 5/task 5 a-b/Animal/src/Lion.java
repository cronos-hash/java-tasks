/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 5 Part (a-b)         *//
//* Description: Lion.java              *//
//* Date:     17th Feb 2020             *//
//*                                     *//
/*****************************************/ 
//sub class Lion of animal superclass
public class Lion extends Animal {
    // sub class of Animal
    // makeSound method overwrites makeSound method in animal class
    // when lion object is used
    public void makeSound() {
        // behaviour of animal, prints Roar if lion object used
        System.out.println("The Lion roars!");
    }
}