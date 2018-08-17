package edu.gsu.chapter08assignments;

import java.util.Scanner;

public class Exercise8_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double[][] matrix = new double [4][4];
		
		System.out.println("Enter 4-by-4 matrix row by row: ");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}

		System.out.println("The sum of the elements in the major diagnol is " + sumMajorDiagonal(matrix));
		
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		
		double sum = 0;
		for (int row = 0; row < m.length; row++) {
			sum += m[row][row];
		}
		return sum;
	}

}
