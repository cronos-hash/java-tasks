/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 5 Part (c)           *//
//* Description: Cat.java               *//
//* Date:     20th Feb 2020             *//
//*                                     *//
/*****************************************/ 
//sub class of super class Animal
public class Cat extends Animal {
    // Cat sub class of Animal
    // make Sound method overrides makeSound method
    public void makeSound() {
        // method prints "meow when called'
        System.out.println("the cat does meow!");
    }

    // public owner String returns string when used
    public String owner = "Alice";

}