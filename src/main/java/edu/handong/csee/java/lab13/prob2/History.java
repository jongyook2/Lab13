package edu.handong.csee.java.lab13.prob2; //package name

public class History extends Book{ //History class inherits Book class
	private String author; //instance variable author(String)
	public History(String name, String author) { //Constructor History(name,author)
		super(name); //call parent's Constructor(Book(name))
		this.author=author; //store author in this.author
	}
	public String copyString() { //declare copyString method(String type)
		return super.copyString()+"\n\tAuthor: "+author; //return BookClass's copyString method + author
	}
	public void showInfo() { //declare showInfo method(void type)
		System.out.println("<<<History>>>\n"+this.copyString());  //output("<<<Histoty>>>\n"+this.copyString()) is shown in your monitor
	}
}
