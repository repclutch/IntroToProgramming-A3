package edu.gsu.chapter08assignments;

import java.util.Scanner;

public class Exercise8_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		double[][] matrix1 = new double [3][3];
		double[][] matrix2 = new double [3][3];
		
		System.out.print("Enter matrix1: ");
		for (int i = 0; i < matrix1.length; i++) 
			for (int j = 0; j < matrix1[i].length; j++) 
				matrix1[i][j] = input.nextDouble();
		
		System.out.print("Enter matrix2: ");
		for (int i = 0; i < matrix2.length; i++) 
			for (int j = 0; j < matrix2[i].length; j++) 
				matrix2[i][j] = input.nextDouble();
			
		double[][] addedMatrix = addMatrix(matrix1, matrix2);
		
		for (int i = 0; i < matrix1.length; i++) {
			
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.printf("%2.1f ", matrix1[i][j]);
				if (i == 1 && j == 2)
					System.out.printf("%2s ", " + ");
				else 
					System.out.printf("%3s ", " ");
					
			}
			
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.printf("%2.1f ", matrix2[i][j]);
				if (i == 1 && j == 2)
					System.out.printf("%2s ", " = ");
				else 
					System.out.printf("%3s ", " ");
					
			}
			
			for (int j = 0; j < addedMatrix[i].length; j++) {
				System.out.printf("%4.1f ", addedMatrix[i][j]);
			}
			System.out.println("");
		}
		
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		
		double[][] addedMatrix = new double [a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				addedMatrix[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return addedMatrix;
		
	}
}
