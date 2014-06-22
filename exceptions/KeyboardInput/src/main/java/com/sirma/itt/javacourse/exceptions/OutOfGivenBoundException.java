package com.sirma.itt.javacourse.exceptions;

/**
 * 
 * 
 * @author radoslav
 */
@SuppressWarnings("serial")
public class OutOfGivenBoundException extends Exception {
	public OutOfGivenBoundException() {

	}

	public String printException() {
		return ("Entered number is not in the bounds");
	}
}
