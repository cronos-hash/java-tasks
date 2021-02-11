/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 4 Part (b)           *//
//* Description: AnimalTest.java        *//
//* Date:     12th Feb 2020             *//
//*                                     *//
/*****************************************/ 
public class AnimalTest {
    // declaring objects from classes acat,adog & alion static
    public static Dog aDog = new Dog();
    public static Cat aCat = new Cat();
    public static Lion aLion = new Lion();

    // main method used for the execution of the whole program
    public static void main(String[] args) {
        // creating objects from classes cat,dog & lion
        // aDog = new Dog();
        // Cat aCat = new Cat();
        // Lion aLion = new Lion();
        // prints the cat went
        System.out.println("The cat went");
        // inherited method from Cat sub-class prints meow from Animal.class
        aCat.meow();
        // prints then started
        System.out.println("then started");
        // inherited method from Animal class prints Sleeping for a cat
        aCat.sleep();
        // prints The dog went in colse
        System.out.println("The dog went");
        // inherited method from Dog sub-class makes dog bark from animal.class
        aDog.bark();
        // prints then started
        System.out.println("then started");
        // inherited method from Animal class makes dog sleep
        aDog.sleep();
        // prints the lion went
        System.out.println("The lion went");
        // inherited method from Lion sub-class makes lion roar inherited from
        // Lion.class
        aLion.roar();
        // prints then started in console
        System.out.println("then started");
        // inherited method from Animal class, prints eating inherited from Animal.class
        aLion.eat();

    }

}