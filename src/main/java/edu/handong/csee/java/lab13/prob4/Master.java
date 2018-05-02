package edu.handong.csee.java.lab13.prob4; //package name
import java.util.Scanner; //import standard input from keyboard

public class Master { //declare Master class
	public void printFeed(Pet Animal) { //declare printFeed method
		System.out.println("\nfeed: "+Animal.feedSomething());//print animals'feed
	}
	public static void main(String[] args) { //declare main method
		Scanner name = new Scanner(System.in); // instantiate Class Scanner to keyboard(input)
		Master master = new Master(); //instantiate Master Class to Master(instance)
		Cat cat = new Cat(); //instantiate Cat Class to Cat(instance)
		Dog dog = new Dog(); //instantiate Dog Class to Dog(instance)
		System.out.print("Enter the cat name and dog name: "); //print(Enter the cat name and dog name:)
		String catName = name.next(); //catName is input(String type) from keyboard
		String dogName = name.next(); //dogName is input(String type) from keyboard
		cat.printAnimalName(catName); //call Cat's printAnimalName method
		master.printFeed(cat); //call Master's printFeed method
		dog.printAnimalName(dogName); //call Dog's printAnimalName method
		master.printFeed(dog); //call Master's printFeed method
	}
}
