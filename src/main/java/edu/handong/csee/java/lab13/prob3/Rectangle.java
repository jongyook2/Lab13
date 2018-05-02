package edu.handong.csee.java.lab13.prob3; //package name
import java.util.Scanner; //import standard input from keyboard

public class Rectangle extends Shape { //Rectangle class inherits Shape class
	Scanner enter = new Scanner(System.in); // instantiate Class Scanner to keyboard(input)
	private double length, width; //declare instance variable length, width

	public Rectangle() { //Constructor
		System.out.print("Enter length and width: ");//output("Enter length and width: ") is shown in your monitor
		length=enter.nextDouble(); //length is input(Double type) from keyboard
		width=enter.nextDouble(); //width is input(Double type) from keyboard
		System.out.println("Length: "+length); //output("Length: "+length) is shown in your monitor
		System.out.println("Width: "+width); //output("Width: "+width) is shown in your monitor
	}

	public double calculateArea() { //declare calculateArea method(public double type)
		return length*width; // return area(length*width)
	}


	public double calculatePerimeter() {//declare calculatePerimeter method(public double type)
		return 2*(length+width); //return perimeter(2*(length+width))
	}
}
