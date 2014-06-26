package com.sirma.itt.javacourse.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Inputs an integer and throws a custom exception if it less than 0 or greater
 * than 100
 * 
 * @author radoslav
 */

public class KeyboardInput {
	private Scanner keyboardInput;
	private int number;

	public int input() throws OutOfGivenBoundException, InputMismatchException {
		keyboardInput = new Scanner(System.in);
		try {
			number = keyboardInput.nextInt();
		} catch (InputMismatchException e) {
			throw new InputMismatchException("Enter number please");
		}
		if (number < 0 || number > 100) {
			throw new OutOfGivenBoundException("Out of given range");
		}
		return number;
	}
}
