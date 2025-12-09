package exam.codewriting;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Q04 {

	/*
	We wish to create a method to create and fill an array of doubles. Complete the fillDoubleArray
	method below by first creating an array of doubles of size n. You should then iterate through the array
	and fill it by reading doubles from the Scanner in parameter. The method should then return the filled
	array.
	 */
	public static double[] fillDoubleArray (int n, Scanner in) {
		double [] array = new double[n];
		System.out.println("Filling array");
		for (int i =0; i<array.length;i++){
			System.out.println("Enter value: ");
			array[i] = in.nextDouble();
		}
		return array;
	}

	/*
	We wish to make a program that draws user-defined polygons. You should first request the user to specify
	how many sides the polygon should have. Then, use the fillDoubleArray method from the previous
	part to create the two necessary arrays before drawing the polygon. The main method has already been
	started for you:
	 */
	public static void main ( String[] args ) {
		Scanner in = new Scanner ( System .in );
		System.out.println("How many sides?: ");
		int n = in.nextInt();
		//use StdDraw.polygon and fillDoubleArray
		double [] arrayX = fillDoubleArray(n,in);
		double [] arrayY = fillDoubleArray(n,in);
		StdDraw.polygon(arrayX, arrayY);
	}

}
