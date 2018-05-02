package edu.handong.csee.java.lab13.prob5; //package name
import java.util.Scanner; //import standard input from keyboard

public class Detector { //declare Detector class
	int row, column; //instance variable row column(int)
	Scanner num = new Scanner(System.in); // instantiate Class Scanner to keyboard(input)
	int array[][]; //declare array[][] (int)
	public int[][] getArray() { //array getter
		return array; //return array
	}
	public void setArray(int[][] array) { //array setter
		this.array = array; //store array in this.array;
	}
	public int getRow() { //Row getter
		return row; //return row
	}
	public void setRow(int row) { //Row setter
		this.row = row; //store row in this.row;
	}
	public int getColumn() { //Column getter
		return column; //return column
	}
	public void setColumn(int column) { //Column setter
		this.column = column; //store column in this.column;
	}

	public Detector() { //Constructor
		System.out.print("Enter row size(maxium 5): ");//print(Enter row size(maxium 5):)
		setRow(num.nextInt()); //call setRow method and store Row size
		System.out.print("Enter column size(maxium 5): ");//print(Enter column size(maxium 5):)
		setColumn(num.nextInt()); //call setColumn method and store Column size
	}
	public void generateArray(int list) { //declare generateArray method
		array=new int[getRow()][getColumn()];// instantiate array[Row][Column]
		System.out.print("Enter List"+list+": "); //print(Enter List"+list+":)
		for(int i=0;i<getRow();i++) { //for loop (0 to Row-1)
			for(int j=0;j<getColumn();j++) { //for loop (0 to Column-1)
				array[i][j] = num.nextInt(); //store number(input) in array[i][j]
			}
		}
	}
	public void printArray() { //declare printArray method
		for(int i=0;i<getRow();i++) { //for loop (0 to Row-1)
			for(int j=0;j<getColumn();j++) { //for loop (0 to Column-1)
				System.out.print(array[i][j]+" "); //print array[i][j]'s number
			}
			System.out.println(); //enter
		}
		System.out.println(); //enter
	}
	public static boolean equals(int array1[][], int array2[][]) { //declare equal method(boolean)
		if(array1.length != array2.length) {//if array's row is different
			return false; //return false
		}
		int count=0; //local variable count and initiate to 0
		for(int i=0; i<array1.length; i++) { //for loop (0 to array1.length-1)
			for(int j=0; j<array1[i].length; j++) { //for loop (0 to array1[i].length-1)
				if(array1[i][j] != array2[i][j]){ //if array1[i][j] is different from array2[i][j]
					count++; //increase count value(plus 1)
				}
			}
		}
		if(count>3) //if count is larger than 3
			return false; //return false
		else //if not
			return true; //return true
	}
	public static void main(String[] args) { //declare main method
		Detector array1 =new Detector(); //instantiate Detector Class to array1(instance)
		Detector array2 = new Detector(); //instantiate Detector Class to array2(instance)
		array1.generateArray(1); //call array1's generateArray(1) method
		array2.generateArray(2); //call array2's generateArray(2) method
		array1.printArray(); //call array1's printArray method
		array2.printArray(); //call array2's printArray method
		if(array1.equals(array1.getArray(), array2.getArray())) //if arrays are almost identical(count<=3) 
			System.out.println("The two arrays are approximately identical"); //print(The two arrays are approximately identical)
		else // false
			System.out.println("The two arrays are not identical"); //print(The two arrays are not identical)
	}
}
