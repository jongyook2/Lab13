package edu.handong.csee.java.lab13.prob3; //package name

public abstract class Shape { //declare Shape class(public abstract)
	public abstract double calculateArea(); //declare calculateArea method(abstract)
	public abstract double calculatePerimeter(); //declare calculatePerimeter method(abstract)
	public void printCalculation() { //declare printCalculation method(void)
		System.out.println("Area: "+calculateArea()+"\nPerimeter: "+calculatePerimeter()+"\n"); //print Area and Perimeter
	}
}
