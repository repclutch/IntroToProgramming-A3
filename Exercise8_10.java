package edu.gsu.chapter08assignments;

public class Exercise8_10 {

	public static void main(String[] args) {
		
		int[][] matrix = new int [4][4];
		
		int largestRow = 0;
		int largest = -1;
		for (int i = 0; i < matrix.length; i++) {
			int rows = 0;
			for (int j = 0; j < matrix[i].length; j++) { // loop to find the largest row index 
				matrix[i][j] = (int)(Math.random() * 2); // generating random 0s and 1s
				rows += matrix[i][j];
			}
			
			if (rows > largest) {
				largestRow = i;
				largest = rows;
			}
		}
		
		int largestColumn = 0;
		largest = -1;
		for (int j = 0; j < matrix[0].length; j++) { // loop to find the largest column index
			int columns = 0;
			for (int i = 0; i < matrix.length; i++) {
				columns += matrix[i][j];
			}
			if (columns > largest) {
				largest = columns;
				largestColumn = j;
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {   // this whole loop displays the matrix in its formatted rows and columns
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%d", matrix[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.println("The largest row index: " + largestRow);
		System.out.println("The largest column index: " + largestColumn);

	}

}
