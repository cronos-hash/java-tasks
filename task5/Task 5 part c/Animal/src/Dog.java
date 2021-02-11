/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 5 Part (c)           *//
//* Description: Dog.java               *//
//* Date:     20th Feb 2020             *//
//*                                     *//
/*****************************************/ 
//sub class of animal super class Animal
public class Dog extends Animal {
    // Dog sub class of Animal
    // public void doesnt return a vaule,
    // overrrides makeSound in animal class
    public void makeSound() {
        // method prints woof when called from Dog object
        System.out.println("the dog goes Woof!");
    }

    // public owner string contains original owner of object
    public String owner = "Mike";

}