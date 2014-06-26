package com.sirma.itt.javacourse.exceptions;

import java.util.InputMismatchException;

/**
 * Main to run and test it.
 * 
 * @author radoslav
 */
public class Main {
	public static void main(String[] args) throws InputMismatchException,
			OutOfGivenBoundException {
		KeyboardInput input = new KeyboardInput();
		int number;
		number = input.input();
	}
}
