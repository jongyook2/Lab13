package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;

public class Rectangle extends Shape {
	Scanner Enter = new Scanner(System.in);
	private double length, width;
	
	public Rectangle() {
		System.out.print("Enter length and width: ");
		length=Enter.nextDouble();
		width=Enter.nextDouble();
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
	}

	public double calculateArea() {
		return length*width;
	}


	public double calculatePerimeter() {
		return 2*(length+width);
	}
}
