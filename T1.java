package com.testCase;
abstract class T1 {
	  abstract void makeSound();

	  public void eat() {
	    System.out.println("I can eat.");
	  }
	}

	class Dog extends T1 {

	  // provide implementation of abstract method
	  public void makeSound() {
	    System.out.println("Bark bark");
	  }
	}

	class Main {
	  public static void main(String[] args) {

	    // create an object of Dog class
	    Dog d1 = new Dog();

	    d1.makeSound();
	    d1.eat();
	  }
	}

