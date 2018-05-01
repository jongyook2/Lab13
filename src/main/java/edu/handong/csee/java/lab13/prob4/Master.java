package edu.handong.csee.java.lab13.prob4;
import java.util.Scanner;

public class Master {
	public void printFeed(Pet Animal) {
		System.out.println("\nfeed: "+Animal.feedSomething());
	}
	public static void main(String[] args) {
		Scanner Name = new Scanner(System.in);
		Master Master = new Master();
		Cat Cat = new Cat();
		Dog Dog = new Dog();
		System.out.print("Enter the cat name and dog name: ");
		String catName = Name.next();
		String dogName = Name.next();
		Cat.printAnimalName(catName);
		Master.printFeed(Cat);
		Dog.printAnimalName(dogName);
		Master.printFeed(Dog);
	}
}
