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
	private static Scanner keyboardInput;
	static int number;

	private static int input(int number) throws OutOfGivenBoundException {
		keyboardInput = new Scanner(System.in);
		try {
			number = keyboardInput.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		if (number < 0 || number > 100) {
			throw new OutOfGivenBoundException();
		}
		return number;
	}

	public static void main(String[] args) {
		try {
			number = input(number);
		} catch (OutOfGivenBoundException e) {
			System.out.println(e.printException());
		}
	}
}
