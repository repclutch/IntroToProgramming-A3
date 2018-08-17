package edu.gsu.chapter07assignments;

import java.util.Scanner;

public class Exercise7_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter any amount of scores (a negative number will end it): ");
		
		int numbers;
		int numOfScores = 0, averageOfScores = 0;
		int[] scores = new int [100];
				
		for (int i = 0; i < 100; i++) {
			numbers = input.nextInt();
			if (numbers < 0) 
				break;
			
			scores[i] = numbers;
			averageOfScores += numbers;
			numOfScores++;
		}
		
		averageOfScores /= numOfScores;
		
		int aboveOrEqualAverage = 0, belowAverage = 0;
		
		for (int i = 0; i < numOfScores; i++) {
			if (scores[i] >= averageOfScores)
				aboveOrEqualAverage++;
			else
				belowAverage++;
		}
		
		System.out.println("The average of all the scores is: " + averageOfScores);
		System.out.println("The number of scores that are above or equal to the average are: " + aboveOrEqualAverage);
		System.out.println("The number of scores that are below the average are: " + belowAverage);

	}

}
