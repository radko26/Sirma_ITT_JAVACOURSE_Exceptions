package com.sirma.itt.javacourse.exception;

/**
 * Exception if the stack is full.
 * 
 * @author radoslav
 */
public class StackFullException extends Exception {
	public StackFullException() {
	}

	public String printException() {
		return ("Stack is full");
	}
}
