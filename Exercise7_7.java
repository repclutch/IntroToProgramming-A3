package edu.gsu.chapter07assignments;

public class Exercise7_7 {

	public static void main(String[] args) {

		int num;
		int[] randNumbers = new int[100];
		int[] counts = new int[10];
		
		for (int i = 0; i < randNumbers.length; i++) {
			num = (int)(Math.random() * 10);
			randNumbers[i] = num;
			counts[num]++;
		}
		
		for (int i = 0; i < randNumbers.length; i++) {
			System.out.print(randNumbers[i] + " ");
			if ((i + 1) % 10 == 0)
				System.out.println("");
		}
		 
		System.out.println("\n*** The # of occurences for each number *** \n");
		for (int i = 0; i < counts.length; i++) {
			System.out.println("The number of occurences for: " + i + " = " + counts[i]);
		}

	}
}
