package edu.gsu.chapter07assignments;

import java.util.Scanner;

public class Exercise7_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		int[] numbers = new int[5];
		
		System.out.println("Enter 5 numbers: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		System.out.println("The GCD is " + gcd(numbers));
	}

	public static int gcd(int... numbers) {
		int gcd = minimum(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] % gcd == 0) {
				numbers[i] = gcd;
			} else {
				numbers[i] = numbers[i] % gcd;
			}
		}
		
		if (gcd == minimum(numbers)) {
			return gcd;
		}
		return gcd(numbers);
	}
	
	public static int minimum(int... numbers) {
		
		int minimum = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (minimum > numbers[i]) {
				minimum = numbers[i];
			}
		}
		return minimum;
	}
}
