/****************************************/
//* Name:   Chay Tyndall SID: 1610314   *//
//* Task:     Task 4 Part (d)           *//
//* Description: Cat.java               *//
//* Date:     12th Feb 2020             *//
//*                                     *//
/*****************************************/ 
//this class is a sub class of Animal superclass
public class Cat extends Animal {
    //Cat sub class of Animal

    //method used to print Meow! and return no vaule 
    public void meow() {
    	//method prints "meow when called'
        System.out.println("Meow!");
    }
    //method move() used as the body of the abstraction method
    //prints Jumping when inherited
    public void move(){
        System.out.println("Jumping");
    }

	

	
}