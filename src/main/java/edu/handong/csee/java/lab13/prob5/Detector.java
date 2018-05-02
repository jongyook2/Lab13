package edu.handong.csee.java.lab13.prob5;
import java.util.Scanner;

public class Detector {
	int row, column;
	Scanner Num = new Scanner(System.in);
	int array[][];
	public int[][] getArray() {
		return array;
	}
	public void setArray(int[][] array) {
		this.array = array;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}

	public Detector() {
		System.out.print("Enter row size(maxium 5): ");
		setRow(Num.nextInt());
		System.out.print("Enter column size(maxium 5): ");
		setColumn(Num.nextInt());
	}
	public void generateArray(int list) {
		array=new int[getRow()][getColumn()];
		System.out.print("Enter List"+list+": ");
		for(int i=0;i<getRow();i++) {
			for(int j=0;j<getColumn();j++) {
				array[i][j] = Num.nextInt();
			}
		}
	}
	public void printArray() {
		for(int i=0;i<getRow();i++) {
			for(int j=0;j<getColumn();j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static boolean equals(int array1[][], int array2[][]) {
		if(array1.length != array2.length) {//row
			return false;
		}
		int count=0;
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array1[i].length; j++) {
				if(array1[i][j] != array2[i][j]){
					count++;
				}
			}
		}
		if(count>3)
			return false;
		else 
			return true;
	}
	public static void main(String[] args) {
		Detector Array1 =new Detector();
		Detector Array2 = new Detector();
		Array1.generateArray(1);
		Array2.generateArray(2);
		Array1.printArray();
		Array2.printArray();
		if(Array1.equals(Array1.getArray(), Array2.getArray()))
			System.out.println("The two arrays are approximately identical");
		else
			System.out.println("The two arrays are not identical");
	}
}
