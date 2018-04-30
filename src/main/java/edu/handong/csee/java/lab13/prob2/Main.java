package edu.handong.csee.java.lab13.prob2; //package name

public class Main { //declare Main Class
	public static void main(String[] args) { //declare main method
		Book Book = new Book("Simple Book"); //instantiate Book Class to Book(instance)
		Science Science = new Science("Hello Physical!","ScienceWorld"); //instantiate Science Class to Science(instance)
		History History = new History("What Is history?","E.H.Carr"); //instantiate History Class to History(instance)
		History History2 = new History("The South Korea","Judis"); //instantiate History Class to History2(instance)
		Book.showInfo(); //call Book's showInfo method
		Science.showInfo(); //call Science's showInfo method
		History.showInfo(); //call History's showInfo method
		History2.showInfo(); //call History2's showInfo method
	}
}
