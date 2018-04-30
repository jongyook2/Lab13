package edu.handong.csee.java.lab13.prob2; //package name

public class Book { //declare Book Class
	private static int id=0; //static variable id(private int)
	private int index; //instance variable index(private int)
	private String bookName; //instance variable bookName(String)
	public Book(String name) { //Constructor Book(name)
		bookName=name; //store name in bookName
		index=++id; //index is id+1
	}
	public String copyString() { //declare copyString method(String type)
		return "\tId: "+index+"\n\tBook Name: "+bookName; //return "\tId: "+index+"\n\tBook Name: "+bookName
	}
	public void showInfo() { //declare showInfo method(void type)
		System.out.println("<<<BOOK>>>\n"+this.copyString()); //output("<<<BOOK>>>\n"+this.copyString()) is shown in your monitor
	}
}
