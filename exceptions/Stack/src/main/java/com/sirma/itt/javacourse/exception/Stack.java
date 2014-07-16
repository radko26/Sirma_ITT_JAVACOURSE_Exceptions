package com.sirma.itt.javacourse.exception;

/**
 * A sort of stack implementation - last in, first out.
 * 
 * @author radoslav
 */
public class Stack {
	private Object[] stack;
	private int lastIndex;

	public Stack(Object[] array) {
		stack = array;
		lastIndex = 0;
	}

	/**
	 * Removes the last added element.
	 * 
	 * @throws StackEmptyException
	 *             when no elements have left for removing
	 */
	public void remove() throws StackEmptyException {
		if (lastIndex >= 0) {
			stack[lastIndex] = null;
			lastIndex--;
		} else {
			throw new StackEmptyException("Stack is empty");
		}
	}

	/**
	 * Adds a new element at the end.
	 * 
	 * @param object
	 *            object to be inserted
	 * @throws StackFullException
	 *             when the stack is full
	 */
	public void add(Object object) throws StackFullException {
		if (lastIndex >= stack.length) {
			throw new StackFullException("stack is full");
		} else {
			stack[lastIndex] = object;
			lastIndex++;
		}
	}

	/**
	 * Prints all elements to the screen
	 */
	public void printAllElements() {
		for (int i = 0; i < lastIndex; i++) {
			if (i == 0) {
				System.out.print("Stack contains: ");
			}
			System.out.print(stack[i] + " ");
			if (i == lastIndex - 1) {
				System.out.print("\n");
			}
		}
		if ( !(lastIndex >0 ) ) {
			System.out.println("Stack is empty");
		}
	}
}
