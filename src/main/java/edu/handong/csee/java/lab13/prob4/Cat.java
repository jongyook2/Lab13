package edu.handong.csee.java.lab13.prob4; //package name

public class Cat extends Animal implements Pet { //Cat class inherits Animal class and Pet interface
	public String feedSomething() { //declare feedSomething method
		return "(Cat!)Fish"; //return String((Cat!)Fish)
	}
}
