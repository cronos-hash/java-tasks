/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 5 Part (c)           *//
//* Description: AnimalTest.java        *//
//* Date:     20th Feb 2020             *//
//*                                     *//
/*****************************************/ 
//public class accessible by other classess 
public class AnimalTest {
    // creating dog , cat and lion objects
    // all objects have inheritance of the animal super class
    public static Dog aDog = new Dog();
    public static Cat aCat = new Cat();
    public static Lion aLion = new Lion();

    // main method used for the main execution of the program
    public static void main(String[] args) {
        // creating objects from classes cat,dog & lion
        // Dog aDog = new Dog();
        // Cat aCat = new Cat();
        // Lion aLion = new Lion();
        /*
         * Dog, Lion and Cat Sub-classes override Animal superclass makeSound() when
         * objects are created
         */
        // if conditional statment detecting if the dog section of
        // the code shouldve be executed
        if (aDog.isAPet == true) {
            // since the dog has an owner, the owner is then printed
            System.out.printf(aDog.owner + " pets his dog, ");
            // the dog object then makes a sound from the sub class dog
            aDog.makeSound();
            // the dogs owner changes since the owner is then set to mary
            aDog.setOwner("Mary");
            // even though the dogs owner has chnaged the original owner is still mike
            // still able to print the original owner, however we are able to get the new
            // owner when needed
            System.out.println("\n" + aDog.owner
                    + " left his dog in another country, who was now being looked after by " + aDog.getOwner());
            // then getting the new owner and following the story
            System.out.printf("\n" + aDog.getOwner() + "'s Dog then started ");
            // using the animal class eat method since dog is a sub class and has inherited
            // this method
            aDog.eat();
        }
        // if the cat exists and has a owner then the if statment will run the following
        // code
        if (aCat.isAPet == true) {
            // printing the current owner
            System.out.printf("\n" + aCat.owner + " strokes her cat, ");
            // sound overwrite of makeSound in animal class
            aCat.makeSound();
            // setting the new owner as Andy
            aCat.setOwner("Andy");
            // able to print andy the new owner and the original owner
            System.out.println("\n" + aCat.getOwner() + " brought the cat off " + aCat.owner);
            // using printf for better formatting of story
            System.out.printf("\n" + aCat.getOwner() + "'s Cat started ");
            // using method of animal superclass which has been inherited by cat
            aCat.sleep();
        }
        // if their is a lion and it exists then the if statement will run the following
        // code
        if (aLion.isAPet == true) {
            // prints the original owner before change
            System.out.printf("\n" + aLion.owner + " loves to admire his lion, ");
            // overwrites super class make sound since its the Lion object which was used
            aLion.makeSound();
            // setting the new owner to Chay
            aLion.setOwner("Chay");
            // getting the new owner using the animal super class, also showing that the old
            // owner can be used from sub class
            System.out.println("\n" + aLion.getOwner() + " stole the lion from " + aLion.owner);
            // demonstration that Lion sub class inherits methods from animal super class
            System.out.printf("\n" + aLion.getOwner() + "'s Lion started ");
            aLion.eat();

        }

    }

}