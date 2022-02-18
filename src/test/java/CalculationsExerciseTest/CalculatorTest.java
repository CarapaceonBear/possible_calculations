package CalculationsExerciseTest;

import java.util.ArrayList;

import static org.junit.Test.*;
import static org.junit.Assert.*;
import org.junit.*;

import CalculationsExercise.Calculator;

public class CalculatorTest {
	
	int[] x = {2, 4, 6, 8};
	
	@BeforeClass
	public static void setup() {
		System.out.println("testing begins");
	}
	
	@Test
	public void reorderTest() {
		x = Calculator.reorder(x);
		boolean validTest = true;
		for (int i = 0; i < (x.length - 1); i++) {
			if (x[i] > x[i + 1]) {
				validTest = false;
			}
		}
		assertTrue("Reorder function failed", validTest);
	}
	
	@Test
	public void addTest() {
		ArrayList<String> y = Calculator.Addition(x);
		boolean validTest = false;
		if (y.get(0).equals("2 + 4 = 6") && (y.get(2).equals("2 + 6 = 8"))) {
			validTest = true;
		}
		assertTrue("addition failed", validTest);	
	}
	
	@Test
	public void subtractTest() {
		ArrayList<String> y = Calculator.Addition(x);
		boolean validTest = false;
		if (y.get(1).equals("6 - 4 = 2") && (y.get(3).equals("8 - 6 = 2"))) {
			validTest = true;
		}
		assertTrue("subtraction failed", validTest);	
	}
	
	@Test
	public void multiplyTest() {
		ArrayList<String> y = Calculator.Multiplication(x);
		boolean validTest = false;
		if (y.get(0).equals("2 x 4 = 8")) {
			validTest = true;
		}
		assertTrue("multiplication failed", validTest);
	}
	@Test
	public void divideTest() {
		ArrayList<String> y = Calculator.Multiplication(x);
		boolean validTest = false;
		if (y.get(1).equals("8 / 4 = 2")) {
			validTest = true;
		}
		assertTrue("multiplication failed", validTest);
	}
	
	@Test
	public void calculationTest() {
		ArrayList<String> y = Calculator.Calculations(x);
		boolean validTest = false;
		if (y.get(0).equals("2 + 4 = 6") && (y.get(4).equals("2 x 4 = 8"))) {
			validTest = true;
		}
		assertTrue("calculation failed", validTest);
	}
	
	
}
