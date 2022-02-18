package CalculationsExercise;

import java.util.Scanner;

public class UserInput {
	
	public static int[] input() {
		Scanner x = new Scanner(System.in);
		String fromUser = x.nextLine();
		x.close();
		
		// convert input String into array of numbers, for calculations
		String[] y = fromUser.split(" ");
		int[] numbers = new int[y.length];
		for (int i = 0; i < y.length; i++) {
			numbers[i] = Integer.valueOf(y[i]);
		}
		
		return numbers;
	}
}	

