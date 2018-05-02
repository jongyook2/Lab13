package edu.handong.csee.java.lab13.prob2; //package name

public class Main { //declare Main Class
	public static void main(String[] args) { //declare main method
		Book book = new Book("Simple Book"); //instantiate Book Class to book(instance)
		Science science = new Science("Hello Physical!","ScienceWorld"); //instantiate Science Class to science(instance)
		History history = new History("What Is history?","E.H.Carr"); //instantiate History Class to history(instance)
		History history2 = new History("The South Korea","Judis"); //instantiate History Class to history2(instance)
		book.showInfo(); //call Book's showInfo method
		science.showInfo(); //call Science's showInfo method
		history.showInfo(); //call History's showInfo method
		history2.showInfo(); //call History2's showInfo method
	}
}
