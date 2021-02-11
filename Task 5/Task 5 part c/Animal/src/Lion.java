/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 5 Part (c)           *//
//* Description: Lion.java              *//
//* Date:     20th Feb 2020             *//
//*                                     *//
/*****************************************/ 
//sub class of animal super class
public class Lion extends Animal {
    // sub class of Animal
    // overrides makeSound of animal superclass
    public void makeSound() {
        // behaviour of animal, prints Roar if lion object used
        System.out.println("the lion roars!");
    }

    // default owner of object
    public String owner = "Peter";
}