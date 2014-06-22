package com.sirma.itt.javacourse.exception;

/**
 * A sort of stack implementation - FIFA
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
	 */
	public void remove() throws StackEmptyException {
		if (lastIndex > 0) {
			stack[lastIndex] = null;
			lastIndex--;
		} else
			throw new StackEmptyException();
	}

	/**
	 * Add a new element at the end.
	 * 
	 * @param object
	 * @throws StackFullException
	 */
	public void add(Object object) throws StackFullException {
		if (lastIndex >= stack.length) {
			throw new StackFullException();
		} else {
			stack[lastIndex] = object;
			lastIndex++;
		}
	}

	public void printAllElements() {
		boolean empty = true;
		for (int i = 0; i < lastIndex; i++) {
			if (i == 0) {
				System.out.print("Stack contains: ");
			}

			System.out.print(stack[i] + " ");
			if (i == lastIndex - 1) {
				System.out.print("\n");
			}
			empty = false;
		}
		if (empty) {
			System.out.println("Stack is empty");
		}
	}

}
