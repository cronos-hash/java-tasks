/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 5 Part (a-b)         *//
//* Description: Cat.java               *//
//* Date:     17th Feb 2020             *//
//*                                     *//
/*****************************************/ 
//Cat sub class of superclass animal
public class Cat extends Animal {
    // Cat sub class of Animal
    // makesound method overwrites makesound method in superclass
    // when make sound method used by cat object
    public void makeSound() {
        // method prints "meow when called'
        System.out.println("The cat does meow!");
    }

}