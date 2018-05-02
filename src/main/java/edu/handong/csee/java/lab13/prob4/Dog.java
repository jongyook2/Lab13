package edu.handong.csee.java.lab13.prob4; //package name

public class Dog extends Animal implements Pet{ //Dog class inherits Animal class and Pet interface
	public String feedSomething() { //declare feedSomething method
		return "(Dog!)Sausage"; //return String((Dog!)Sausage)
	}
}
