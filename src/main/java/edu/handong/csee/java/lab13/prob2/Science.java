package edu.handong.csee.java.lab13.prob2; //package name

public class Science extends Book{ //Science class inherits Book class
	private String publisher; //instance variable publisher(String)
	public Science(String name, String publisher) { //Constructor Science(name,publisher)
		super(name); //call parent's Constructor(Book(name))
		this.publisher=publisher; //store publisher in this.publisher
	}
	public String copyString() { //declare copyString method(String type)
		return super.copyString()+"\n\tpublisher: "+publisher; //return BookClass's copyString method + publisher
	}
	public void showInfo() { //declare showInfo method(void type)
		System.out.println("<<<Science>>>\n"+this.copyString()); //output("<<<Science>>>\n"+this.copyString()) is shown in your monitor
	}
}
