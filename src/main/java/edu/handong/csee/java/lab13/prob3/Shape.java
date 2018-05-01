package edu.handong.csee.java.lab13.prob3; //package name

public abstract class Shape {
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	public void printCalculation() {
		System.out.println("Area: "+calculateArea()+"\nPerimeter: "+calculatePerimeter()+"\n");
	}
}
