package edu.handong.csee.java.lab13.prob3; //package name
import java.util.Scanner; //import standard input from keyboard

public class Circle extends Shape { //Circle class inherits Shape class
	Scanner enter = new Scanner(System.in); // instantiate Class Scanner to keyboard(input)
	private double radius; //declare instance variable radius
	public Circle() { //Constructor
		System.out.print("Enter radius: "); //output("Enter radius") is shown in your monitor
		radius = enter.nextDouble(); //radius is input(Double type) from keyboard
		System.out.println("Radius: "+radius); //output("Radius: "+radius) is shown in your monitor
	}
	public double calculateArea() { //declare calculateArea method(public double type)
		return Math.PI*radius*radius; // return area(pi*radius^2)
	}
	public double calculatePerimeter() { //declare calculatePerimeter method(public double type)
		return Math.PI*radius*2; //return perimeter(2*radius*pi)
	}
}
