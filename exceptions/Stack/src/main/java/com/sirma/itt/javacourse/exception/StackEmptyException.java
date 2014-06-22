package com.sirma.itt.javacourse.exception;

/**
 * Exception if the stack is empty.
 * 
 * @author radoslav
 */
public class StackEmptyException extends Exception {
	public StackEmptyException() {
	}

	public String printException() {
		return ("Stack is empty");
	}
}
