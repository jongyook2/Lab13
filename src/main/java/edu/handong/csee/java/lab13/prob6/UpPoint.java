package edu.handong.csee.java.lab13.prob6; //package name

public class UpPoint implements CapitalPrint{ //declare DownPoint class and inherits CapitalPrint interface
	private int x,y; //instance variable x,y(private int)
	UpPoint(int x, int y){ //Constructor
		this.x = x; //store x in this.x
		this.y = y; //store y in this.y
	}
	public String toString() { //declare toString method (generating)

		return "x : "+x+" y : "+y; //return "x : "+x+" y : "+y (string)
	}
}
