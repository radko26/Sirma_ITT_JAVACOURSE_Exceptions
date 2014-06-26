package com.sirma.itt.javacourse.exceptions;

/**
 * OutOfGivenBoundException occur when the number is out of the given range.
 * 
 * @author radoslav
 */
public class OutOfGivenBoundException extends Exception {
	public OutOfGivenBoundException(String msg) {
		super(msg);
	}
}
