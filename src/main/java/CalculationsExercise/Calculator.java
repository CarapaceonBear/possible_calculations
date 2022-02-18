package CalculationsExercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {

	static ArrayList<String> result;

	// reorders number list, for iteration through the list
	public static int[] reorder(int[] numbers) {
		Arrays.sort(numbers);
		return numbers;
	}
	
	// print to console, separate from calculations
	public static void Print(ArrayList<String> result) {
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));	
		}
	}
	
	// Calculations calls Addition, then Multiplication
	// appends all results to a single ArrayList
	// removes duplicate entries, returns to main
	public static ArrayList<String> Calculations(int[] numbers) {
		numbers = reorder(numbers);
		result = new ArrayList<String>();
		
		ArrayList<String> additionResults = Addition(numbers);
		for (int i = 0; i < additionResults.size(); i++){
			result.add(additionResults.get(i));
		}
		ArrayList<String> multiplicationResults = Multiplication(numbers);
		for (int i = 0; i < multiplicationResults.size(); i++) {
			result.add(multiplicationResults.get(i));
		}
		for (int i = 0; i < result.size(); i++) {
			for (int j = (i + 1); j < result.size(); j++)
				if (result.get(i).equals(result.get(j))) {
					result.remove(j);
					j--;
			}
		}	
		return result;
	}
	
	// Addition iterates through the list, adding every other possible number
	// checks this sum against every subsequent member of the list
	// appends results to ArrayList for return to Calculations
	public static ArrayList<String> Addition(int[] numbers) {
		ArrayList<String> additionSuccess = new ArrayList<String>();
		for (int i = 0;  i < numbers.length; i++) {
			for (int j = (i + 1); j < numbers.length; j++) {
				int find = numbers[i] + numbers[j];
				for (int k = (j + 1); k < numbers.length; k++) {
					if (find == numbers[k]) {
						additionSuccess.add(numbers[i] + " + " + numbers[j] + " = " + numbers[k]);
						additionSuccess.add(numbers[k] + " - " + numbers[j] + " = " + numbers[i]);
					}
				}
			}
		}
		return additionSuccess;
	}
	
	// Multiplication works the same as addition
	// includes edge case for multiple instances of 0 in the list
	//   necessary becase 0 reduces the value, so must check against earlier in the list
	public static ArrayList<String> Multiplication(int[] numbers){	
		ArrayList<String> multiplicationSuccess = new ArrayList<String>();		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = (i + 1); j < numbers.length; j++) {
				int find = numbers[i] * numbers[j];
				// = edge case for multiple instances of 0 in list = //
				if (find == 0 && numbers[i+1] == 0 && j != 1) {
					multiplicationSuccess.add(numbers[i] + " x " + numbers[j] + " = 0");}
				// = = = = = = = = = = = = = = = = = = = = = = = = = //
				for (int k = (j + 1); k < numbers.length; k++) {
					if (find == numbers[k] && find != 0) {
						multiplicationSuccess.add(numbers[i] + " x " + numbers[j] + " = " + numbers[k]);
						multiplicationSuccess.add(numbers[k] + " / " + numbers[j] + " = " + numbers[i]);
					}
				}
			}
		}
		return multiplicationSuccess;
	}	
}
