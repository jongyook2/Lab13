package edu.handong.csee.java.lab13.prob6; //package name

public class Prob6 { //declare Prob6 class
	public static void main(String[] args) { //declare main method
		DownPoint dp1 = new DownPoint(2,5); //instantiate DownPoint Class to dp1(instance)
		DownPoint dp2 = new DownPoint(4,7); //instantiate DownPoint Class to dp2(instance)
		UpPoint up1 = new UpPoint(3,3); //instantiate upPoint Class to up1(instance)
		UpPoint up2 = new UpPoint(9,12); //instantiate upPoint Class to up2(instance)

		Printer.print(up1); //call Printer's print method(up1)
		Printer.print(dp1); //call Printer's print method(dp1)
		Printer.print(dp2); //call Printer's print method(dp2)
		Printer.print(up2); //call Printer's print method(up2)
	}
}
