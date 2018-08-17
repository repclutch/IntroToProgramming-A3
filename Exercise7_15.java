package edu.gsu.chapter07assignments;

import java.util.Scanner;

public class Exercise7_15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int[] numbers = new int[10];
		
		System.out.println("Enter ten numbers: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		System.out.println("The distinct numbers are: ");
	
		printArray(eliminateDuplicates(numbers), 10);

	}

	public static int[] eliminateDuplicates(int[] list) {
		
		int[] array = new int[list.length];
		int tempIndex = 0;
		for (int i = 0; i < array.length; i++) {
			
			boolean duplicate = false;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == list[i]) {
					duplicate = true;
				}
			}
			
			if (!duplicate) {
				array[tempIndex++] = list[i];
			}
		}
		int[] trimmedArray = new int[tempIndex];
		for (int i = 0; i < tempIndex; i++) {
			trimmedArray[i] = array[i];
		}
		return trimmedArray;
	}
	
	public static void printArray(int[] array, int numberPerLine) {
		for (int i = 0; i < array.length; i++) {
			
			System.out.printf("%2d", array[i]);
			if((i + 1) % numberPerLine == 0)
				System.out.println("");
		}
	}
}
