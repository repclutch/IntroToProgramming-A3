package edu.gsu.chapter07assignments;

import java.util.Scanner;

public class Exercise7_26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int listSize;
		
		System.out.println("Enter list1: ");
		listSize = input.nextInt();
		
		int[] list1 = new int[listSize];
		for (int i = 0; i < listSize; i++) 
			list1[i] = input.nextInt(); // this saves the input to the array
		
		System.out.println("Enter list2: ");
		listSize = input.nextInt();
		
		int[] list2 = new int[listSize];
		for (int i = 0; i < listSize; i++)
			list2[i] = input.nextInt();
		
		if (equals(list1, list2)) {
			System.out.println("Two lists are strictly identical");
		} else {
			System.out.println("Two lists are not strictly identical");
		}
		
		
		
	}

	public static boolean equals(int[] list1, int[] list2) {
		
		if (list1.length != list2.length)
				return false;
		
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i])
					return false;
		}
		
		return true;
	}
}
