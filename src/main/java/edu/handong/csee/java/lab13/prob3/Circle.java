package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;

public class Circle extends Shape {
	Scanner Enter = new Scanner(System.in);
	private double radius;
	public Circle() {
		System.out.print("Enter radius: ");
		radius = Enter.nextDouble();
		System.out.println("Radius: "+radius);
		}
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	public double calculatePerimeter() {
		return Math.PI*radius*2;
	}
}
