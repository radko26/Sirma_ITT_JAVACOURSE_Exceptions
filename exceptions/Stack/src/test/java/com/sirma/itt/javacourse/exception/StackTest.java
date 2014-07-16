package com.sirma.itt.javacourse.exception;

import org.junit.Test;

import com.sirma.itt.javacourse.exception.Stack;
import com.sirma.itt.javacourse.exception.StackEmptyException;
import com.sirma.itt.javacourse.exception.StackFullException;

/**
 * Test class for @Stack.class
 * 
 * @author radoslav
 */
public class StackTest {
	private Stack testStack;
	private Object[] stackArray = new Object[5];

	/**
	 * Tries to add element when the stack is full.
	 * 
	 * @throws StackFullException
	 *             when you try to add when the stack is full
	 */
	@Test(expected = StackFullException.class)
	public void testAddOverflow() throws StackFullException {
		testStack = new Stack(stackArray);
		while (true) {
			testStack.add(new Object());
		}
	}

	/**
	 * Tries to remove when no elements have left.
	 * 
	 * @throws StackEmptyException
	 *             when there aren't any elements left
	 */
	@Test(expected = StackEmptyException.class)
	public void testRemoveWhenEmpty() throws StackEmptyException {
		testStack = new Stack(stackArray);
		while (true) {
			testStack.remove();
		}
	}
}
