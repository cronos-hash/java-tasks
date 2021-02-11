/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 4 Part (d)           *//
//* Description: AnimalTest.java        *//
//* Date:     12th Feb 2020             *//
//*                                     *//
/*****************************************/ 
public class AnimalTest{
    public static void main(String[] args){
        //creating objects from classes cat,dog & lion
        //alternative way of declaring objects
        //check part b for other example
        Dog aDog = new Dog();
        Cat aCat = new Cat();
        Lion aLion = new Lion();
        //conditional if statement, checking if Cat exists
        if (aCat.isAPet == true){
            //printing The cat went, on console
        System.out.println("The cat went");
        //inherited method from Cat sub-class
        //using meow method from cat subclass
        //aCat inherited properties from Animal class
        aCat.meow();
        //printing 'then started' on console
        System.out.println("then started");
        //inherited method from Animal class used by aCat object created
        //from Cat class
        aCat.sleep();
        //printing 'The cat then started' in console
        System.out.println("The cat then started");
        //abstract method move used from Cat class,used by aCat object
        aCat.move();
        //printing 'The cat then started'
        System.out.println("The cat then started");
        //inherited method from Animal class used by Cat class (object aCat)
        aCat.eat();
        //printing 'Owner of cat' then the owner of the object
        System.out.println("Owner of cat is: " + aCat.owner);
        }
        //Detecting if the Dog object is a pet using boolean
        //and conditional if statement 
        if (aDog.isAPet == true){
            //Printing 'THe dog went'
        System.out.println("The dog went");
        //inherited method from Dog sub-class used by aDog object
        aDog.bark();
        //printing 'then started'
        System.out.println("then started");
        //inherited method from Animal class used by Dog class (aDog object)
        aDog.sleep();
        //printing the dog then started
        System.out.println("The dog then started:");
        //Printing 'Eating' used by the aDog object from animal class 
        aDog.eat();
        //printing the dog then started
        System.out.println("The dog then started");
        //aDog using move method from Dog class, abstraction class Animal (void)
        aDog.move();
        //printing owner of dog inherited from Animal class
        System.out.println("Owner of dog is:" + aDog.owner);
        }
        //if aLion exists then this code executes. 
        if (aLion.isAPet == true){
            //printing the lion went 
        System.out.println("The lion went");
        //inherited method from Lion sub-class
        aLion.roar();
        //printing then started
        System.out.println("then started");
        //inherited method from Animal class
        aLion.eat();
        //printing the lion then started
        System.out.println("The Lion then started");
        //using move method from Lion class, void in animal class
        aLion.move();
        //printing the owner of the lion 
        System.out.println("Owner of Lion is:" + aLion.owner);
        }

        
        
    }

}