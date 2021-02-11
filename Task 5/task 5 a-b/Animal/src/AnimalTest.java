/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 5 Part (a-b)         *//
//* Description: AnimalTest.java        *//
//* Date:     17th Feb 2020             *//
//*                                     *//
/*****************************************/ 
//public class accessable by other classess
public class AnimalTest {

    // main method used for execution of the program
    public static void main(String[] args) {
        // creating objects from classes cat,dog & lion
        // these objects can also be created in a different format
        // for ex: public static Dog aDog = new Dog();
        // creating object aDog from Dog class
        Dog aDog = new Dog();
        // creating aCat object from Cat class
        Cat aCat = new Cat();
        // creating aLion object from the Lion class
        Lion aLion = new Lion();
        // using polymorrphism to override methods
        // will print the sound of dog rather than animal since
        // this is a object created from the Dog class
        aDog.makeSound();
        // will print the sound of a cat rather than animal since
        // this is a object created from the cat class
        aCat.makeSound();
        // will print the sound of a Lion rather than animal since
        // this is a object created from the Lion class
        aLion.makeSound();
        // using default functionality of Animal.java
        // using sleep method from animal class
        // since the dog class shares the same functionaility
        aDog.sleep();
        // Lion using eat class from Animal class
        aLion.eat();
        // cat object from cat sub class using Animal class sleep method
        aCat.sleep();

    }

}