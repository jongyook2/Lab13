package edu.handong.csee.java.lab13.prob6; //package name

public class Printer { //declare Printer class

	public static void print(Object Point) { //declare print method
		if(Point instanceof CapitalPrint) { //if Point inherits CaptialPrint interface
			System.out.println(Point.toString().toUpperCase()); //print UpperCase version
		}
		else // if not
			System.out.println(Point.toString()); //print toStirng's return value(string)
	}
}
