package CalculationsExercise;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Please input your numbers, separated by spaces\n eg. 1 6 4\n");

		int[] numbers = UserInput.input();
		
		ArrayList<String> result;
		
		result = Calculator.Calculations(numbers);
		
		Calculator.Print(result);

	}
}
