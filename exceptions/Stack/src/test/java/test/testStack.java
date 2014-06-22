package test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.sirma.itt.javacourse.exception.Stack;
import com.sirma.itt.javacourse.exception.StackEmptyException;
import com.sirma.itt.javacourse.exception.StackFullException;

/**
 * Test class for @Stack.class
 * 
 * @author radoslav
 */
public class testStack {

	private static final int SIZE = 2;
	private Stack testStack;
	private Object[] stackArray;

	@Before
	public void init() {
		stackArray = new Object[SIZE];
		testStack = new Stack(stackArray);
	}

	@Test
	/**
	 * Tries to add element when the stack is full.
	 */
	public void testAddOverflow() {
		while (true) {
			try {
				testStack.add(new Object());
			} catch (StackFullException e) {
				fail("testAddOverflow failed " + e.printException());
			}
		}
	}

	@Test
	/**
	 * Tries to remove when no elements left.
	 */
	public void testRemoveWhenEmpty() {
		while (true) {
			try {
				testStack.remove();
			} catch (StackEmptyException e) {
				fail("testRemoveWhenEmpty failed" + e.printException());
			}
		}
	}

	@Test
	public void testAddElement() {
		try {
			testStack.add(new Integer(1));
		} catch (StackFullException e) {
			fail(e.printException());
		}
		testStack.printAllElements();
	}

	@Test
	public void testRemoveElement() {
		try {
			testStack.add(new Integer(5));
		} catch (StackFullException e1) {
			fail(e1.printException());
		}
		testStack.printAllElements();
		try {
			testStack.remove();
		} catch (StackEmptyException e) {
			fail(e.printException());
		}
		testStack.printAllElements();
	}
}
